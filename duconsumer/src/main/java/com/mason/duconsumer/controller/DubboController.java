package com.mason.duconsumer.controller;

import com.mason.duconsumer.service.TestServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class DubboController {

    @Autowired
    private TestServiceRequest testServiceRequest;

    @RequestMapping("/getdata")
    public String getData(){
        return this.testServiceRequest.getInfo();
    }

}
