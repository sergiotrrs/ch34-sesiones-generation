-- el id 3 de compra tiene $700
SELECT * FROM compras WHERE id = 3;

-- mostrar los productos de la compra id 3
SELECT * FROM compras_has_productos WHERE compras_id = 3;

-- Debo tener el nuevo valor de $470
DELETE FROM compras_has_productos WHERE compras_id = 3 and productos_id = 12;
DELETE FROM compras_has_productos WHERE compras_id = 3 and productos_id = 16;

-- el id 3 de compra tiene $470
SELECT * FROM compras WHERE id = 3;
