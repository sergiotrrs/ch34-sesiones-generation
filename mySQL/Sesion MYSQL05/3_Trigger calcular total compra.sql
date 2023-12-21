DELIMITER //

CREATE TRIGGER calcular_total_producto
BEFORE INSERT ON compras_has_productos
FOR EACH ROW
BEGIN
    DECLARE precio_producto DECIMAL(9,2);

    -- Obtener el precio del producto desde la tabla productos
    SELECT precio INTO precio_producto
    FROM productos
    WHERE id = NEW.productos_id;

    -- Calcular subtotal y total
    SET NEW.subtotal = precio_producto;
    SET NEW.total = NEW.cantidad * (precio_producto - NEW.descuento);
    
END;

CREATE TRIGGER calcular_total_compra
AFTER INSERT ON compras_has_productos
FOR EACH ROW
BEGIN
    -- Establecer nuevo valor de monto_total en tabla compras
    CALL setMontoTotalCompra( NEW.compras_id );
END;


//
DELIMITER ;

-- Ver los triggers
SHOW TRIGGERS;

-- Eliminar un trigger
DROP TRIGGER calcular_total_update;
