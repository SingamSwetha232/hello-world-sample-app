package com.javatpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootHelloWorldExampleApplication extends SpringBootServletInitializer
{
public static void main(String[] args) 
{
SpringApplication.run(SpringBootHelloWorldExampleApplication.class, args);
}
}