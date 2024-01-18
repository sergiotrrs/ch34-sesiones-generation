
const getProducts = async()=>{
    const url = "http://localhost:8080/api/v1/products";

    const response = await fetch( url );
    const products = await response.json();

    console.log( products );
}

getProducts();