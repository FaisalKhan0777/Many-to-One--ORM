package com.mapping.hibernate_many_to_one_mapping.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class University {
	
	
	
	@Id
	private int id ;
	private String name ;
	private String address ;
	
	
	public University(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	


}
