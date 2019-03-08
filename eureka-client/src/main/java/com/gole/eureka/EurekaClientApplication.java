package com.gole.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(EurekaClientApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
        logger.info("ヾ(◍°∇°◍)ﾉﾞEurekaClientApplication启动成功ヾ(◍°∇°◍)ﾉﾞ");
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
