package spring.boot.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.boot.crud.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
