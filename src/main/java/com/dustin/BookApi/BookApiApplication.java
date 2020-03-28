package com.dustin.BookApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.duyang.spring.repositoriy")
@ComponentScan("com.duyang.spring.controller")
public class BookApiApplication {


	public static void main(String[] args) {

		System.out.println("sdfasdf");

		SpringApplication.run(BookApiApplication.class, args);
	}

}
