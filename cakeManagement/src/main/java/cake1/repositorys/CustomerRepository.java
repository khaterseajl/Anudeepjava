package cake1.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cake1.enities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
