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

import cake1.DTO.CakeDTO;
import cake1.Service1.CakeService;
import cake1.enities.Cake;
import cake1.exception.CakeNotFoundException;

@RestController
public class CakeController {

	@Autowired(required=true)
	CakeService cs;
	
	@PostMapping("/cake")
	public  ResponseEntity<Cake> createCake(@RequestBody @Valid CakeDTO cd)
	{	  	
		Cake c=cs.createCake(cd);
		if(c!=null)
			return new ResponseEntity<Cake>(c, HttpStatus.CREATED);
		
	   return new ResponseEntity<Cake>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/cake /{id}")
	public ResponseEntity<Cake> getCake (@PathVariable int id)
	{
		try {
			Cake c=cs.getCake(id);
		if(c!=null)
			return new ResponseEntity<Cake>(c, HttpStatus.OK);
		}catch(Exception e)
		{		
	       throw new CakeNotFoundException("Cake not found");
		}
		 return new ResponseEntity<Cake>(HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping("/cakes")
	public ResponseEntity<List<Cake>> getCakes()
	{
		try {
			List<Cake> clist=cs.getAllCakes();
			if(clist!=null)
				return new ResponseEntity<List<Cake>>(clist, HttpStatus.OK);
			}catch(Exception e)
			{		
		       e.printStackTrace();
			}
			 return new ResponseEntity<List<Cake>>(HttpStatus.NOT_FOUND);
		
	}
	
	@PutMapping("/cake/{id}")
	public ResponseEntity<String> updateCake(@PathVariable int id,@RequestBody CakeDTO cd)
	{
		try
		{
			String s=cs.updatecake(id, cd);
			if(s!=null)
				return new ResponseEntity<String>(s,HttpStatus.CREATED);
		}
			catch(Exception e) {
				e.printStackTrace();
			}
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
		
	
	@DeleteMapping("/cake/{id}")
	public ResponseEntity <String>deleteCake(@PathVariable int id)
	{
		try
		{
		String s=cs.deletecake(id);
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
