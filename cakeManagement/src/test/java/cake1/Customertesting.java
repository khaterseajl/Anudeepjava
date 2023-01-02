package cake1;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;

import cake1.enities.Customer;
import cake1.repositorys.CustomerRepository;

public class Customertesting {

	@Autowired
	private CustomerRepository ctrepo;
	
	@Test
	@DisplayName("it should create object of customer")
	void createcustomer()
	{
		Customer ct=Customer.builder()
				.crid(11)
				.crname("riva")
				.crcontact("798605483")
				.crcity("Venius")
				.craddress("xyz").build();
		ctrepo.save(ct);
		
		assertNotNull(ctrepo.findById(11).get());
	}
	
	@Test
	@DisplayName("it should get customer by its id")
	void getcustomerbyid()
	{
		Customer ct=Customer.builder()
				.crid(19)
				.crname("kameroon")
				.crcontact("8798605483")
				.crcity("Bijing")
				.craddress("vvyz").build();
		ctrepo.save(ct);
		
		Customer cnew=ctrepo.findById(ct.getCrid()).get();
	   assertNotNull(cnew);
	   
	   assertEquals("kameroon",cnew.getCrname());
	}
}
