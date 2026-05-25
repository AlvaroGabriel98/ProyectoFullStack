CREATE DATABASE IF NOT EXISTS db_pedidos;
USE db_pedidos;

CREATE TABLE pedidos (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    total DECIMAL(10,2) NOT NULL,
    estado VARCHAR(50) NOT NULL,
    active BOOLEAN DEFAULT TRUE
);

CREATE TABLE pedidos_detalle (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    pedido_id BIGINT NOT NULL,
    product_id BIGINT NOT NULL,
    quantity INT NOT NULL,
    unit_price DECIMAL(10,2) NOT NULL,
    subtotal DECIMAL(10,2) NOT NULL,

    CONSTRAINT fk_pedido
    FOREIGN KEY (pedido_id)
    REFERENCES pedidos(id)
);

INSERT INTO pedidos(user_id,total,estado,active)
VALUES
(1,899990,'PENDIENTE',TRUE);

INSERT INTO pedidos_detalle(
pedido_id,
product_id,
quantity,
unit_price,
subtotal
)
VALUES
(1,1,1,899990,899990);