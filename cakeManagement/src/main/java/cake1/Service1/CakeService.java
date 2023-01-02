package cake1.Service1;

import java.util.List;

import org.springframework.stereotype.Component;

import cake1.DTO.CakeDTO;
import cake1.enities.Cake;

@Component
public interface CakeService {

	public Cake createCake(CakeDTO cd);
	public Cake getCake(int id);
	public List<Cake>getAllCakes();
	public String deletecake(int id);
	public String updatecake(int id, CakeDTO cd);
	public Cake updateCakeName(int id, String name);
	public String deleteAllCakes();
	
	
}
