package com.example.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name="Person.withNameAndAddressNamedQuery",
query="select p from Person p where p.name=?1 and address=?2")
public class Person implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private Integer age;
	
	private String address;
	
	public Person() {
		super();
	}
	
	public Person(Long id,String name,Integer age, String address) {
		super();
		this.id=id;
		this.age=age;
		this.name=name;
		this.address=address;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age=age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
}
