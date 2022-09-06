package com.arcisAI.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private Integer id;
	private String name;
	private String address;
	private Integer pincode;
	
	public Student() {
		super();
	}

	public Student(Integer id, String name, String address, Integer pincode) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.pincode = pincode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", pincode=" + pincode + "]";
	}
	
	
	
}
