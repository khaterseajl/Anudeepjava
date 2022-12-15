package LabTestjdbc1.HibernateSpring1.dao;

import java.util.List;

import LabTestjdbc1.HibernateSpring1.entities.Customer;

public interface Customerdao {

	public int insertCustomer(Customer cr); //insert method

	public int updateCustomer(); //update method

	public int deleteCustomer(Customer cr); //delete method

	public Customer getCustomer(int cid);  //get method

	public List<Customer> getAllCustomers(); //get all method
}
