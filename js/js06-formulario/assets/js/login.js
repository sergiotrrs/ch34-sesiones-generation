console.log("JS06- Login");

// Obtener la referencia del formulario
const registerForm = document.forms["loginForm"];

/**
 * Adjunto un controlador de eventos a un elemento HTML.
 * eventType: Tipo de evento a escuchar
 * fncCallBack: Función de callvback que se ejecutará cuando
 *   suceda el evento.
 * 
 * registerForm.addEventListener( eventType , fncCallback ()=>{} );
 * 
 * El evento se realizará cuando se pulse el botón submit
 */
registerForm.addEventListener( "submit" , ( event )=>{
    // Evita el comportamiento predeterminado asociadoa un evento.
    event.preventDefault();
    console.log(event);

    const user = {
        email : registerForm.elements["inputEmail4"].value ,
        password : registerForm.elements["inputPassword4"].value ,
    }

        enviarDatosAlServidor( user );


} );


const mensajeError = ( message ) =>{
    console.log( message);
    const errorMessage = document.getElementById("error-message");
    const errorMessageContainer = document.getElementById("error-message-container");

    errorMessage.innerHTML = message;
    if( message === "" ){
        // displaty: none: quita el elemento del DOM
        // visibility: hidden : ocultar visualmente el elemento
        errorMessageContainer.style.display = "none";
    } else{
        errorMessageContainer.style.display = "block";
    }
}

const enviarDatosAlServidor = async( user ) => {
    const userPost = {
        email: user.email,
        password: user.password,
    }

    console.table( userPost );
    
    const url = "https://sp3-eccomerce.onrender.com/login";

    try {
        const response = await fetch( url ,{
            method: "POST",
            body: JSON.stringify(userPost),
            headers: { 
                "Content-Type":"application/json"
            }
        });
        console.log(response);
        const tokenJwt = await response.json();
        console.log( tokenJwt );
        localStorage.setItem("token",tokenJwt.token);
        alert("Login exitoso");
        
    } catch (error) {
        console.error( error );
        alert("Error en el login");
    }

}
