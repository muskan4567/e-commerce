package com.mycompany.mycart.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mycompany.mycart.entities.product;
/**
 *
 * @author khush
 */
public class ProductDao {
    
    private SessionFactory factory;

	public ProductDao(SessionFactory factory) {
		this.factory = factory;
	}
		
	
	
	public boolean saveProduct(product product)
	{
		boolean f=false;
		
		try {
			
			Session session= this.factory.openSession();
			Transaction tx=session.beginTransaction();
			
			session.save(product);
			f=true;
			
			
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			f=false;
		}
		return f;
	}
	
	
	//get all products
	
	
	public List<product> getAllProducts()
	{
	 Session s=	this.factory.openSession();
	 Query query =s.createQuery("from Product");
	 List<product> list=query.list();
	 return  list;

	}
	
	//get all products of given category
	public List<product> getAllProductsById(int cid)
	{
	 Session s=	this.factory.openSession();
	 Query query =s.createQuery("from Product as p where p.category.categoryId=:id");
	 query.setParameter("id", cid);
	 List<product> list=query.list();
	 return  list;

	}
	
	
	
    
}
