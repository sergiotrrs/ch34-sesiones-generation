USE tienda;
DESCRIBE compras;

INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (12, 0, "2023-12-01");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (2, 0, "2023-12-01");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (2, 0, "2023-12-02");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (3, 0, "2023-12-03");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (4, 0, "2023-12-04");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (5, 0, "2023-12-05");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (6, 0, "2023-12-06");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (7, 0, "2023-12-07");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (8, 0, "2023-12-08");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (9, 0, "2023-12-09");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (10, 0, "2023-12-10");

SELECT * FROM compras;

-- Modificar el valor del monto total
UPDATE compras SET monto_total = 540 WHERE id = 1;
-- Modificar la fecha de nacimiento de Tania
UPDATE usuarios SET fecha_nacimiento = "1997-03-09 01:05:00" WHERE id=19;