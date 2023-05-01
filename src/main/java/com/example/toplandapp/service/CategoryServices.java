package com.example.toplandapp.service;


import com.example.toplandapp.entities.Category;

import com.example.toplandapp.repos.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {

    CategoryRepository categoryRepository;


    public CategoryServices(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }


    public Category getOneCategory(Long categoryId) {
        return categoryRepository.findById(categoryId).orElse(null);
    }


    public Category createOneCategory(Category newCategory) {
        return categoryRepository.save(newCategory);
    }


    public Category updateOneUser(Long categoryId, Category newCategory) {
        Optional<Category> category = categoryRepository.findById(categoryId);
        if (category.isPresent()) {
            Category foundCategory = category.get();
            foundCategory.setName(newCategory.getName());

            return categoryRepository.save(foundCategory);
        }
        else
            return null;
    }

    public void deleteOneCategory(Long categoryId) {
      categoryRepository.deleteById(categoryId);
    }
}
