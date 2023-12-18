/*
 Sesion MySQL 01
 Insertar productos
*/

-- Insertar registros indicando el id
INSERT INTO productos (id, nombre, precio, categoria) VALUES (1, "Mango", 25, "Frutas");
INSERT INTO productos (id, nombre, precio, categoria) VALUES (2, "Limón", 30, "Frutas");

-- Insertar registros sin indicar el id
INSERT INTO productos (nombre, precio, categoria) VALUES ("Bicicleta", 5000, "Deportes");
INSERT INTO productos (nombre, precio, categoria) VALUES ("Lavadora", 7000, "Línea Blanca");
INSERT INTO productos (nombre, precio, categoria) VALUES ("Taladro", 2500, "Herramientas");
INSERT INTO productos (nombre, precio, categoria) VALUES ("Desarmador", 50, "Herramientas");

INSERT INTO productos (nombre, precio, categoria) VALUES ("Pinza electricista", 120, "Herramientas");

SELECT * FROM productos;