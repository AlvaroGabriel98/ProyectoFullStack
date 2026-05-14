package com.ms_stock.controller;

import example.ms_stock.model.Stock;
import example.ms_stock.service.StockService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stock")
public class StockController {
     @Autowired
    private StockService stockService;

    
    @GetMapping("/validar/{productoId}")
    public ResponseEntity<Boolean> validar(@PathVariable Long productoId) {
        return ResponseEntity.ok(stockService.tieneStock(productoId));
    }

   
    @GetMapping("/producto/{productoId}")
    public ResponseEntity<Stock> obtenerDetalle(@PathVariable Long productoId) {
        return ResponseEntity.ok(stockService.obtenerPorProductoId(productoId));
    }

    
    @PutMapping("/descontar/{productoId}")
    public ResponseEntity<String> descontar(@PathVariable Long productoId, @RequestParam Integer cantidad) {
        stockService.descontarStock(productoId, cantidad);
        return ResponseEntity.ok("Stock actualizado correctamente");
    }


    @GetMapping("/test-error/{id}")
    public ResponseEntity<?> testError(@PathVariable Long id) {
        return ResponseEntity.ok(stockService.obtenerPorProductoId(id));
    }

}
