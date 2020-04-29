package com.dustin.BookApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.duyang.spring.repositoriy")
public class BookApiApplication {


	public static void main(String[] args) {
		SpringApplication.run(BookApiApplication.class, args);
	}

}
