package com.zensar.services;
import java.util.List;
import com.zensar.entities.Product;

/**
 * @author Gayatri Sinnarkar
 * @creation_date 4th October 2019 11:40AM
 * @modification_date 4th October 2019 11:40AM
 * @version 1.0
 * @copyright Zensar technologies. All rights reserved
 * @description It is ProductService interface
 * 				It is use in Business layer
 * 	
 */
public interface ProductService 
{
	List<Product> findAllProducts();
	Product findProductById(int ProductId);
	void add(Product product);
	void update(Product product);
	void remove(Product product);
	List<Product> findProductsByPriceRange(float min,float max);
	List<Product> findProductByName(String name);
	List<Product> findProductByBrand(String brand);
	long getProductCount();
	
}
