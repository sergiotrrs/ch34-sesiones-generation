USE tienda;
DESCRIBE roles;

-- Insertar roles
INSERT INTO roles(nombre, descripcion) VALUES("cliente", "Cliente de la tienda" );
INSERT INTO roles(nombre, descripcion) VALUES("admin", "Administrador de la tienda" );
INSERT INTO roles(nombre, descripcion) VALUES("almacen", "Persona encargada del almacen" );
INSERT INTO roles(nombre, descripcion) VALUES("propietario", "Propietaria de la tienda" );
INSERT INTO roles(nombre, descripcion) VALUES("vendedor", "Vendedor de productos" );

-- Mostrar todos los registros
SELECT * FROM roles;