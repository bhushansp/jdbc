package com.te.liquor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App_2 {
	public static void main(String[] args) {
		DesiDaru desiDaru = new DesiDaru();
		desiDaru.setName("Old Monk");
		desiDaru.setPrice(650);
		desiDaru.setQuantity("750 ml");
		
		DesiDaru desiDaru2 = new DesiDaru();
		desiDaru2.setName("Teachers");
		desiDaru2.setPrice(1300);
		desiDaru2.setQuantity("1 liter");
		
		DesiDaru desiDaru3 = new DesiDaru();
		desiDaru3.setName("Black Dog");
		desiDaru3.setPrice(1400);
		desiDaru3.setQuantity("750 ml");
		
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("da");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(desiDaru);
		createEntityManager.persist(desiDaru2);
		createEntityManager.persist(desiDaru3);
		transaction.commit();
		
		
	}
	
}
