package com.rderoci.rpc.agenda.api.consumer;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@DubboComponentScan(basePackages = "com.rderoci.rpc.agenda.api.consumer")
public class HelloConsumerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HelloConsumerApplication.class)
                .run(args);
    }
}
