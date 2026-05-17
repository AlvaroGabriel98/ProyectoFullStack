package com.example.ms_pagos.service;

import com.example.ms_pagos.model.Pago;
import com.example.ms_pagos.repository.PagoRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PagoService {
    @Autowired
    private PagoRepository pagoRepository;

    public List<Pago> getPagos(){
        return pagoRepository.obtenerPagos();
    }

    public Pago savePago(Pago pago){
        return pagoRepository.guardar(pago);
    }

    public String eliminarPago(Integer id){
        pagoRepository.eliminar(id);
        return "Pago eliminado";
    }

    public Integer totalPago(){
        return pagoRepository.totalPagos();
    }
}
