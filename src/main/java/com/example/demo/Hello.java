package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/2/27.
 */
@RestController
public class Hello {
    @RequestMapping(value = "")
    public String say(){
        return "Hello SpringBootApplication!";
    }

}
