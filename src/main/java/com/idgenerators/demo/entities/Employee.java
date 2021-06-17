package com.idgenerators.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Employee {
	
//	// for ID generation : GenerationType.Table
//	@TableGenerator(name="employee-gen", table = "gen_id", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 100)
//	@Id
//	@GeneratedValue(strategy=GenerationType.TABLE, generator = "employee-gen")
//	
	// Automatically Increment value of ID
//	//@GeneratedValue(strategy=GenerationType.IDENTITY)

	
	//For Custom Id generator:Congigure Custom ID generator: will generate random no in ID column
	@GenericGenerator(name = "emp_id", strategy="com.idgenerators.demo.idgenerators.RandomCustomeIdGenerators")
	@GeneratedValue(generator = "emp_id")
	@Id
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
