package com.ibm.trainingmarch25.Category;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Category {

	
	
	private String expensecategory;
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	public String getExpensecategory() {
		return expensecategory;
	}

	public void setExpensecategory(String expensecategory) {
		this.expensecategory = expensecategory;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Category( String expensecategory, Integer id) {
		super();
		this.expensecategory = expensecategory;
		this.id = id;
	}

	public Category() {
		super();
	}

	@Override
	public String toString() {
		return "Category [expensecategory=" + expensecategory + ", categoryid=" + id + "]";
	}
	
	

	
}
