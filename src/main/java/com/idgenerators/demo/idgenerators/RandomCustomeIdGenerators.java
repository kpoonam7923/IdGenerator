package com.idgenerators.demo.idgenerators;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class RandomCustomeIdGenerators implements IdentifierGenerator {

	@Override
	
	//The obj represents the Employee(Employee.java) entity in this case and at the end of it it needs to return a value
	//which will be used as an ID
	
	public Serializable generate(SharedSessionContractImplementor se, Object obj) throws HibernateException {
		// this method we can implement our custom logic
		
		Random random = null;
		int id = 0;
		random = new Random();
		id = random.nextInt(1000000); //use for Id
		
		return id;
	}

}
