package com.vedika.invoice_billing_system.entity;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "tenants")
@Data
public class tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String businessName;

    @Column(unique = true, length = 15)
    private String gstin;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false, length = 2)
    private String stateCode; // e.g. "27" for Maharashtra - used for CGST/SGST vs IGST

    @Column(nullable = false)
    private String email;

    private String phone;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
} 
    

