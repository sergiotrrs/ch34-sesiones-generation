/*
Exercise #4

let student1Courses = ['Math', 'English', 'Programming'];
let student2Courses = ['Geography', 'Spanish', 'Programming'];
Create a program that loops over the 2 arrays; if there are any 
common courses print them out to the console.

*/

// Arreglos de cursos de dos estudiantes
let student1Courses = ["Math", "English", "Programming"];
let student2Courses = ["Geography", "Spanish", "Programming"];

// ==================== Solution 1 ============================
/**
 * Encuentra los cursos en común entre dos arreglos de cursos
 * de estudiantes y los retorna como un nuevo arreglo.
 *
 * @param {string[]} courses1 - Arreglo de cursos del primer estudiante.
 * @param {string[]} courses2 - Arreglo de cursos del segundo estudiante.
 * @returns {string[]} - Arreglo de cursos en común.
 */
function findCommonCourses(courses1, courses2) {
  const commonCourses = [];

  for (let i = 0; i < courses1.length; i++) { // iterar cada elemento de courses1
    const course = courses1[i];
    for (let j = 0; j < courses2.length; j++) { // iterar cada elemento de courses2
      if (course === courses2[j]) { // comparar cada elemento de courses1 con cada elemento de courses2
        commonCourses.push(course);
      }
    }
  }
  return commonCourses;
}

const commonCourses = findCommonCourses(student1Courses, student2Courses);
console.log("Common courses: ", commonCourses);

// ==================== Solution 2 ============================

/**
 * Find common courses between two arrays using the filter method.
 *
 * @param {string[]} array1 - The array of courses for the first student.
 * @param {string[]} array2 - The array of courses for the second student.
 * @returns {string[]} - An array of common courses.
 */
function findCommonCoursesUsingFilter(courses1, courses2) {
  /*
   * La función `filter` se utiliza para crear un nuevo arreglo que contiene
   * los elementos que cumplen con la condición especificada. En este caso,
   * se compara cada elemento en `courses1` con `courses2` utilizando `includes`
   * para verificar si existe en `courses2`. Si existe, se agrega al nuevo arreglo.
   */
  return courses1.filter(course => courses2.includes(course));
}

const commonCoursesUsingFilter = findCommonCoursesUsingFilter(student1Courses, student2Courses);
console.log("Common courses: ", commonCoursesUsingFilter);
