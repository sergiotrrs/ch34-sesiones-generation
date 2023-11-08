/*
Exercise #5

For each of the exercises below, assume you are starting with the following people array.
let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];
1.	Write a command that prints out all of the people in the list.
2.	Write the command to remove "Dani" from the array.
3.	Write the command to remove "Juan" from the array.
4.	Write the command to move "Luis" to the front of the array.
5.	Write the command to add your name to the end of the array.
6.	Using a loop, iterate through this array and after console.log "Maria", exit from the loop. (usar break)
7.	Write the command that gives the indexOf where "Maria" is located.

*/

const people = ["Maria", "Dani", "Luis", "Juan", "Camila"];

//1.	Write a command that prints out all of the people in the list.
// ==================== Solution 1 ============================
console.log("1.-" + people);
// ==================== Solution 2 ============================
const printAll = peopleArr => peopleArr.forEach( person => console.log(person))
printAll(people)


//2.	Write the command to remove "Dani" from the array.
// ==================== Solution 1 ============================
//people.splice(1, 1);
//console.log("2.-" + people);
// ==================== Solution 2 ============================
// Búsqueda dinámica

function removeFromArray (personToRemove, peopleArr) {
  if ( peopleArr.includes(personToRemove)){  
    return peopleArr.splice(peopleArr.indexOf(personToRemove), 1);
  }
  return peopleArr;
}
removeFromArray("Dani", people)
console.log("2.-" + people);


//3.	Write the command to remove "Juan" from the array.
// ==================== Solution 1 ============================
//people.splice(2, 1);
//console.log("3.-" + people);
// ==================== Solution 2 ============================
removeFromArray("Juan", people)
console.log("3.-" + people);

//4.	Write the command to move "Luis" to the front of the array.
function moveToFront(peopleArr, personToMove) {
  const index = peopleArr.indexOf(personToMove);
  if (index !== -1) {
    peopleArr.splice(index, 1); // remover persona
    peopleArr.unshift(personToMove); // agregar persona al inicio
  }
  return peopleArr;
}

moveToFront( people, "Luis")
console.log("4.-" + people);

//5.	Write the command to add your name to the end of the array.
people.push("Serch");
console.log("5.-" + people);

//6.	Using a loop, iterate through this array and after console.log "Maria", exit from the loop.
for (let i = 0; i < people.length; i++) {
  console.log("6.-" + people[i]);
  if (people[i] == "Maria") break;
}

//7.	Write the command that gives the indexOf where "Maria" is located.
console.log("7.-" + people.indexOf("Maria"));
