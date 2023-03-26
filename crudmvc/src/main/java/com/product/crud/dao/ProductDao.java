package com.product.crud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.product.crud.model.Product;
import com.product.crud.service.ServiceDao;



@Component
public class ProductDao implements ServiceDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
    
	@Transactional
	public void createProduct(Product product) {

		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	public List<Product> getAllProduct(){
		
		
		List<Product> products=this.hibernateTemplate.loadAll(Product.class);
		return  products;
	}
	
	@Transactional
	public void deleteProduct(int pid) {
		
		Product p=this.hibernateTemplate.load(Product.class,pid);
		System.out.println("this is delete product");
		this.hibernateTemplate.delete(p);
		
		
		
	}
	public Product getProduct(int pid) {
		
		
		Product p=this.hibernateTemplate.load(Product.class,pid);
		
	
		return p;
			}

}
