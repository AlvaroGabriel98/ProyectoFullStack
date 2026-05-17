package com.example.ms_catalogo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Consola {

    @Id
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String fabricante;

    @Column(nullable = false)
    private String almacenamiento;

    @Column(nullable = false)
    private Integer precio;

    @Column(nullable = false)
    private Integer stock;
}
