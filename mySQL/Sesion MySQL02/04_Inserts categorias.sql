
-- Inserts de tabla categorias

INSERT INTO categorias (nombre, descripcion) VALUES ('Café Arábica', 'Café premium de alta calidad, cultivado en regiones montañosas.');
INSERT INTO categorias (nombre, descripcion) VALUES ('Café Robusta', 'Café con un sabor fuerte y un alto contenido de cafeína, ideal para amantes del café intenso.');
INSERT INTO categorias (nombre, descripcion) VALUES ('Café Descafeinado', 'Café procesado para reducir la cafeína, perfecto para aquellos que prefieren un café más suave.');
INSERT INTO categorias (nombre, descripcion) VALUES ('Café Orgánico', 'Café cultivado sin el uso de pesticidas ni fertilizantes químicos, respetuoso con el medio ambiente.');
INSERT INTO categorias (nombre, descripcion) VALUES ('Café Molido', 'Café en forma de polvo listo para preparar, conveniente para cafeteras y métodos de preparación tradicionales.');
INSERT INTO categorias (nombre, descripcion) VALUES ('Café en Grano', 'Café sin moler, ideal para aquellos que prefieren moler su propio café para obtener un sabor fresco.');
INSERT INTO categorias (nombre, descripcion) VALUES ('Café Gourmet', 'Variedades exclusivas y sabores únicos, para los amantes del café que buscan experiencias sofisticadas.');
INSERT INTO categorias (nombre, descripcion) VALUES ('Café Flavored', 'Café con sabores añadidos como vainilla, caramelo o chocolate, perfecto para quienes disfrutan de variedades aromatizadas.');
INSERT INTO categorias (nombre, descripcion) VALUES ('Café Single Origin', 'Café proveniente de una región específica, destacando las características únicas de su origen.');
INSERT INTO categorias (nombre, descripcion) VALUES ('Café Cold Brew', 'Café preparado en frío durante un período prolongado, ofreciendo un sabor suave y menos acidez.');

SELECT id, nombre FROM categorias;