package com.shield.pay.shieldpayservice.infrastructure.repository;

import com.shield.pay.shieldpayservice.domain.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, String> {
}
