package com.user_service.repository;

import com.user_service.model.User;
import com.user_service.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registrarUsuario(User user) {
        log.info("Intentando registrar usuario con email: {}", user.getEmail());
        
        if(userRepository.findByEmail(user.getEmail()).isPresent()) {
            log.error("El email {} ya está registrado", user.getEmail());
            throw new RuntimeException("El email ya existe");
        }
        
        return userRepository.save(user);
    }

    public User buscarPorId(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con ID: " + id));
    }
}
