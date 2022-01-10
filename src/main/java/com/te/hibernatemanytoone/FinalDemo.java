package com.te.hibernatemanytoone;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate.Boy;

public class FinalDemo {
	public static void main(String[] args, List<Boy> listOfBoys) {

		Girl1 girl1 = new Girl1();
		girl1.setGid(420);
		girl1.setName("Ash");

		Boy1 boy1 = new Boy1();
		boy1.setBid(1);
		boy1.setName("vicek");
		boy1.setBalance(100000);

		Boy1 boy2 = new Boy1();
		boy2.setBid(2);
		boy2.setName("abhi");
		boy2.setBalance(60000);

		List<Boy1> listOfBoys1=Arrays.asList(boy1,boy2);
		girl1.setBoys(listOfBoys1);
		

		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("data");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(boy1);
		createEntityManager.persist(boy2);
		createEntityManager.persist(girl1);
		transaction.commit();

	}
}
