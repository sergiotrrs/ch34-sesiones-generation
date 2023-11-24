console.log("JS09-NPM");

const url = "https://fakestoreapi.com/users";

const getUsersUsingFetch = async ( url ) => {
  // realizar la solicitud HTTP get, usando la API FETCH
  try {
    const response = await fetch(url);
    const users = await response.json();
    console.log( users);
  } catch (error) {
    console.log(error);
  }
}

getUsersUsingFetch( url );