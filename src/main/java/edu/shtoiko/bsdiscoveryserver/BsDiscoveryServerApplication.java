package edu.shtoiko.bsdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BsDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BsDiscoveryServerApplication.class, args);
    }

}
