package com.shield.pay.shieldpayservice.domain.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {


    @Id
    @JoinColumn(name = "cusotmer_id")
    private String customerId;
    @OneToMany
    @JoinTable(
            name = "customer_id_contact_hash",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "contact_hash")
    )
    private Set<Contact> contacts = new HashSet<>();

}
