package com.basic;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootstrapApp {
    public static void main(String[] args) {

        SpringApplication.run(BootstrapApp.class,args);

        System.out.println("Hello world!");
    }
}