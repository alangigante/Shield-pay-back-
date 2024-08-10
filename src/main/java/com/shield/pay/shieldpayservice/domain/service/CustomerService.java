package com.shield.pay.shieldpayservice.domain.service;

import com.shield.pay.shieldpayservice.domain.dto.CustomerInsertDto;
import org.springframework.http.ResponseEntity;

public interface CustomerService {

    ResponseEntity<?> customerInsert(CustomerInsertDto customerInsertDto);
}
