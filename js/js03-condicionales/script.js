console.log("Sesión Js 03 condicionales");

/*
  ============ Condicional if - else ====================

  La condicional if ejecuta una sentencia si una condición
  especificada es evaluada como verdadera. En caso contrario
  podemos usar la sentencia else.

  Sintaxis:

  if ( condición ) sentencia;

  if (condición ) {
   sentencia1;
   sentencia2;
   sentencia3;
   sentenciaN;
  }

  if ( condición ) 
    sentenciaVerdadera;
  else 
    sentenciaFalsa;

  if ( condición ) sentenciaVerdadera;
  else sentenciaFalsa;


*/

const temperatura = 22;

// Verificar temperatura, si es mayor o igual a 26 grados
// imprimir en consola "Team Calor"
// en caso contrario "Team frio"

if ( temperatura >= 26) {
    console.log("Team calor");
} else {
    console.log("Team frio");
}

if ( temperatura === 21 ) console.log("Temperatura sabrudoski");

console.log("Me pongo short con calcetines");

//====================================
const temp = 20;

if (temp === 15){
  console.log("Frio");
  console.log("Esto no le gusta a Nan");
}
else
  console.log("Temp. a analizar");

// =====================================

const age = 25;

if (age === 50)  /*instrucción*/   ;

 console.log("Estás en el 5o piso");
console.log("Fin de analizar tu edad");
 
// ===================================

function verdadero(){
    return true;
}

if ( verdadero() ) console.log("Resultado verdadero");

console.log("Se termina de analizar la función");

/*
 ================= Sentencia if- else if - else ========
  if (condición ) sentencia;
  else if (condición2 ) sentencia2;
  else if (condiciónN ) sentenciaN;
  else sentenciaFalse;
*/

const color = "negro";
let mensaje = "";
/*
if (color === "negro") {
    mensaje = "Color negro";
}
else {
    if (color === "verde"){
        mensaje = "color verde";
    }
    else {
        if (color === "azul"){            
            mensaje = "color azul";
        }
        else {
            mensaje = "No tengo el color registrado";
        }
    }
}
*/


if (color === "negro")  mensaje = "Color negro";
else if (color === "verde") mensaje = "color verde";    
else if (color === "azul") mensaje = "color azul";           
else mensaje = "No tengo el color registrado";
        
    

