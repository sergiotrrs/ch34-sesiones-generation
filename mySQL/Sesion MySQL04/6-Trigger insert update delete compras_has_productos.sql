
DELIMITER //
CREATE TRIGGER actualizar_monto_total
AFTER INSERT ON compras_has_productos
FOR EACH ROW
BEGIN
   CALL actualizar_monto_total_compra( NEW.compras_id );

END;

CREATE TRIGGER actualizar_monto_total_update
AFTER UPDATE ON compras_has_productos
FOR EACH ROW
BEGIN
   CALL actualizar_monto_total_compra( NEW.compras_id );
END;


CREATE TRIGGER actualizar_monto_total_delete
AFTER DELETE ON compras_has_productos
FOR EACH ROW
BEGIN
   CALL actualizar_monto_total_compra( OLD.compras_id );
END;

//
DELIMITER ;

DROP TRIGGER actualizar_monto_total;
DROP TRIGGER actualizar_monto_total_update;
