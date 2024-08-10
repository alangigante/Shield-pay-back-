package com.shield.pay.shieldpayservice.infrastructure.repository;

import com.shield.pay.shieldpayservice.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositoryJpa extends JpaRepository<Customer, String> {
}
