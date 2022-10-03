package com.luffykaiyuan.shvideo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ShVideoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShVideoApplication.class, args);
    }

}
