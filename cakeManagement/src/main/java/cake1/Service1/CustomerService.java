package cake1.Service1;

import java.util.List;

import org.springframework.stereotype.Component;

import cake1.DTO.CakeDTO;
import cake1.DTO.CustomerDTO;
import cake1.enities.Cake;
import cake1.enities.Customer;

@Component
public interface CustomerService {

	public Customer createCustomer(CustomerDTO cd);
	public Customer getCustomer(int id);
	public List<Customer>getAllCustomers();
	public String deleteCustomer(int id);
	public String updateCustomer(int id, CustomerDTO cd);
	public Customer updateCustomerName(int id, String name);
	public String deleteAllCustomers();
}
