package com.food.ordering.system.order.service.domain;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableAutoConfiguration
//@ComponentScan("com.food.ordering.system.order.service.dataaccess")
@EnableJpaRepositories(basePackages = { "com.food.ordering.system.order.service.dataaccess" ,"com.food.ordering.system.dataaccess"})
@EntityScan(basePackages = { "com.food.ordering.system.order.service.dataaccess","com.food.ordering.system.dataaccess"})
@SpringBootApplication(scanBasePackages = "com.food.ordering.system",exclude={DataSourceAutoConfiguration.class})
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
