-- Agrupar elementos con GROUP By

SELECT 
  u.id,
  u.email,
  co.id,
  co.fecha_compra
 FROM usuarios u
 INNER JOIN compras co
 ON u.id = co.usuario_id;
 
 -- Mostrar los usuarios y el número total de compras que han realizado
 SELECT 
  u.id,
  u.email,
  COUNT( co.id ) AS ComprasTotales
 FROM usuarios u
 INNER JOIN compras co
 ON u.id = co.usuario_id
 GROUP BY u.id;
 
  -- USO de WHERE y HAVING en agrupaciones
 SELECT 
  u.id,
  u.email,
  -- co.id AS compraID
  COUNT( co.id ) AS ComprasTotales
 FROM usuarios u
 INNER JOIN compras co
 ON u.id = co.usuario_id
 WHERE u.id <= 5
 GROUP BY u.id
 HAVING ComprasTotales >= 2;
 
 -- Mostrar las compras con la sumatoria de las ventas de cada producto
SELECT 
  co.id AS compraID,
  -- chp.productos_id AS productoID,
  -- cantidad,
  -- subtotal AS precioProducto,
  -- total AS costoTotalProducto
  SUM(chp.total) AS totalCompra,
  u.email
FROM compras co
INNER JOIN compras_has_productos chp
ON co.id = chp.compras_id
INNER JOIN usuarios u
ON co.usuario_id = u.id
GROUP BY co.id
HAVING totalCompra > 300;



 