console.log("JS07 - Promise");

/*
 La promesa(promise) es un patrón asincrónico que se utiliza
 para manejar operaciones asíncronas.

 Las promesas permite realizar tareas asíncronas y
 manejar los resultados (éxito o error) en un momento posterior.

 Las promesas tiene 3 estados:

 1.- Pending: El estado inicial de una promesa antes de que se resuelva o rechace
 2.- Resolved: La promesa se resuelve con un valor
 3.- Rejected: La promesa se rechaza con un razón

Resolve y reject son funciones de callback.
Para crear una promesa se usa el constructor de la clase Promise.

Las promesas proporcionan una forma más estructurada y legible de 
manejar el código asíncrono en comparación con los callbacks 
tradicionales, y son la base para características m
ás modernas como async/await.

sintaxis:
    const pinkyPromise = new Promise ( fncCallBack );

*/

// const pinkyPromise = new Promise( ()=>{} );
// const pinkyPromise = new Promise( (fncCallBackResolve, fncCallBackReject)=>{} );
const pinkyPromise = new Promise((fncCallBackResolve, fncCallBackReject) => {
  const isTeenager = false;

  if (isTeenager) fncCallBackResolve("Hay que estar siempre juntos");
  else fncCallBackReject({ code: 404, message: "Ni te topo" });
});

console.log("=====> Promesas <======");
console.log("Antes de consumir la promesa");

// pinkyPromise(); pinkyPromise is not a function
// Consumir las promesas
// Se usa los métodos then, catch y finaly

// pinkyPromise.then().catch().finally();
/*pinkyPromise
    .then( fncCallback     )  // ejecuta una función de callback si la promesa fue resuelta
    .catch( fncCallback    )  // ejecuta una función de callback si la promesa fue rechazada
    .finally( fncCallback  ); // ejecuta una función de callback 
                            //después de que la promesa fue resuelta o rechazada
 */
pinkyPromise
  .then((response) => console.log(response))
  .catch((error) => console.log(error))
  .finally(() => console.log("Función de Finally"));

console.log("Después de consumir la promesa");

// =======================================

const greeting = (name) => {
  // const myPromise = new Promise( ()=>{} );
  const myPromise = new Promise((resolve, reject) => {
    // saludar a la persona pero:
    // si su nombre comienza con A, retardar 5 s.
    // si comienza co G, retardar 2 s.
    // caso contrario, rechazar la promesa
    if (name.charAt(0) === "a" || name.charAt(0) === "A")
      setTimeout(() => resolve(`Hola ${name}`), 5000);
    else if (name.charAt(0).toLowerCase() === "g")
      setTimeout(() => resolve(`Hi ${name}`), 2000);
    else reject(`Te vi, pero te ignoré ${name} `);
  });

  return myPromise;
};

// greeting("Antonio").then().catch().finally();
/*
greeting("Antonio")
 .then( response => console.log( response ))
 .catch( error => console.log(error ));
 
 greeting("Gaby")
 .then( response => console.log( response ))
 .catch( error => console.log(error ));
 
greeting("Sergio")
 .then( response => console.log( response ))
 .catch( error => console.log(error ));
 
 */
//---------------- consumir las promesas con async y await-------------
/*
 Async y Await facilita la escritura y lectura de código asíncrono.
 Permite escribir código asíncrono de manera similar a cómo se escribiría
 código síncrono.

*/

async function greetingCh34(name) {
  console.log(">>> Inicio de saludo");
  const result = await greeting(name);
  console.log(result);
  console.log("<<< Fin de saludo");
}

const greettingAll = async () => {
  await greetingCh34("Luis");
  await greetingCh34("Alan");
  await greetingCh34("Geo");
};

/**
 * Utilizar para cada función asíncrona un bloque try-catch.
 * En caso de que la promesa sea rechazada, se ejecuta el
 * código en el bloque catch(){} pero no detiene la ejecución
 * de las otras funciones asíncronas.
 */
const greettingTryCatch = async () => {
  try {
    await greetingCh34("Luis");
  } catch (error) {
    console.log(error);
  }
  try {
    await greetingCh34("Alan");
  } catch (error) {
    console.log(error);
  }
  try {
    await greetingCh34("Geo");
  } catch (error) {
    console.log(error);
  }
};

const greettingAllUsingTryCatch = async () => {
  try {
    await greetingCh34("Alan");
    await greetingCh34("Geo");
    await greetingCh34("Luis");
  } catch (error) {
    console.log("La promesa fue rechazada");
    console.warn(error);
  }
};

// greettingAll();
// greettingAllUsingTryCatch();
greettingTryCatch();
