// importamos la función suma
const  { suma }  = require ("../suma");

// test("Prueba de números enteros" , ()=>{} );
test("Prueba de números enteros" , ()=>{
    expect( suma(5,3) ).toBe(8);
    expect( suma(0,0) ).toBe(0);
    expect( suma(1_000, 2_000) ).toBe(3_000);
});

