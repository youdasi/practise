package com.cd.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWordController {


    @RequestMapping(value = {"/hello"}, method = RequestMethod.GET)
    public String hello(@RequestParam(value = "id",required = false,defaultValue = "20") Integer id) {
        return id.toString();
    }
}
