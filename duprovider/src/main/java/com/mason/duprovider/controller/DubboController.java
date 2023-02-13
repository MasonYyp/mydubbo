package com.mason.duprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class DubboController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getdata")
    public String getData(){
        return "Dubbo " + this.port;
    }
}
