package com.rderoci.rpc.agenda.api.provider;


import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@DubboComponentScan(basePackages = "com.rderoci.rpc.agenda.api.provider")
public class HelloProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HelloProviderApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

}
