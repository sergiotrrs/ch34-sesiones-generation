console.log("JS07 - apiFetch");

/*
 API: Application Programming Interface
   Permite la comunicación entre dos aplicaciones de software
   a travéz de un conjunto de reglas.

 La API Fetch nos ayuda a acceder y manipular 
 peticiones HTTP (GET, POST, PUT, DELETE).
 
 Sintaxis:
    fetch( resource , options);

La API fetch en JavaScript proporciona una interfaz para realizar 
solicitudes de red, como solicitudes HTTP, de manera asíncrona. 
Es una forma moderna y más poderosa de realizar solicitudes HTTP 
en comparación con métodos más antiguos, como XMLHttpRequest.

*/

const urlFakeStore = "https://fakestoreapi.com/products";

const getProducts = (url) => {
  // Realizando solicitud Get
  // .then() consum/maneja la promesa cuando sea resuelta
  // .catch() se ejecuta en caso de que la promesa sea rechazada.
  fetch(url)
    .then((response) => {
      console.log("status code: " + response.status); // 200
      response.json()
       .then(  products=> console.log(products)   )
       .catch( error => console.log("Error en la conversión" + error));

    })
    .catch((error) => {
      console.log("Error en la solicitud GET");
      console.warn(error);
    });
};

getProducts(urlFakeStore);
