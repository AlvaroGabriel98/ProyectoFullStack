CREATE DATABASE IF NOT EXISTS db_stock;
USE db_stock;

CREATE TABLE stock (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    product_id BIGINT NOT NULL,
    cantidad INT NOT NULL
);

INSERT INTO stock(product_id,quantity,warehouse,active)
VALUES
(1,15),
(2,8),
(3,20);