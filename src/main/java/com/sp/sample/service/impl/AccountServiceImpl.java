package com.sp.sample.service.impl;

import com.sp.sample.dto.CustomerDto;
import com.sp.sample.entity.Accounts;
import com.sp.sample.entity.Customer;
import com.sp.sample.exception.CustomerAlreadyExistsException;
import com.sp.sample.mapper.CustomerMapper;
import com.sp.sample.respository.AccountsRepository;
import com.sp.sample.respository.CustomerRepository;
import com.sp.sample.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {

    private AccountsRepository accountsRepository;

    private CustomerRepository customerRepository;

    @Override
    public void creatAccount(CustomerDto customerDto) {
        Customer savedData  = CustomerMapper.mapToCustomer(customerDto,new Customer());
       Optional<Customer> optionalCustomer= customerRepository.findByMobileNumber(customerDto.getMobileNumber());
       if(optionalCustomer.isPresent()){
           throw  new CustomerAlreadyExistsException("Customer already registered with given mobileNumber "
                   +customerDto.getMobileNumber());
       }else {
           Customer savedCustomer = customerRepository.save(savedData);
           accountsRepository.save(createNewAccount(savedCustomer));
       }

    }

    private Accounts createNewAccount(Customer customer) {
        Accounts newAccount =new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType("SAVINGS");
        newAccount.setBranchAddress("HYD,KPHB");
        return newAccount;
    }
}
