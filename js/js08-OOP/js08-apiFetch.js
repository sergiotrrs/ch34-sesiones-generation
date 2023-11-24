console.log("JS07 - apiFetch");
import { Card } from "./card-class.js";
import { Producto } from "./product-class.js";

// const urlFakeStore = "https://fakestoreapi.com/products";
// const urlFakeStore = "./cafe.json";
const urlFakeStore = "https://rickandmortyapi.com/api/character";

const getProductsUsingAsyncAwait = async ( url ) => {
   try {
      const response = await fetch(url);
      const products = await response.json();

      // Crear un arreglo de OBJETOS de productos
      const productsObj = products.results.map( product => new Producto(
         product.id,
         product.name,
         12.34,
         product.status,
         product.species,
         product.image
       ));

      imprimirEnDOM( productsObj );   
      
   } catch (error) {
      console.log( error );
   }

}


getProductsUsingAsyncAwait(urlFakeStore);

/**
 * 
 * @param {Producto[]} products arreglo de la clase Producto(Mirta)
 */
function imprimirEnDOM( products) {
   const productsContainer = document.getElementById("products-container");
   
  // const productsTitle = products.map( 
  //    ( {image, title, description})=> new Card(image,title, description).basicCard() );
  
   const productsTitle = products.map( 
      ( product )=>  new Card( product.image, product.object, product.description).basicCard() );
  
   productsContainer.innerHTML =  productsTitle.join("");
}