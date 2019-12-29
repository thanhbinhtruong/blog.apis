package com.thanhbinhtruong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thanhbinhtruong.entity.Category;
import com.thanhbinhtruong.repository.CategoryRepository;
 
@Service
public class CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll() {
		List<Category> rs = categoryRepository.findByOrderByOrdersAsc();
		return rs;
	}
	public Category save(Category category) {
		categoryRepository.save(category);
		return category;
	}
	
	public void delete(long[] ids) {
		for(long item: ids) {
			categoryRepository.deleteById(item);
		}	
	}
	
	public Category findById(long id) {
		return categoryRepository.findById(id).get();
	}
}
