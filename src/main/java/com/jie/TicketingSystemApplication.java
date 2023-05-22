package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jie
 */
@SpringBootApplication
public class TicketingSystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(TicketingSystemApplication.class, args);
        System.out.println("Springboot 成功启动！");
    }

}
