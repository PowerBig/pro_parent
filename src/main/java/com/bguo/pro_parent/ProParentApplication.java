package com.bguo.pro_parent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = {RedisAutoConfiguration.class,MongoAutoConfiguration.class})
@ComponentScan(basePackages = {"com.bguo"})
public class ProParentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProParentApplication.class, args);
    }




}
