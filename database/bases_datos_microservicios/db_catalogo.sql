CREATE DATABASE IF NOT EXISTS db_catalogo;
USE db_catalogo;

CREATE TABLE consola (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(120) NOT NULL,
    fabricante VARCHAR(100) NOT NULL,
    almacenamiento VARCHAR(100),
    precio DECIMAL(10,2) NOT NULL,
    stock INT NOT NULL
    
);

INSERT INTO consola(nombre,marca,precio,stock,categoria,active)
VALUES
('PlayStation 5','Sony',699990,10,'Consolas',TRUE),
('Xbox Series X','Microsoft',649990,8,'Consolas',TRUE),
('Nintendo Switch OLED','Nintendo',399990,15,'Consolas',TRUE);