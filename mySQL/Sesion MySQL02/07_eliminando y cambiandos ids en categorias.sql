
SELECT * FROM categorias;

-- Intentar eliminar el ID 2
DELETE FROM categorias WHERE id = 2;

-- Modificar el id 7 cambiarlo a id 11
SELECT * FROM categorias WHERE id = 7;
UPDATE categorias SET id = 11 WHERE id = 7;