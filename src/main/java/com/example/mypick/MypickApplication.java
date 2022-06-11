package com.example.mypick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class MypickApplication {

	public static void main(String[] args) {
		SpringApplication.run(MypickApplication.class, args);
	}

}
