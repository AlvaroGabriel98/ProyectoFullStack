package com.user_service.controller;

import com.user_service.dto.UserRequest;
import com.user_service.model.User;
import com.user_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> crear(@Valid @RequestBody UserRequest request) {
        User nuevoUsuario = new User();
        
        nuevoUsuario.setNombre(request.getNombre());
        nuevoUsuario.setEmail(request.getEmail());
        nuevoUsuario.setPassword(request.getPassword());
        
        return new ResponseEntity<>(userService.registrarUsuario(nuevoUsuario), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> obtenerUno(@PathVariable Long id) {
        return ResponseEntity.ok(userService.buscarPorId(id));
    }
}
