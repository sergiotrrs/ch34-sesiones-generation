-- Mostrar todos los productos que tengan una categoria
SELECT 
 p.id,
 p.nombre,
 ca.nombre AS categoria
FROM productos p
INNER JOIN categorias ca
ON ca.id = p.categoria_id;

SELECT 
 COUNT( p.id )
FROM productos p
INNER JOIN categorias ca
ON ca.id = p.categoria_id; -- 15 productos mostrados

-- Mostrar todos los productos tengan o no una categoria asignada
-- Total de productos mostrados 20
SELECT 
 p.id,
 p.nombre,
 ca.nombre AS categoria
FROM productos p
LEFT JOIN categorias ca
ON ca.id = p.categoria_id; 

-- Mostrar todas categorias tengan o no un producto asignado
-- total de registros
SELECT 
 p.id,
 p.nombre,
 ca.nombre AS categoria
FROM productos p
RIGHT JOIN categorias ca
ON ca.id = p.categoria_id; 