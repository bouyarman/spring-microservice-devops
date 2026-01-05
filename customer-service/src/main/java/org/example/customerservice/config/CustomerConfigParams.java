package org.example.customerservice.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "global.params")
public record CustomerConfigParams(int x, int y) {
}
