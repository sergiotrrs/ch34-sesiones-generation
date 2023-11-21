console.log("JS06- formulario");

// Obtener la referencia del formulario
const registerForm = document.forms["registerForm"];

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
        confirmPassword : registerForm.elements["inputPassword5"].value,
        termsandconditions : registerForm.elements["gridCheck"].checked
    }

    if( datosVerificados( user )  ){
        enviarDatosAlServidor( user );
    }

} );

const datosVerificados = ( user ) => {
    let response = true;

    if( user.email === "" ){
        mensajeError("Falta introducir el email");
        response = false;
    } else if( user.password.length < 8) {
        mensajeError("El password debe ser mayor o igual a 8 caracteres");
        response = false;
    } else if( user.password !== user.confirmPassword) {
        mensajeError("La confirmación de contraseña no coincide");
        response = false;
    } else if ( !user.termsandconditions ) {
        mensajeError("Debe aceptar los términos y condiciones");
        response = false;
    } else {
        mensajeError("");
    }

    return response;
}

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

const enviarDatosAlServidor = ( user ) => {
    console.table( user );
    // TODO enviar datos a la api del servidor
}
