package thiGK.csdl_demo.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thiGK.csdl_demo.entities.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
}