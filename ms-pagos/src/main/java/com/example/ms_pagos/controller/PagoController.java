package com.example.ms_pagos.controller;


import com.example.ms_pagos.model.Pago;
import com.example.ms_pagos.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pagos")
public class PagoController {

    @Autowired
    private PagoService pagoService;

    @GetMapping
    public List<Pago> listarPagos(){
        return pagoService.getPagos();
    }
    @PostMapping
    public Pago guardarPago(@RequestBody Pago pago){
        return pagoService.savePago(pago);
    }
}
