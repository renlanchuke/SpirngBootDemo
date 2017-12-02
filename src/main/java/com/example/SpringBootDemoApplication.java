package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.repositories.CustomRepositoryFactoryBean;


//import com.example.repositories.CustomRepositoryFactoryBean;


@EnableJpaRepositories(repositoryFactoryBeanClass=CustomRepositoryFactoryBean.class)
@SpringBootApplication
@EnableCaching
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootDemoApplication.class, args);
		
		
	}
}
