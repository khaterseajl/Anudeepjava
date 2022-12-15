package LabTestjdbc1.HibernateSpring1.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import LabTestjdbc1.HibernateSpring1.dao.Customerdao;

import LabTestjdbc1.HibernateSpring1.entities.Customer;


public class Customerdaoimpl implements Customerdao {

	private HibernateTemplate ht; //get object of hibernate template

		// To insert record of Customer
		@Override
		@Transactional
		public int insertCustomer(Customer cr) {
			ht.save(cr);
			return 1;
		}
		
		// To update record of Customer
		@Transactional
		public int updateCustomer() {
			ht.update(ht);
			return 1;
			}

		// To delete record of Customer
		@Override
		@Transactional
		public int deleteCustomer(Customer cr) {
		  ht.delete(cr);
			return 1;
		}

		// To get specific records of Customer
		@Override
		@Transactional
		public Customer getCustomer(int cid) {
			Customer ct=ht.get(Customer.class, cid);
			return ct;
	
		}

		// To get all records of Customers
		@Override
		@Transactional
	  public List<Customer> getAllCustomers() {
			
         List<Customer> clist=ht.loadAll(Customer.class);
				return clist;
		
		}

}
