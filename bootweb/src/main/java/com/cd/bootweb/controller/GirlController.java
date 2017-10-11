package com.cd.bootweb.controller;

import com.cd.bootweb.domain.Girl;
import com.cd.bootweb.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @PostMapping(value = "/girls")
    public Girl addGirl(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.print(bindingResult.getFieldError().getDefaultMessage());
        }
     return  girlRepository.save(girl);
    }

}
