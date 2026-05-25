CREATE DATABASE IF NOT EXISTS db_resenas;
USE db_resenas;

CREATE TABLE resenas (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    product_id BIGINT NOT NULL,
    comentario VARCHAR(500) NOT NULL,
    calificacion INT NOT NULL,
    active BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO resenas(
    user_id,
    product_id,
    comentario,
    calificacion,
    active
)
VALUES
(1,1,'Excelente consola y muy buen rendimiento',5,TRUE),
(2,2,'Muy buena experiencia de juego',4,TRUE);