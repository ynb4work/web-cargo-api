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
    @Column(name = "localdate")
    private LocalDate localDate;

    @Column(name = "quantity")
    private Double quantity;

    @Enumerated(EnumType.STRING)
    @Column(name = "unit")
    private Unit unit;

    @Enumerated(EnumType.STRING)
    @Column(name = "product")
    private Product product;

    @Enumerated(EnumType.STRING)
    @Column(name = "typesoflegalentity")
    private TypesOfLegalEntity typesOfLegalEntity;

    @Column(name = "counterparty")
    private String counterParty;

    @Column(name = "unloading-addresses")
    private String unloadingAddresses;

    @Column(name = "map-location")
    private String mapLocation;

    @Column(name = "phone-number-consignee")
    private String phoneNumberConsignee;

    @Column(name = "full-name")
    private String fullName;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "descriptions")
    private String descriptions;
}