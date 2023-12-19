
-- Productos para la categoría 'Café Arábica'
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Café Arábica Premium', 12.99, 1);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Café Arábica Suave', 10.99, 1);

-- Productos para la categoría 'Café Descafeinado'
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Café Descafeinado Clásico', 11.49, 3);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Café Descafeinado Vainilla', 13.99, 3);

-- Productos para la categoría 'Café Orgánico'
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Café Orgánico Puro', 14.99, 4);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Café Orgánico Mezcla Especial', 16.49, 4);

-- Productos para la categoría 'Café Molido'
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Café Molido Tradicional', 9.99, 5);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Café Molido Fino', 11.99, 5);

-- Productos para la categoría 'Café en Grano'
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Café en Grano Premium', 13.99, 6);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Café en Grano Intenso', 15.49, 6);

-- Productos para la categoría 'Café Flavored'
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Café Sabor Vainilla', 14.99, 8);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Café Sabor Caramelo', 14.99, 8);

-- Productos para la categoría 'Café Single Origin'
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Café Single Origin Etiopía', 17.99, 9);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Café Single Origin Colombia', 18.49, 9);

-- Productos para la categoría 'Café Cold Brew'
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Café Cold Brew Clásico', 15.99, 10);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Café Cold Brew Menta', 16.49, 10);

SELECT * FROM productos;