package com.example.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.domains.Category;


public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {

}
