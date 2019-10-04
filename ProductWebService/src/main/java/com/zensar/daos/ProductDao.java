package com.zensar.daos;
import java.util.List;
import com.zensar.entities.Product;

/**
 * @author Gayatri Sinnarkar
 * @creation_date 4th October 2019 10:08AM
 * @modification_date 4th October 2019 10:09AM
 * @version 1.0
 * @copyright Zensar technologies. All rights reserved
 * @description It is dao inteface
 * 				It is use in persistent layer
 * 				It represents database table PRODUCT
 * 		
 *
 */
public interface ProductDao
{
	List<Product> getAll();
	Product getById(int productId);
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
}
