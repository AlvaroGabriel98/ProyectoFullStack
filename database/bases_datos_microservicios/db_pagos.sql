CREATE DATABASE IF NOT EXISTS db_pagos;
USE db_pagos;

CREATE TABLE pagos (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    pedido_id BIGINT NOT NULL,
    metodo_pago VARCHAR(50) NOT NULL,
    monto DECIMAL(10,2) NOT NULL,
    estado VARCHAR(50) NOT NULL,
    transaction_code VARCHAR(150),
    active BOOLEAN DEFAULT TRUE
);

INSERT INTO pagos(
pedido_id,
metodo_pago,
monto,
estado,
transaction_code,
active
)
VALUES
(1,'TARJETA',899990,'APROBADO','TRX998877',TRUE),
(2,'TRANSFERENCIA',459990,'PENDIENTE','TRX112233',TRUE);