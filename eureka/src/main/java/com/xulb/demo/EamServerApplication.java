
package com.xulb.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EamServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EamServerApplication.class, args);
    }
}
