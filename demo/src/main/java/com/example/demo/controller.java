package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName controller
 * @Description TODO
 * @Author mars.zhang@beyonds.com
 * @Date 2020/10/10 17:24
 * @Version 1.0
 */
@RestController
@RequestMapping("/helloMoto")
public class controller {

    @RequestMapping
    public String helloWorld(){
        return "哈哈哈哈";
    }

    @RequestMapping("/xixi")
    public String xixihaha(String name){
        return "xixi:"+name;
    }

}
