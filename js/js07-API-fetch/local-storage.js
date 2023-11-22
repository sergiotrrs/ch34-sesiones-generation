console.log("JS07 - local Storage");

//Obtenerr la referencia del form
const registerForm = document.forms["user-form"];

//Acción del evento Submit INICIO
registerForm.addEventListener("submit", (event) => {
  //Evita el comportameinto predeterminado asociado a un evento
  event.preventDefault();

  //definición de un Objeto para leer los datos del form
  const user = {
    name: registerForm.elements["name"].value, //vacio es "" no NULL
    job: registerForm.elements["job"].value,
  };
  enviarDatosAlServidor(user);
});

const enviarDatosAlServidor = (user) => {
  // TODO enviar datos a la api del servidor
  console.table(user);
};
