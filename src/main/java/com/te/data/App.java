
package com.te.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Employee employee = new Employee();
		employee.setEid(1);
		employee.setName("Bhushan");
		employee.setSalary(500000);
		employee.setDesignation("Full Stack Developer");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("data");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(employee);
//		System.out.println(employee);
		transaction.commit();
	}
}
