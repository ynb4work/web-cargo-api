package com.webcargoapi.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(schema = "web_cargo", name = "order")
public class Order {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id")
    private UUID id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate localDate;

    @Column(name = "quantity")
    private Double quantity;

    @Enumerated(EnumType.STRING)
    @Column(name = "unit")
    private Units unit;

    @Enumerated(EnumType.STRING)
    @Column(name = "product")
    private Product product;

    @Enumerated(EnumType.STRING)
    @Column(name = "legal_entity")
    private LegalEntity legalEntity;

    @Column(name = "counterparty")
    private String counterparty;

    @Column(name = "unloading_address")
    private String unloadingAddress;

    @Column(name = "map_location")
    private String mapLocation;

    @Column(name = "phone_number_consignee")
    private String phoneNumberConsignee;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "descriptions")
    private String descriptions;
}