package com.shield.pay.shieldpayservice.application.controller;


import com.shield.pay.shieldpayservice.domain.dto.CustomerInsertDto;
import com.shield.pay.shieldpayservice.domain.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "internal")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;


    @PostMapping
    public ResponseEntity<?> insertCustomer(CustomerInsertDto customerInsertDto){
        return service.customerInsert(customerInsertDto);
    }

}
