package com.ibm.trainingmarch25.Category;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.trainingmarch25.Expense.Expense;

@RestController
public class CategoryController {

	@Autowired
	CategoryService categoryservice;
	

	
	@GetMapping("/category")
	List<Category> getAllCategories()
	{
		return categoryservice.getAllCategories();
	}
	
	@PostMapping("/category")
	void addNewCategory(@RequestBody Category thecategory)
	{
		categoryservice.addNewCategory(thecategory);
	}
//	
//	@GetMapping("/category/{id}")
//	Optional<Category> getCategoryById(@PathVariable int id)
//	{
//		return categoryservice.getCategoryById(id);
//	}
	
	@DeleteMapping("/category/{id}")
	void deleteCategory(Integer id)
	{
		categoryservice.deleteCategory(id);
	}
}
