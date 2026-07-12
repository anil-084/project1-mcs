package com.sp.sample.controller;


import com.sp.sample.dto.CustomerDetailsDto;
import com.sp.sample.service.ICustomerService;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;


    @GetMapping("/fetchCustomerDetails")
    public ResponseEntity<CustomerDetailsDto> fetchCustomer(@RequestParam  @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
                                                                String mobileNumber){
       CustomerDetailsDto customerDetailsDto =  iCustomerService.fetchCustomerDetails(mobileNumber);
       return ResponseEntity.status(HttpStatus.OK).body(customerDetailsDto);
    }
}
