package com.springbootreact.Service;



import com.springbootreact.model.Customer;
import com.springbootreact.model.Customer;

import java.util.List;
import java.util.Optional;
public interface CustomerService {
    List<Customer> getAllCustomers();
    Optional<Customer> getCustomerById(Long id);
    Customer saveCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    // Pode ser igual ao save
    void deleteCustomer(Long id);
}

