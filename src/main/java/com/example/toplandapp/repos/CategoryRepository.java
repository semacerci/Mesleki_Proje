package com.example.toplandapp.repos;

import com.example.toplandapp.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category,Long> {


}
