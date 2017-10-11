package com.cd.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }

    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                          @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);

        return girlRepository.save(girl);
    }

    @GetMapping(value = "/girls/{id}")
    public Girl getGirl(@PathVariable("id") Integer id) {
        return girlRepository.findOne(id);
    }

    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlList(@PathVariable("age") Integer age) {
        return girlRepository.findByAge(age);
    }
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        girl.setId(id);
        return girlRepository.save(girl);
    }

    @DeleteMapping(value = "/girls/{id}")
    public void deleteGirl(@PathVariable("id") Integer id) {
        girlRepository.delete(id);
    }

}
