package com.rderoci.rpc.agenda.api.consumer;

import com.rderoci.rpc.agenda.api.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

    @DubboReference(version = "1.0.0", url = "dubbo://RUC0M3RUA3:12345")
    private HelloService helloService;

    @GetMapping(path = "/sayHello")
    public String sayHello(@RequestParam("name") String name) {
        return helloService.sayHello(name);
    }
}
