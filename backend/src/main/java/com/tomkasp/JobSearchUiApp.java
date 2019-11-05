package com.tomkasp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * @author Tomasz Kasprzycki
 */
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class JobSearchUiApp {
    public static void main(String[] args) {
        SpringApplication.run(JobSearchUiApp.class, args);
    }
}


