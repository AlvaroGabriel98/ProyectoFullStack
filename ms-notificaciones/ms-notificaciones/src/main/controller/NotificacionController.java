package com.ms_notificaciones.controller;

import com.ms_notificaciones.model.Notificacion;
import com.ms_notificaciones.service.NotifiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notificaciones")
public class NotificacionController {

    @Autowired
    private NotifiService notificacionService;

    @PostMapping
    public ResponseEntity<Notificacion> crear(@Valid @RequestBody Notificacion notificacion) {
        Notificacion nuevaNotificacion = notificacionService.enviarNotificacion(notificacion);
        return new ResponseEntity<>(nuevaNotificacion, HttpStatus.CREATED);
    }

    @GetMapping("/historial")
    public ResponseEntity<List<Notificacion>> listar() {
        return ResponseEntity.ok(notificacionService.obtenerHistorial());
    }
}