//package com.rderoci.rpc.agenda.api.consumer.config;
//
//import org.apache.dubbo.config.ApplicationConfig;
//import org.apache.dubbo.config.ConsumerConfig;
//import org.apache.dubbo.config.RegistryConfig;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class DubboConfig {
//
//    @Bean
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("hello-consumer");
//        return applicationConfig;
//    }
//
//    @Bean
//    public ConsumerConfig consumerConfig() {
//        ConsumerConfig consumerConfig = new ConsumerConfig();
//        consumerConfig.setTimeout(8000);
//        return consumerConfig;
//    }
//
//    @Bean
//    public RegistryConfig registryConfig() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress("N/A");
//        return registryConfig;
//    }
//}
