package com.example.ms_pagos.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String IdOrden;

    @Column(nullable = false)
    private String idCliente;

    @Column(nullable = false)
    private Integer montoPago;

    @Column(nullable = false)
    private String tipoPago;

    @Column(nullable = false)
    private String tipoMoneda;
}
