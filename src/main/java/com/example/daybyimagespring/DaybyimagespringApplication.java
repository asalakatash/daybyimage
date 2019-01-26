package com.example.daybyimagespring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DaybyimagespringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaybyimagespringApplication.class, args);
	}
	@Bean
    CommandLineRunner runner(){
      return args -> {
    	  
      };
}
}

