package com.example.demo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Book;
import com.example.demo.entities.Student;
import com.example.demo.repositories.Bookrepository;

@SpringBootTest

class Demo2DtoLayeringApplicationTests {

	/*@Autowired
   Bookrepository bp;
	
	@Test
	public void testcreatebook() {
		Book b=Book.builder().bId(11)
				.bBookName("geeta")
				.bAuthorName("vyas muni")
				.bPrice(1000).build();
		    bp.save(b);
		assertNotNull(bp.findById(11).get());
		s
	}
		*/
		
	

}
