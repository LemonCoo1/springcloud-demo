package com.xc.eurekaclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@RestController
@Slf4j
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(EurekaClientApplication.class);
        springApplication.addListeners(new ApplicationPidFileWriter());
        springApplication.run(args);
    }

    @Value("${server.port}")
    String port;

    @Value("${eureka.instance.ip-address}")
    String ipAddress;

    @GetMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        log.info("hi",name);
        return "hi " + name + " ,i am from ipAddress:" + ipAddress + " port:" + port;
    }

}
