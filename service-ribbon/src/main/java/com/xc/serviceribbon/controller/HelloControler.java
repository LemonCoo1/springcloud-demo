package com.xc.serviceribbon.controller;

import com.xc.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xucong
 * @date 2018/11/22
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;


    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name) + ",ribbon";
    }

}
