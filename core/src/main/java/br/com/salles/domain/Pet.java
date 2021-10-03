package br.com.salles.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Pet {

	@Id
	@SequenceGenerator(name="PET_SEQ",
      sequenceName="PET_SEQ",
      allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="PET_SEQ")
	private Long id;
	
	@Column(precision = 200)
	private String name;
	
	
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pet(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
		
}
