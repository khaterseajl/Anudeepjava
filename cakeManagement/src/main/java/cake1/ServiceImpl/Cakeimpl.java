package cake1.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cake1.DTO.CakeDTO;
import cake1.Service1.CakeService;
import cake1.enities.Cake;
import cake1.repositorys.CakeRepository;


@Service
public class Cakeimpl implements CakeService {

	@Autowired
	CakeRepository cr;
	
	@Override
	public Cake createCake(CakeDTO cd) {
		Cake ce=Cake.builder()
				.ckid(cd.getCkId())
				.ckname(cd.getCkName())
				.ckflavour(cd.getCkFlavour())
				.ckprice(cd.getCkPrice()).build();
		return cr.save(ce);
	}

	@Override
	public Cake getCake(int id) {
		
		return cr.findById(id).get();
		
	}

	@Override
	public List<Cake> getAllCakes() {
		
		return cr.findAll();
	}

	@Override
	public String deletecake(int id) {
		cr.deleteById(id);
		return "Cake deleted Successfully..";
	}

	@Override
	public String updatecake(int id, CakeDTO cd) {
		Cake c=cr.findById(id).get();
		Cake ce=Cake.builder()
				.ckid(cd.getCkId())
				.ckname(cd.getCkName())
				.ckflavour(cd.getCkFlavour())
				.ckprice(cd.getCkPrice()).build();
	       cr.save(ce);
		return "Cake updated Successfully..";
	}

	@Override
	public Cake updateCakeName(int id, String name) {
	 Cake c=cr.findById(id).get();
	 c.setCkname(name);
	 return cr.save(c);
	}

	@Override
	public String deleteAllCakes() {
	  cr.deleteAll();
	  return "Cakes deleted Successfully..";
	}

}
