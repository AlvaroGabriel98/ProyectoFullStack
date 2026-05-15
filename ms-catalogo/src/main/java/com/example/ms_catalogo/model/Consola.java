package com.example.ms_catalogo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Consola {

    private Integer id;
    private String nombre;
    private String fabricante;
    private String almacenamiento;
    private Integer precio;
    private Integer stock;
}
