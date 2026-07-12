package com.sp.sample.service.impl;

import com.sp.sample.dto.AccountsDto;
import com.sp.sample.dto.CustomerDetailsDto;
import com.sp.sample.entity.Accounts;
import com.sp.sample.entity.Customer;
import com.sp.sample.exception.ResourceNotFoundException;
import com.sp.sample.mapper.AccountsMapper;
import com.sp.sample.mapper.CustomerMapper;
import com.sp.sample.respository.AccountsRepository;
import com.sp.sample.respository.CustomerRepository;
import com.sp.sample.service.ICustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements ICustomerService {

    private CustomerRepository customerRepository;

    private AccountsRepository accountsRepository;

    @Override
    public CustomerDetailsDto fetchCustomerDetails(String mobileNumber) {
        Customer customer  = customerRepository.findByMobileNumber(mobileNumber).orElseThrow(
                ()-> new ResourceNotFoundException("Customer", "mobileNumber", mobileNumber)
        );
        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId()).orElseThrow(
                ()-> new ResourceNotFoundException("Account", "mobileNumber", customer.getCustomerId().toString())
        );

        CustomerDetailsDto customerDetailsDto = CustomerMapper.mapToCustomerDetailsDto(customer, new CustomerDetailsDto());
        customerDetailsDto.setAccountsDto(AccountsMapper.mapToAccountsDto(accounts, new AccountsDto()));

        return customerDetailsDto;
    }
}
