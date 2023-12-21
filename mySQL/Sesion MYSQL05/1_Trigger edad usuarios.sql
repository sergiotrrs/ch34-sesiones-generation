
DELIMITER //
CREATE TRIGGER verificar_edad
BEFORE INSERT ON usuarios
FOR EACH ROW
BEGIN
    DECLARE edad INT;
    DECLARE fecha_actual TIMESTAMP;

    -- Calcular la edad
    SET fecha_actual = CURRENT_DATE;
    SET edad =  DATE_FORMAT(FROM_DAYS(DATEDIFF(NOW(), new.fecha_nacimiento)), '%Y') + 0 ;

    -- Verificar si la edad es menor de 18
    IF edad < 18 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'La edad mínima permitida es de 18 años';
    END IF;
END;
//
DELIMITER ;