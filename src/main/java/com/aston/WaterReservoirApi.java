package com.aston;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class WaterReservoirApi {
    public static void main(String[] args) {
        SpringApplication.run(WaterReservoirApi.class, args);
    }
}
