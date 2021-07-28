package com.nareshit.repository;

import org.springframework.data.repository.CrudRepository;

import com.nareshit.domain.Product;

public interface IProductRepository extends CrudRepository<Product, Integer> {

}
