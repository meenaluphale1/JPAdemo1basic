package com.lti.demo.JPAdemo1basic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientApp {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();

		// CRUD - Create ( insert ) , Retrieve (select ) , U Update , D Delete
		Student s1= new Student("Hanmant",90);
		System.out.println(s1);
		
		em.getTransaction().begin();
		em.persist(s1);
		System.out.println("record added ");
		em.getTransaction().commit();

		/*
		 * em.getTransaction().begin(); Student tempStu=em.find(Student.class, 101); //
		 * select System.out.println(tempStu); em.getTransaction().commit();
		 */

		/*
		 * tempStu.setScore(98); em.getTransaction().begin(); em.merge(tempStu);//
		 * update em.getTransaction().commit();
		 * 
		 * 
		 * em.getTransaction().begin(); em.remove(tempStu); // delete
		 * em.getTransaction().commit();
		 */

		em.close();

	}

}
