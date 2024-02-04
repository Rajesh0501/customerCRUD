package com.example.customer.customerService;

import com.example.customer.customerEntity.customer;
import com.example.customer.customerRepository.customerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class customerService {
    @Autowired
    customerRepo customerRepo;


    public void create(customer customer){
        customerRepo.save(customer);
    }
    public List<customer> getAllCustomer(){
       return customerRepo.findAll();
    }

    public customer getCustomerById(Integer id) {
        return customerRepo.findById(id).get();
    }

//    public void updateCustomer(customer customer, Integer id) {
//        customer customerToUpdate = getCustomerById(id);
//        customerToUpdate.setAddress(customer.getAddress());
//        customerToUpdate.setCity(customer.getCity());
//        customerToUpdate.setEmail(customer.getEmail());
//        customerToUpdate.setPhone(customer.getPhone());
//        customerToUpdate.setFirstName(customer.getFirstName());
//        customerToUpdate.setLastName(customer.getLastName());
//        customerToUpdate.setStreet(customer.getStreet());
//        customerToUpdate.setState(customer.getState());
//        customerRepo.save(customerToUpdate);
//    }


    public void deleteCustomer(Integer customerId) {
        customerRepo.deleteById(customerId);
    }
}
