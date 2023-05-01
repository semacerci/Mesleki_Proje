package com.example.toplandapp.controllers;


import com.example.toplandapp.entities.Category;
import com.example.toplandapp.entities.Community;
import com.example.toplandapp.entities.User;
import com.example.toplandapp.service.CategoryServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

   private CategoryServices categoryServices;

    public CategoryController(CategoryServices categoryServices) {
        this.categoryServices = categoryServices;
    }

    @GetMapping
    public List<Category> getAllCategory(){
        return categoryServices.getAllCategory();
    }

    @GetMapping("/{categoryId}")
    public Category getOneCategory(@PathVariable Long categoryId) {
        return categoryServices.getOneCategory(categoryId);
    }


    @PostMapping
    public Category createOneCategory(@RequestBody Category newCategory){
        return categoryServices.createOneCategory(newCategory);
    }


    @PutMapping("/{categoryId}")
    public Category updateOneCategory(@PathVariable Long categoryId,@RequestBody Category newCategory){
        return categoryServices.updateOneUser(categoryId,newCategory);
    }

    @DeleteMapping("/{categoryId}")
    public void deleteOneCategory(@PathVariable Long categoryId){
       categoryServices.deleteOneCategory(categoryId);
    }


}
