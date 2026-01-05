package org.example.configservicee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceeApplication.class, args);
    }

}
