USE tienda;

-- Operaciones matemáticas
SELECT 6%2;
SELECT 3*3;

-- Funciones matemáticas
SELECT ABS(-6); -- valor absoluto de un número
SELECT CEIL(8.1); -- redonderar en el número entero superior
SELECT FLOOR(8.1); -- redondea al número entero inferior
SELECT MOD(5,2); -- residuo de una división
SELECT PI(); -- valor de pi
SELECT POWER(3,2); -- elevadar un número a la potencia determinada
SELECT RAND(); -- número aleatorio entre 0 y 1
SELECT FLOOR(RAND() * 100); 
SELECT ROUND(9.49); -- redoneda hacía arriba, si es menor a 0.5 redondea hacía abajo
SELECT TRUNCATE(5.4567, 2); -- redondea los decimales que indiquemos

-- 
SELECT * FROM productos;
SELECT nombre, precio FROM productos;
-- Mostrar el costo de 6 piezad de cada producto
SELECT nombre, precio, precio*6 FROM productos;

-- Usar un alias en el nombre de las columnas
SELECT 
	`nombre`    AS "name", 
    `precio`    AS "price", 
    `precio`* 6 AS "six pack"
  FROM `productos`
  WHERE `precio` >= 50 -- filtrar solo los valores que sean mayores o igual
  ORDER BY `nombre` ASC -- ordenar de forma ascendente, DESC(descendente)
  LIMIT 5 OFFSET 2; -- limitar el número de elementos mostrados

-- Contar el número de elementos
SELECT COUNT(*) AS "Productos totales" FROM productos; -- Cuenta el número de registros

-- Cuantos productos tenemos mayores o iguala $50
SELECT COUNT(*) AS "Productos mayores a $50" 
	FROM productos
	WHERE `precio` >= 50;
	
-- Obtener el valor máximo de una columna
SELECT MAX(precio) FROM productos; -- $90
-- Obtener el valor mínimo de una columna
SELECT MIN(precio) FROM productos; -- $25
-- Obtener el promedio de una columna
SELECT AVG(precio) FROM productos; -- $61.5
-- Sumatoria de los valores de una columna
SELECT SUM(precio) FROM productos; -- $1230

-- Cuantas categorías se están usando
SELECT COUNT(DISTINCT categoria_id) AS "Categorias en uso" FROM productos; -- 7

-- CONSULTAS anidadas ----------------------------------------   
-- Los productos de mayor valor
SELECT * FROM productos
 WHERE precio = ( SELECT MAX(precio) FROM productos);
 
-- Operadores lógicos
-- Mostrar los productos que sean de categoria_id 2 o 4
SELECT * FROM productos WHERE categoria_id = 2 OR categoria_id = 4;
-- Mostrar los productos que sean de la categoria 4 y que sean mayor a $50
SELECT * FROM productos WHERE categoria_id = 4 AND precio > 50;
-- Mostrar todos los productos que no sean de la categoria 2 y 4
-- != <>
select * from productos where categoria_id != 2 and categoria_id != 4;

-- Operadores de rango
-- Mostrar todos los productos que el precio sea >=50 pero <=100
SELECT * FROM productos WHERE precio >= 50 AND precio <= 100;
SELECT COUNT(*) FROM productos WHERE precio >= 50 AND precio <= 100; -- 17
SELECT * FROM productos WHERE precio BETWEEN 50 AND 100;
