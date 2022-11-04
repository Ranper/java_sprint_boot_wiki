package com.peiran.wiki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WikiApplication {

	public static void main(String[] args) {
		System.out.println("hello world! -- by peiran");
		SpringApplication.run(WikiApplication.class, args);
	}

}
