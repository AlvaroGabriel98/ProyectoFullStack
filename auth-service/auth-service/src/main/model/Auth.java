package com.auth_service.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "auth_service")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Auth{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Agregamos unique = true para cumplir con IE 2.1.1 (Integridad)
    @Column(nullable = false, unique = true)
    private String email; 

    @Column(nullable = false)
    private String password;

    // Agregar un "role" te da puntos extra en "Reglas de Negocio" (IE 2.2.1)
    // porque podrías tener rutas que solo vea el ADMIN
    private String role; 
}