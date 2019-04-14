package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

  //private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl(); using new keyword

  private CustomerRepository customerRepository; //setter injections

  CustomerServiceImpl() {

  }

  public CustomerServiceImpl(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;

  }

  public List<Customer> findAll() {
    return customerRepository.findAll();
  }

 /* public void setCustomerRepository(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }*/
}
