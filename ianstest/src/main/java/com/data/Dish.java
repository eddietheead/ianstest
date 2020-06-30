package com.data;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity

public class Dish {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	private float price;

	private boolean vegetarian;
	private boolean gluten;
	private int serves;

	public boolean getVegetarian() {
		return this.vegetarian;
	}

	public boolean getGluten() {
		return this.gluten;
	}

}
