package org.generation.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
 *  @RestController indica que la clase será un controlador API REST
 *  Esta anotación combina @Controller y @ResponseBody.
 *  
 *  @Controller indica que la clase será un controlador MVC
 *  (Model-View-Controller). Esta clase de encarga de manejar
 *  las solicitudes HTTP y devuelve una respuesta(Vista).
 *  
 *  @ResponseBody indica que los métodos devuelven la respuesta
 *  en el cuerpo de la solicitud HTTP. Los objetos devueltos por los métodos
 *  se serializan automáticamente en el formato deseado. Por default la respuesta
 *  es en formato JSON.
 *  
 *  @RequestMapping mapea una solicitud HTTP en la URL indicada.
 *  Se puede aplicar a nivel de clase o método.
 *  A nivel de clase define el prefijo común de la URL para todas
 *  las rutas de los métodos.
 *  
 */

@RestController
@RequestMapping("api/v1") // localhost:8080/api/v1
public class Hello {

	/*
	 *  @GetMapping mapea solicitudes HTTP GET
	 *  Entre parentesis se indica la ruta donde se mapeará.
	 *  A esta ruta se le incluye el prefijo definido
	 *  con @RequestMapping en la clase.
	 */
	@GetMapping("greeting") // localhost:8080/api/v1/greeting
	String greeting() {
		return "Hola Ch34, Feliz 2024";
	}
	
}
