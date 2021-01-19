package com.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.onetoone.Address;
import com.training.onetoone.User;

@SpringBootApplication
public class TrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingApplication.class, args);
		System.out.println("Welcome to squad-4 Mapping demo");
		
		User user1=new User();
		User user2=new User();
	
		user1.setUserName("Karthick");
		user2.setUserName("Sampath");
		Address address1=new Address();
		Address address2=new Address();
		address1.setAddressCity("Trichy");
		address1.setAddressState("Tamil Nadu");
		address2.setAddressCity("Vijayawada");
		address2.setAddressState("Andhra Pradesh");
		
		user1.setAddress(address1);
		user2.setAddress(address2);
		
	/*SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	session.save(user1);
	session.save(user2);
	session.getTransaction().commit();
	session.close();*/
	}

}
