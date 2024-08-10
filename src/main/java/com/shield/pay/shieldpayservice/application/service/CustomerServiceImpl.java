package com.shield.pay.shieldpayservice.application.service;

import com.shield.pay.shieldpayservice.domain.dto.CustomerInsertDto;
import com.shield.pay.shieldpayservice.domain.service.CustomerService;
import com.shield.pay.shieldpayservice.infrastructure.repository.ContactRepository;
import com.shield.pay.shieldpayservice.infrastructure.repository.CustomerRepositoryJpa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepositoryJpa customerRepositoryJpa;
    private final ContactRepository contactRepository;

    @Override
    public ResponseEntity<?> customerInsert(CustomerInsertDto customerInsertDto) {



        return null;
    }
}
