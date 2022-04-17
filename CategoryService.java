package com.ibm.trainingmarch25.Category;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.trainingmarch25.Expense.Expense;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryrepo;

	public List<Category> getAllCategories() {
		
		return (List<Category>) categoryrepo.findAll();
	}

	public void addNewCategory(Category thecategory) {
		categoryrepo.save(thecategory);
		
	}
	
	Optional<Category> getCategoryById(int id)
	{
		return categoryrepo.findById(id);
	}
	
	void deleteCategory(Integer id)
	{
		categoryrepo.deleteById(id);
	}
}
