-- Procedimiento almacenado

DELIMITER //
CREATE PROCEDURE setFechaNacimiento(IN idPersona LONG, IN newFechaNacimiento TIMESTAMP  )
BEGIN

 UPDATE usuarios SET fecha_nacimiento = newFechaNacimiento WHERE id=idPersona;

END //
DELIMITER ;