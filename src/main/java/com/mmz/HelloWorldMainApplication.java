package com.mmz; /**
 * @author : mengmuzi
 * create at:  2019-06-21  18:11
 * @description:  编写一个主程序；启动Spring Boot应用
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个SpringBoot应用
 *
 * */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        //Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);

    }


}
