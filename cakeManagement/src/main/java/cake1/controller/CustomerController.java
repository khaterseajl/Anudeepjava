package cake1.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import cake1.DTO.CustomerDTO;

import cake1.Service1.CustomerService;

import cake1.enities.Customer;

import cake1.exception.UserNotFoundexception;

@RestController
public class CustomerController {

	@Autowired(required=true)
	CustomerService css;
	
	@PostMapping("/customer")
	public  ResponseEntity<Customer> createCustomer(@RequestBody @Valid CustomerDTO cd)
	{	  	
		Customer c=css.createCustomer(cd);
		if(c!=null)
			return new ResponseEntity<Customer>(c, HttpStatus.CREATED);
		
	   return new ResponseEntity<Customer>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/customer /{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable int id)
	{
		try {
			Customer c=css.getCustomer(id);
		if(c!=null)
			return new ResponseEntity<Customer>(c, HttpStatus.OK);
		}catch(Exception e)
		{		
	       throw new UserNotFoundexception("User not found");
		}
		 return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getCustomers()
	{
		try {
			List<Customer> clist=css.getAllCustomers();
			if(clist!=null)
				return new ResponseEntity<List<Customer>>(clist, HttpStatus.OK);
			}catch(Exception e)
			{		
		       e.printStackTrace();
			}
			 return new ResponseEntity<List<Customer>>(HttpStatus.NOT_FOUND);
		
	}
	
	@PutMapping("/customer/{id}")
	public ResponseEntity<String> updateCustomer(@PathVariable int id,@RequestBody CustomerDTO cd)
	{
		try
		{
			String s=css.updateCustomer(id, cd);
			if(s!=null)
				return new ResponseEntity<String>(s,HttpStatus.CREATED);
		}
			catch(Exception e) {
				e.printStackTrace();
			}
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
		
	
	@DeleteMapping("/customer/{id}")
	public ResponseEntity <String>deleteCustomer(@PathVariable int id)
	{
		try
		{
		String s=css.deleteCustomer(id);
		if(s!=null)
			return new ResponseEntity<String>(s,HttpStatus.OK);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	}
	
	


}
