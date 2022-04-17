package com.ibm.trainingmarch25.Expense;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Integer> {

	List<Expense> findByCategoryId(int categoryId);

	List<Expense> findByUserId(int userId);

}
