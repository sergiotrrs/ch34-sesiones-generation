-- Creación de una vista
CREATE VIEW `edades` AS
  SELECT
   nombre,
   fecha_nacimiento,
   DATEDIFF( CURDATE(), fecha_nacimiento ) AS "Días", 
   FLOOR((DATEDIFF( CURDATE(), fecha_nacimiento ))/365) AS "Años"
  FROM usuarios
  WHERE nombre NOT LIKE "%Oswa%";
   