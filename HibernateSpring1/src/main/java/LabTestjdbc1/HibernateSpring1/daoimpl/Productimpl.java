package LabTestjdbc1.HibernateSpring1.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import LabTestjdbc1.HibernateSpring1.dao.Productdao;
import LabTestjdbc1.HibernateSpring1.entities.Product;

public class Productimpl implements Productdao{

	private HibernateTemplate ht; //get object of hibernate template

	// To insert record of Product
	@Override
	@Transactional
	public int insertProdcut(Product pd) {
		 ht.save(pd); 
		return 1;
	}

	// To update record of product
	@Override
	@Transactional
	public int updateProduct(Product pd) {
		ht.update(pd);
		return 0;
	}

	// To delete record of product
	@Override
	@Transactional
	public int deleteProduct(Product pd) {
		ht.delete(pd);
		return 0;
	}

	// To get specific record of product
	@Override
	@Transactional
	public Product getProduct(int pid) {
		Product p=ht.get(Product.class, getClass());
		return p;
	}

	// To get all records of products
	@Override
	@Transactional
	public List<Product> getAllProducts() {
		List <Product> plist=ht.loadAll(Product.class);
		return plist;
	}
	
	
}
