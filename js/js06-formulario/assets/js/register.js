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
        email : "sergio@gmail.com",
        password : "123",
        confirmPassword : "123",
        termsandconditions : true
    }

    if( datosVerificados( user )  ){
        enviarDatosAlServidor( user );
    }

} );

const datosVerificados = ( user ) => {
    // TODO verificar datos
    return true;
}

const enviarDatosAlServidor = ( user ) => {
    console.table( user );
    // TODO enviar datos a la api del servidor
}
