package com.duyi.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;



@Data
@ConfigurationProperties(prefix = "food")
@Configuration
public class FoodConfig {
    private String meat;
    private String rice;
    private String[] sauce;
}
