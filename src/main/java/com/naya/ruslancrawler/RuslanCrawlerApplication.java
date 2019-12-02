package com.naya.ruslancrawler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Map;

@SpringBootApplication
@EnableConfigurationProperties(SitesProperties.class)
@EnableScheduling
public class RuslanCrawlerApplication {

//    @Value("${sites}")
//    private Map<String,String> sites;



    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RuslanCrawlerApplication.class, args);
        System.out.println();
    }

}
