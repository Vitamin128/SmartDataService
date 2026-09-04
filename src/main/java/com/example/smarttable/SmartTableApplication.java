package com.example.smarttable;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
@Slf4j
@RefreshScope
public class SmartTableApplication {
    public static void main(String[] args) {
        try {
            ConfigurableApplicationContext context =
                    SpringApplication.run(SmartTableApplication.class, args);
            Environment environment = context.getEnvironment();

            String algorithm = environment.getProperty(
                    "spring.application.name"
            );

            System.out.println(
                    "bootstrap配置：" + algorithm
            );
        }catch (Exception e) {
            log.error("spring boot error", e);
        }
    }
}