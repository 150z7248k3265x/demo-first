package com.example.demofirst;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @RequestMapping(value="hello",method= RequestMethod.GET)
    public String sayHello(){

        System.out.println("this is my first project");
        System.out.println("434234234");
        return "hello world";
    }

}
