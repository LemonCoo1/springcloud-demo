package com.xc.servicefeign.controller;

import com.xc.servicefeign.service.SchedualServiceHi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xucong
 * @date 2018/11/22
 */
@RestController
@Slf4j
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        log.info("hi {}",name);
        return schedualServiceHi.sayHiFromClientOne(name) + ",feign";
    }
}
