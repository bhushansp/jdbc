package com.te.hibernateonetomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		
		Aunty girl = new Aunty();
		girl.setGid(123);
		girl.setName("Ash");
		
		Uncle boy = new Uncle();
		boy.setBid(1);
		boy.setName("Vivek");
		boy.setBalance(50000);
		
		Uncle boy2 = new Uncle();
		boy2.setBid(2);
		boy.setName("Abhishekh");
		boy2.setBalance(1000000);
		
		List<Uncle> listOfBoys = Arrays.asList(boy,boy2);
		girl.setBoys(listOfBoys);
		
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("data");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(boy);
		createEntityManager.persist(boy2);
		transaction.commit();
	}
}
