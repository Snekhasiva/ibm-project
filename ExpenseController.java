package com.ibm.trainingmarch25.Expense;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.trainingmarch25.Category.Category;
import com.ibm.trainingmarch25.User.User;

@RestController
public class ExpenseController {

	@Autowired
	ExpenseService expenseservice;
	
	//getting all expenses
	@GetMapping("/expense")
	List<Expense> getAllExpenses()
	{
		return expenseservice.getAllExpenses();
	}
	
	
	//getting expenses under particular category
	@GetMapping("/expense/categoryId/{CategoryId}")
	List<Expense> getExpensesByCategory(@PathVariable int CategoryId)
	{
		return expenseservice.getExpensesByCategory(CategoryId);
	}
	
	//getting expenses for a particular user
		@GetMapping("/expense/userId/{UserId}")
		List<Expense> getExpensesByUser(@PathVariable int UserId)
		{
			return expenseservice.getExpensesByUser(UserId);
		}
	
	@PostMapping("/expense/categoryId/{categoryId}")
	void addNewExpense(@RequestBody Expense theexpense, @PathVariable int categoryId, @PathVariable int userId)
	{
		theexpense.setCategory(new Category("", categoryId));
		theexpense.setUser(new User("","","",userId));
		expenseservice.addNewExpense(theexpense);
	}
	
	@PutMapping("/expense/{id}/categoryId/{categoryId}/userId/{userId}")
	void updateExpense(@RequestBody Expense theexpense, @PathVariable int categoryId, @PathVariable int id, @PathVariable int userId)
	{
		theexpense.setCategory(new Category("", categoryId));
		theexpense.setUser(new User("","","",userId));
		expenseservice.updateExpense(theexpense);
	}
	
	@DeleteMapping("/expense/{id}")
	void deleteExpense(@PathVariable int id)
	{
		expenseservice.deleteExpense(id);
	}
}
