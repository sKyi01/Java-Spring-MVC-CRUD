package com.product.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.crud.model.Product;

@Service
public interface ServiceDao {
	public void createProduct(Product product);
	public List<Product> getAllProduct();
	public void deleteProduct(int pid);
	public Product getProduct(int pid);
}
