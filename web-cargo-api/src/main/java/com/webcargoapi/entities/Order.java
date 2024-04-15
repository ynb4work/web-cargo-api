package com.webcargoapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
    @GeneratedValue
    @Column(name = "id")
    private UUID uuid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateField;

    @Column(name = "quantity")
    private Double quantity;

    @Enumerated(EnumType.STRING)
    @Column(name = "units")
    private Units units;

    @Enumerated(EnumType.STRING)
    @Column(name = "product")
    private Product product;

    @Enumerated(EnumType.STRING)
    @Column(name = "legalEntity")
    private LegalEntity legalEntity;

    @Column(name = "counterparty")
    private String counterParty;

    @Column(name = "unloading_addresses")
    private String unloadingAddresses;

    @Column(name = "maps_location")
    private String mapsLocation;

    @Column(name = "phone_number_consignee")
    private String phoneNumberConsignee;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "descriptions")
    private String descriptions;

}