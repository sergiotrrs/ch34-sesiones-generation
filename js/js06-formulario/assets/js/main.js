
const getProducts = async()=>{
    const url = "https://sp3-eccomerce.onrender.com/api/v1/products";

    const response = await fetch( url );
    const products = await response.json();

    console.log( products );
}

getProducts();