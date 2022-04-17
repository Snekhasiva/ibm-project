package com.ibm.trainingmarch25.Expense;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

	@Autowired
	ExpenseRepository expenserepo;


	public List<Expense> getAllExpenses() {
		return  (List<Expense>) expenserepo.findAll();
	}

	public List<Expense> getExpensesByCategory(int categoryId) {
		return expenserepo.findByCategoryId(categoryId);
	}
	
	public List<Expense> getExpensesByUser(int userId) {
		return expenserepo.findByUserId(userId);
	}

	public void addNewExpense(Expense theexpense) {
		expenserepo.save(theexpense);
		
	}

	void updateExpense(Expense theexpense)
	{
		expenserepo.save(theexpense);
	}
	
	void deleteExpense(int id)
	{
		expenserepo.deleteById(id);
	}

}
  