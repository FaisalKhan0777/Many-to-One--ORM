package com.mapping.hibernate_many_to_one_mapping.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class College {
	
	
	
	@Id
	private int id ;
	private String name ;
	@Column(name = "collegetype")
	
	private String type ;
	private String email ;
	private String address ;
	

	@ManyToOne
	@JoinColumn(name = "UiD")  // use to change coloum name foregion Key
	private University university ;

	

}
