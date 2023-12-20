-- Uso de inner join
SELECT * 
  FROM usuarios
  INNER JOIN roles
  ON usuarios.rol_id = roles.id;
-- Mostrar los usuarios con su respectivo rol
SELECT 
    usuarios.id AS userId,
    email,
    rol_id,
    roles.nombre
  FROM usuarios
  INNER JOIN roles
  ON usuarios.rol_id = roles.id;

-- Mostrar los productos con el nombre de la categoría asignada
select
	productos.nombre AS producto,
    categorias.nombre AS categoria
    from productos
    inner join categorias
    on productos.categoria_id = categorias.id
    ORDER BY categorias.nombre DESC, productos.nombre ASC;  -- ordenar por nombre de categoria de forma descencente

-- inner joins de 3 tablas

SELECT 
    usuarios.id AS usuarioID,
    usuarios.nombre AS nombreUsuario,
    usuarios.email AS email,
    roles.nombre AS rol,
    compras.id AS compraID,
    compras.fecha_compra
  FROM usuarios
  INNER JOIN roles
  ON usuarios.rol_id = roles.id
  INNER JOIN compras
  ON usuarios.id = compras.usuario_id;
  
-- Agregando where a la consulta
SELECT 
    usuarios.id AS usuarioID,
    usuarios.nombre AS nombreUsuario,
    usuarios.email AS email,
    roles.nombre AS rol,
    compras.id AS compraID,
    compras.fecha_compra,
    compras_has_productos.productos_id AS productoID,
    productos.nombre AS nombreProducto,
    categorias.nombre AS nombreCategoria
  FROM usuarios
  INNER JOIN roles
  ON usuarios.rol_id = roles.id
  INNER JOIN compras
  ON usuarios.id = compras.usuario_id
  INNER JOIN compras_has_productos
  ON compras.id = compras_has_productos.compras_id
  INNER JOIN productos
  ON compras_has_productos.productos_id = productos.id
  LEFT JOIN categorias
  ON productos.categoria_id = categorias.id
  WHERE usuarios.id = 2;
  

-- Establecer en null los productos de la categoria Frappé
SELECT * FROM productos WHERE categoria_id IS NULL;
UPDATE productos 
   SET categoria_id = NULL
   WHERE categoria_id = 3;

SELECT * FROM categorias WHERE nombre LIKE "%frap%";

-- Para poder quitar la opción de Not Null al campo categoria de productos
-- deshabilitamos provisionalmente las restricciones
SET foreign_key_checks = 0;
ALTER TABLE productos
  CHANGE COLUMN categoria_id categoria_id BIGINT NULL;
SET foreign_key_checks = 1;

  