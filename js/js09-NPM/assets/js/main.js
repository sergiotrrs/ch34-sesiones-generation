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

const getUsersUsingAxios = async ( url ) => {
    try {
     const users = await axios.get( url );
     console.log( users.data );        
    } catch (error) {
        console.log(error);
    }
}

getUsersUsingFetch( url );
getUsersUsingAxios( url );