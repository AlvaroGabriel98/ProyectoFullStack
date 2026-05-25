CREATE DATABASE IF NOT EXISTS db_notificaciones;
USE db_notificaciones;

CREATE TABLE notificaciones (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    titulo VARCHAR(150) NOT NULL,
    mensaje VARCHAR(500) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    leida BOOLEAN DEFAULT FALSE,
    active BOOLEAN DEFAULT TRUE
);

INSERT INTO notificaciones(
user_id,
titulo,
mensaje,
tipo,
leida,
active
)
VALUES
(1,'Pedido Registrado','Tu pedido fue registrado correctamente','INFO',FALSE,TRUE),
(2,'Stock Actualizado','Stock actualizado correctamente','SISTEMA',FALSE,TRUE);