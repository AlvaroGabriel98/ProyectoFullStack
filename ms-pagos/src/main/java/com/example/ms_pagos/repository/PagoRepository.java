package com.example.ms_pagos.repository;


import com.example.ms_pagos.model.Pago;
import com.example.ms_pagos.service.PagoService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PagoRepository {
    private final PagoService pagoService;
    private List<Pago> listaPagos = new ArrayList<>();

    public PagoRepository(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    public List<Pago> obtenerPagos() {
        return listaPagos;
    }

    @PostMapping
    public Pago agregarPago(@RequestBody Pago pago){
        return pagoService.savePago(pago);
    }

    public Pago buscarPorId(Integer id){
        for (Pago pago : listaPagos) {
            if (pago.getId().equals(id)){
                return pago;
            }
        }
        return null;
    }

    public Pago guardar(Pago pago){
        if (buscarPorId(pago.getId())==null){
            listaPagos.add(pago);
            return pago;
        }
        return null;
    }

    public void eliminar(Integer id){
        listaPagos.remove(buscarPorId(id));
    }

    public Integer totalPagos(){
        return listaPagos.size();
    }

}
