SELECT * FROM usuarios;
SELECT * FROM usuarios WHERE email = "@gmail.com";

-- Patrones de búsqueda ---------------------------------------
-- comodín: _ donde puede buscar cualquier caracter
-- comodín: % donde puede buscar n número de caracteres

-- Buscar todas las personas que tengan @gmail.com 
SELECT * FROM usuarios WHERE email LIKE "%@gmail.com";
-- Buscar todas las personas que NO tengan @gmail.com 
SELECT * FROM usuarios WHERE email NOT LIKE "%@gmail.com";
-- Buscar todas las personas que tengan @gmail.com, pero su usuario de email sea de 5 caracteres
SELECT * FROM usuarios WHERE email LIKE "_____@gmail.com";
-- Buscar todas las personas que su lada de CDMx( 55 y 56 )
SELECT * FROM usuarios WHERE telefono like "55%" OR telefono like "56%" ;

-- Funciones de caracteres -----------------------------------
SELECT nombre, apellido FROM usuarios;
SELECT nombre, apellido, CONCAT(nombre, " ", apellido) AS "Nombre completo" 
   FROM usuarios;
-- Longitud de un texto
SELECT nombre, 
       LENGTH(nombre) AS longitud, 
       REVERSE(nombre),
       LOWER(nombre),
       UPPER(nombre)
   FROM usuarios;   


   