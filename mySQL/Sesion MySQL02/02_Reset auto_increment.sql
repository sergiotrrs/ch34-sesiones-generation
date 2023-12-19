
-- Eliminar todos los datos
DELETE FROM roles;

-- Resetear el valor de AUTO_INCREMENT
ALTER TABLE roles AUTO_INCREMENT = 1;

INSERT INTO roles(id,nombre, descripcion) VALUES(100,"n/a", "Valor temporal" );

SELECT * FROM roles;

