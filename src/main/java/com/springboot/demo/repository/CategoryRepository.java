package com.springboot.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
