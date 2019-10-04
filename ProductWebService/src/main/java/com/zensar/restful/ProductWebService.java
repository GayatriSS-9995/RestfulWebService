package com.zensar.restful;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.zensar.entities.Product;
import com.zensar.services.ProductService;
import com.zensar.services.ProductServiceImpl;

/**
 * @author Gayatri Sinnarkar
 * @creation_date 4th October 2019 02:05PM
 * @modification_date 4th October 2019 2:05PM
 * @version 1.0
 * @copyright Zensar technologies. All rights reserved
 * @description It is WebService class
 * 				It represents database table PRODUCT
 * 		
 *
 */
@Path("/products")
public class ProductWebService
{
	private ProductService productService;
	public ProductWebService() 
	{
		productService = new ProductServiceImpl();
	}
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Product> getAll()
	{
		return productService.findAllProducts();
	}

}
