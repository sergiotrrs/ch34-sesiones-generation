

DELIMITER $$
CREATE PROCEDURE `actualizar_monto_total_compra` (IN compraID BIGINT)
BEGIN
 update compras 
  set monto_total = ( select sum(total) as total 
                       from compras_has_productos 
                       where compras_id = compraID ) 
  where id = compraID;
END$$

DELIMITER ;