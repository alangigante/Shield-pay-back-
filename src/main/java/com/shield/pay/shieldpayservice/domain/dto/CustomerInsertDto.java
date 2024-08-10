package com.shield.pay.shieldpayservice.domain.dto;

import lombok.Data;

import java.util.Set;


@Data
public class CustomerInsertDto {


    private String customerId;
    private Set<ContactDto> contacts;
}
