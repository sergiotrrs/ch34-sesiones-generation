DESCRIBE usuarios;
-- Insertar nuevos usuarios
INSERT INTO usuarios(nombre, apellido, direccion, telefono, email, fecha_nacimiento, rol_id)
   VALUES("Sergio", "Torres", "Siempre viva 100", "5555556610", "torres@gmail.com", "1983-12-08", 3);
   
SELECT * FROM usuarios;