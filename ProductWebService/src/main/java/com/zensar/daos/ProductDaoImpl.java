package com.zensar.daos;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.zensar.entities.Product;
/**
 * @author Gayatri Sinnarkar
 * @creation_date 4th October 2019 10:25AM
 * @modification_date 4th October 2019 10:25AM
 * @version 1.0
 * @copyright Zensar technologies. All rights reserved
 * @description It is Dao class of product
 * 				It is use in persistent layer
 * 				It represents database table PRODUCT
 * 		
 *
 */
public class ProductDaoImpl implements ProductDao 
{
	private Session session;
	public ProductDaoImpl() 
	{
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		session = f.openSession();		
	}
	@Override
	public List<Product> getAll() 
	{
		
		return session.createQuery("from Product").getResultList();
	}

	@Override
	public Product getById(int productId) 
	{
		    return session.get(Product.class, productId);
	}

	@Override
	public void insert(Product product) 
	{
			Transaction t= session.beginTransaction();
			session.save(product);
			t.commit();			
	}

	@Override
	public void update(Product product) 
	{
		    Transaction t = session.beginTransaction();
		    session.update(product);
		    t.commit();
	}

	@Override
	public void delete(Product product)
	{
		   Transaction t = session.beginTransaction();
		   session.delete(product);
		   t.commit();
	}

}
