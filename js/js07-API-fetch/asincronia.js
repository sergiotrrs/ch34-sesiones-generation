console.log("JS07-Asincronía La Rosalía");

/*
 Programación Síncrona.

 - En un programa síncrono, las operaciones se ejecutan 
 una después de la otra, en orden secuencial.
 - Cada operación espera a que la anterior se complete 
 antes de comenzar.
 - Puede haber bloqueo del hilo principal mientras 
 se espera la finalización de una operación.

*/
const primerPaso = () =>{
    console.log("01- Inicio del mi programa");
}
const segundoPaso = () =>{
    console.log("02- Desarrollo del mi programa");
}
const tercerPaso = () =>{
    console.log("03- Fin de mi programa");
}

primerPaso(); // 01- Inicio del mi programa
segundoPaso(); // 02- Desarrollo del mi programa
tercerPaso(); // 03- Fin de mi programa

/*
 Programación Asíncrona.
  - En un programa asíncrono, las operaciones no esperan 
  a que la anterior se complete antes de comenzar. 
  En cambio, se utilizan mecanismos como callbacks, 
  promesas o async/await para manejar la asincronía.
  - Las operaciones que pueden llevar tiempo (por ejemplo, 
    solicitudes de red o lecturas de archivos) no bloquean el hilo principal.
  - Esto mejora la eficiencia al permitir que otras operaciones 
  se ejecuten mientras se espera la finalización de una 
  operación asincrónica.

*/

/*
   setTimeout()

   Establece un temporizador que ejecuta una función de callback
   una vez que expire el temporizador

   sintaxis:
     setTimeout( fncCallback, tiempo_ms, argumentos_fnc );
     setTimeout( ()=>{}  , tiempo_ms );

 */

const pasoAsincrono = ( name ) =>{    
    setTimeout( ()=> console.log(`Hola ${name}`)  , 2000 );
}

console.log("====== Asíncrono =====");
// primerPaso(); 
// pasoAsincrono("Jorge"); 
// tercerPaso(); 
/*
// 01- Inicio del mi programa
// 03- Fin de mi programa

// 2s -> Hola Jorge
*/

// ------------------------- setInterval ------------------------
// Ejecuta una función de manera reiterada con un tiempo de retardo fijo
// setInterval retorna un ID del itervalo ejecutado

const startInterval = document.getElementById("startInterval");
const stopInterval = document.getElementById("stopInterval");
const resetInterval = document.getElementById("resetInterval");
const counterRef = document.getElementById("counter");
let counter = 0;
let intervalId;

startInterval.addEventListener( "click" , (event)=>{
    intervalId = setInterval( () => mostrarEnHtml(++counter), 1000 );
    console.log("interval ID: ", intervalId );
    disableStartButton(true);
    disableStopButton(false);
    disableResetButton(true)
} );

const mostrarEnHtml = (valor) => {
    document.getElementById("counter").innerHTML = valor;
    console.log(valor);
}

stopInterval.addEventListener( "click", () =>{
    // Detener el intervalo
    clearInterval(  intervalId  );
    disableStartButton(false);
    disableStopButton(true);
    disableResetButton(false)
});

resetInterval.addEventListener( "click", () =>{
 counter = 0;
 mostrarEnHtml( 0 );
});


const disableStartButton = ( value ) => {
    startInterval.disabled = value;
}

const disableStopButton = ( value ) => {
    stopInterval.disabled = value;
}

const disableResetButton = ( value ) => {    
    resetInterval.disabled = value;
    resetInterval.style.display = value ? "none" : "inline";
}

( function(){
    disableStartButton( false);
    disableStopButton(true);
    disableResetButton(true);
} )();