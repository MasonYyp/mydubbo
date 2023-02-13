package com.mason.duconsumer.service;

import com.mason.ducommon.service.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;


@Service
public class TestServiceRequest {

    @DubboReference
    private TestService testService;

    public String getInfo() {
        return this.testService.getInfo(" -- Hello Dubbo");
    }
}
