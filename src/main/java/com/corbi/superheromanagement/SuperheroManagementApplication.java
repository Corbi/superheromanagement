package com.corbi.superheromanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.corbi.superheromanagement.dao")
public class SuperheroManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperheroManagementApplication.class, args);
	}

}
