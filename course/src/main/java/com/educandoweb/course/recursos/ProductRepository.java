package com.educandoweb.course.recursos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
