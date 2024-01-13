package com.awstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = "com.awstest")
@EnableScheduling
public class AwsTestApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(AwsTestApplication.class, args);
    }

}
