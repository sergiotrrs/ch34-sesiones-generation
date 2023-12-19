USE tienda;
DESCRIBE compras;

INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (12, 0, "2023-12-01");

SELECT * FROM compras;

-- Modificar el valor del monto total
UPDATE compras SET monto_total = 540 WHERE id = 1;
-- Modificar la fecha de nacimiento de Tania
UPDATE usuarios SET fecha_nacimiento = "1997-03-09 01:05:00" WHERE id=19;