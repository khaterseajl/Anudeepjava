package cake1.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cake1.enities.Cake;

@Repository
public interface CakeRepository extends JpaRepository<Cake, Integer> {

}
