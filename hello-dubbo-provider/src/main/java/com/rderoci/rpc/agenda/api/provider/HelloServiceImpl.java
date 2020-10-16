package com.rderoci.rpc.agenda.api.provider;

import com.rderoci.rpc.agenda.api.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        return "Hello "+name;
    }

}
