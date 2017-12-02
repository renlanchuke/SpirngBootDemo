package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.PersonRepository;
import com.example.dao.PersonSpecsRepository;
import com.example.entity.Person;
import com.example.repositories.CustomRepository;
//import com.example.repositories.CustomRepositoryFactoryBean;

@RestController
public class DataController {
	@Autowired
	private PersonSpecsRepository personSpecsRepository;
	@RequestMapping("/auto")
	public Page<Person> auto(Person person) {
		Page<Person> pagePeople = personSpecsRepository.findByAuto(person,new PageRequest(0, 10));
		return pagePeople;
	}
}
