package com.cg.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		
		Department department=new Department();
		department.setId(101);
		department.setName("Krishna");
		
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("Radha");
		employee.setSalary(50000);
		
		department.addEmployee(employee);
		
		manager.persist(department);
		manager.getTransaction().commit();
		
		System.out.println("One Employee details are added to manager");
		   
		   manager.close();
		   factory.close();
		  
	}

}
