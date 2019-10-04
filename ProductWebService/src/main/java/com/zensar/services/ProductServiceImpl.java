package com.zensar.services;
import java.util.ArrayList;
import java.util.List;
import com.zensar.daos.ProductDao;
import com.zensar.daos.ProductDaoImpl;
import com.zensar.entities.Product;

public class ProductServiceImpl implements ProductService 
{
	private ProductDao productDao;
	public ProductServiceImpl() 
	{
		productDao = new ProductDaoImpl();
	}
	@Override
	public List<Product> findAllProducts() 
	{
		
		return productDao.getAll();
	}

	@Override
	public Product findProductById(int productId) 
	{
		return productDao.getById(productId);
	}

	@Override
	public void add(Product product) 
	{
		productDao.insert(product);
	}

	@Override
	public void update(Product product) 
	{		
		productDao.update(product);
	}
	@Override
	public void remove(Product product) 
	{
		productDao.delete(product);
	}

	@Override
	public List<Product> findProductsByPriceRange(float min, float max) 
	{
		List<Product> productByRange = new ArrayList<Product>();
		List<Product> productAll = productDao.getAll();
		for(Product p :productAll)
		{
			if(p.getPrice()<=max && p.getPrice()>=min)
			{
				 productByRange.add(p);
			}
		}
		return productByRange;
		
	}

	@Override
	public List<Product> findProductByName(String name) 
	{
		List<Product> productByName = new ArrayList<Product>();
		List<Product> productAll = productDao.getAll();
		for(Product p :productAll)
		{
			if(p.equals(name))
			{
				productByName.add(p);
			}
		}
		return productByName ;
		
	}

	@Override
	public List<Product> findProductByBrand(String brand) 
	{
		List<Product> productByBrand = new ArrayList<Product>();
		List<Product> productAll = productDao.getAll();
		for(Product p :productAll)
		{
			if(p.equals(brand))
			{
				productByBrand.add(p);
			}
		}
		return productByBrand;
	}

	@Override
	public long getProductCount() 
	{
		List<Product> productCount = new ArrayList<Product>();
		return (long)(productCount.size());
	}

}
