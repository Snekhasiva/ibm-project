package com.ibm.trainingmarch25.Expense;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.ibm.trainingmarch25.Category.Category;
import com.ibm.trainingmarch25.User.User;

@Entity
public class Expense {

	private String description;
	
	private String location;
	
	private long amount;
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Category category;

	@ManyToOne
	private User user;


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Expense()
	{
		
	}
	

public Expense(String description, String location, int id, int CategoryId, int UserId) {
	
	this.description = description;
	this.location = location;
	this.id = id;
	this.category = new Category("",CategoryId);
	this.user = new User("","","",UserId);
}

@Override
public String toString() {
	return "Expense [description=" + description + ", location=" + location + ", amount=" + amount + ", expenseid=" + id + "]";
}



	
}
