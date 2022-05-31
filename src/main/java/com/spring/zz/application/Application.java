/**
 * @author zz
 * 启动类
 */

package com.spring.zz.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans(value = { @ComponentScan(value = "com.spring.zz.controller") })
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
