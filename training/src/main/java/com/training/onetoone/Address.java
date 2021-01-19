package com.training.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	private String addressCity;
	private String addressState;
	@OneToOne(mappedBy = "address")
	private User user;
	
	
	public void setAddressCity(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setAddressState(String string) {
		// TODO Auto-generated method stub
		
	}

}
