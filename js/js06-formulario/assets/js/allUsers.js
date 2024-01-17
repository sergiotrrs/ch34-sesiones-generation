console.log("JS06- Login");

const enviarDatosAlServidor = async( token  ) => {


    console.table( token );
    
    const url = "https://sp3-eccomerce.onrender.com/api/v2/users";

    try {
        const response = await fetch( url ,{
            method: "GET",
            headers: { 
                Authorization:`Bearer ${token}`
            }
        });
        console.log(response);
        const allUsers = await response.json();
        console.log( allUsers );
        // TODO imprimir en el frontEnd
        alert("Solicitud exitosa");
        
    } catch (error) {
        console.error( error );
        alert("Error en la petición");
    }


}

const leerToken = () =>{
    const token = localStorage.getItem("token");
    if ( token!== null || token!= undefined){
        enviarDatosAlServidor( token );
    } else {
        alert("Tienes que generar tu token primero");
    }

}

leerToken();
