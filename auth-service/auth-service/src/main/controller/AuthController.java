package com.auth_service.controller;

import com.ms_auth.dto.AuthRequest;
import com.ms_auth.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    /**
     * Endpoint para autenticar usuarios.
     * Recibe un DTO con email y password.
     */
    @PostMapping("/login")
    public ResponseEntity<String> login(@Valid @RequestBody AuthRequest request) {
        // El controller solo orquesta la llamada al service
        String token = authService.login(request);
        return ResponseEntity.ok(token);
    }

    /**
     * Endpoint de prueba para verificar que el microservicio responde.
     */
    @GetMapping("/check")
    public ResponseEntity<String> check() {
        return ResponseEntity.ok("Microservicio Auth activo");
    }
}