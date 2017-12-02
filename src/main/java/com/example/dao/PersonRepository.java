package com.example.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.entity.Person;
import com.example.repositories.CustomRepository;

public interface PersonRepository extends JpaRepository<Person,Long>{
	List<Person> findByAddress(String address);
	Person findByNameAndAddress(String name, String address);
	@Query("select p from Person p where p.name=:name and p.address=:address")
	Person withNameAndAddressQuery(@Param("name")String name, @Param("address")String address);
	
	List<Person> withNameAndAddressNamedQuery(String name,String address);
	
	@RestResource(path="nameStartsWith",rel="nameStartsWith")
	Person findByNameStartsWith(@Param("name")String name);
	
}
