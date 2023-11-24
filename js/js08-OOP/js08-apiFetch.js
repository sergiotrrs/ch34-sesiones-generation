console.log("JS07 - apiFetch");
import { Card } from "./card-class.js";

const urlFakeStore = "https://fakestoreapi.com/products";

const getProductsUsingAsyncAwait = async ( url ) => {
   try {
      const response = await fetch(url);
      const products = await response.json();
      imprimirEnDOM( products );   
      
   } catch (error) {
      console.log( error );
   }

}


getProductsUsingAsyncAwait(urlFakeStore);


function imprimirEnDOM( products) {
   const productsContainer = document.getElementById("products-container");
   
   const productsTitle = products.map( 
      ( {image, title, description})=> new Card(image,title, description).basicCard() );
  
   productsContainer.innerHTML =  productsTitle.join("");
}