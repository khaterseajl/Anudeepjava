package cake1.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cake1.DTO.CustomerDTO;
import cake1.Service1.CustomerService;
import cake1.enities.Customer;
import cake1.repositorys.CustomerRepository;


@Service
public class Customerimpl implements CustomerService {

	@Autowired
	CustomerRepository cst;
	
	@Override
	public Customer createCustomer(CustomerDTO cd) {
	Customer cs=Customer.builder()
			.crname(cd.getCrName())
			.crcontact(cd.getCrContact())
			.crcity(cd.getCrCity())
			.craddress(cd.getCrAddress()).build();
		return cst.save(cs);
	}

	@Override
	public Customer getCustomer(int id) {
		
		return cst.findById(id).get();
	}

	@Override
	public List<Customer> getAllCustomers() {
	
		return cst.findAll();
	}

	@Override
	public String deleteCustomer(int id) {
		cst.deleteById(id);
		
		return "Customer successfully deleted..";
	}

	@Override
	public String updateCustomer(int id, CustomerDTO cd) {
		Customer cs=cst.findById(id).get();
		
		Customer cs1=Customer.builder()
				.crname(cd.getCrName())
				.crcontact(cd.getCrContact())
				.crcity(cd.getCrCity())
				.craddress(cd.getCrAddress()).build();
		      cst.save(cs1);
		return "Customer successfully updated..";
	}

	@Override
	public Customer updateCustomerName(int id, String name) {
		Customer cs=cst.findById(id).get();
		cs.setCrname(name);
		return cst.save(cs);
	}

	@Override
	public String deleteAllCustomers() {
		cst.deleteAll();
		return "Customers successfully deleted..";
	}

}
