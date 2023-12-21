DELIMITER //

CREATE PROCEDURE actualizarMontoTotal(IN compra_id_param BIGINT)
BEGIN
    UPDATE compras
    SET monto_total = (
        SELECT SUM(total)
        FROM compras_has_productos
        WHERE compras_id = compra_id_param
    )
    WHERE id = compra_id_param;
END;
//

DELIMITER ;
