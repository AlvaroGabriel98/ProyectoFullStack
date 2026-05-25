CREATE DATABASE IF NOT EXISTS db_users;
USE db_users;

CREATE TABLE users (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,

    auth_user_id BIGINT NOT NULL,

    first_name VARCHAR(100) NOT NULL,

    last_name VARCHAR(100) NOT NULL,

    phone VARCHAR(30) NOT NULL,

    address VARCHAR(255) NOT NULL,

    city VARCHAR(100) NOT NULL,

    country VARCHAR(100) NOT NULL,

    active BOOLEAN DEFAULT TRUE,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO users(
    auth_user_id,
    first_name,
    last_name,
    phone,
    address,
    city,
    country,
    active
)
VALUES
(1,'Ignacio','Montecinos','912345678','Av Central 123','Santiago','Chile',TRUE),

(2,'Carlos','Perez','923456789','Providencia 456','Santiago','Chile',TRUE);