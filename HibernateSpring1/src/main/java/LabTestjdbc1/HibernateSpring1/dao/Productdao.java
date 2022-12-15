package LabTestjdbc1.HibernateSpring1.dao;

import java.util.List;

import LabTestjdbc1.HibernateSpring1.entities.Product;

public interface Productdao {

	public int insertProdcut(Product pd); //insert product

	public int updateProduct(Product pd); //update product

	public int deleteProduct(Product pd); //delete product

	public Product getProduct(int pid); //get product

	public List<Product> getAllProducts(); //getall product
}
