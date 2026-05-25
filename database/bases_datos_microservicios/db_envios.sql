CREATE DATABASE IF NOT EXISTS db_envios;
USE db_envios;

CREATE TABLE envios (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    pedido_id BIGINT NOT NULL,
    direccion VARCHAR(255) NOT NULL,
    ciudad VARCHAR(100) NOT NULL,
    estado_envio VARCHAR(50) NOT NULL,
    fecha_envio TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    active BOOLEAN DEFAULT TRUE
);

INSERT INTO envios(
    pedido_id,
    direccion,
    ciudad,
    estado_envio,
    active
)
VALUES
(1,'Av. Alameda 123','Santiago','EN_TRANSITO',TRUE),
(2,'Providencia 456','Santiago','PREPARANDO',TRUE);