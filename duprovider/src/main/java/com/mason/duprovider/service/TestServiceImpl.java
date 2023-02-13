package com.mason.duprovider.service;

import com.mason.ducommon.service.TestService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;


@DubboService
public class TestServiceImpl implements TestService {

    @Value("${server.port}")
    private String port;

    @Override
    public String getInfo(String message) {
        return "Service " + this.port + message;
    }
}
