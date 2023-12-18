/*
 Sesion MySQL 01
 Generation Mx.
*/

-- Ver las bases de datos disponibles
SHOW DATABASES;
-- Crear una base de datos
CREATE DATABASE tienda;
-- Seleccionar la base de datos para su uso
USE tienda;
-- Crear tabla productos
CREATE TABLE productos( 
  id INT NOT NULL KEY AUTO_INCREMENT,
  nombre VARCHAR(120) NOT NULL,
  precio DOUBLE NOT NULL,
  categoria VARCHAR(20)
  );
  
 -- Mostrar las tablas existentes en una DB
 SHOW TABLES;
 -- Mostrar la estructura de una tabla
 DESCRIBE productos;