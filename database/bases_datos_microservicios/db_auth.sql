CREATE DATABASE IF NOT EXISTS db_auth;
USE db_auth;

CREATE TABLE auth_service (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(150) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL,
);

INSERT INTO auth(username,email,password,role,active)
VALUES
('admin','admin@respawn.com','123456','ADMIN',TRUE),
('cliente','cliente@respawn.com','123456','CLIENTE',TRUE);