package com.sp.sample.service;

import com.sp.sample.dto.CustomerDto;
import jakarta.validation.Valid;

public interface IAccountService {

    void creatAccount(CustomerDto customerDto);

    CustomerDto featchAccountDetails(String mobileNumber);

    boolean updateAccountDetails(@Valid CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
