package com.example.customer.customerRepository;

import com.example.customer.customerEntity.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface customerRepo extends JpaRepository<customer,Integer> {
}
