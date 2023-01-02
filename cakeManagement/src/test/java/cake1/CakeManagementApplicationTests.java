package cake1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cake1.enities.Cake;
import cake1.repositorys.CakeRepository;

@SpringBootTest
class CakeManagementApplicationTests {

	@Autowired
	private CakeRepository crepo;
	
	@Test
	@DisplayName("it should create object of cake")
	void createcake() {
		Cake cake=Cake.builder()
				.ckid(1)
				.ckname("Pineapple cake")
				.ckflavour("pineapple")
				.ckprice(270).build();
	           crepo.save(cake);
	           assertNotNull(crepo.findById(1).get());
	}
	
	@Test
	@DisplayName("It should return cake list by 2")
	void getallcake()
	{
		Cake cake1=Cake.builder()
				.ckid(2)
				.ckname("Strawberry cake")
				.ckflavour("Strawberry")
				.ckprice(260).build();
	           crepo.save(cake1);
	           
	           Cake cake2=Cake.builder()
	   				.ckid(3)
	   				.ckname("Butterscotch cake")
	   				.ckflavour("Butterscotch")
	   				.ckprice(270).build();
	   	           crepo.save(cake2);
	   	           
	   	           List<Cake>clist=crepo.findAll();
	   	           assertNotNull(clist);
	   	           
	   	           assertThat(clist).isNotNull();
	   	           
	}
	
	

}
