// // Micro desafio - Passo 1
// // ------------------------------------------------------
const students = require('./students');

const studentsList = [
    new students("Kened", 4,[90,87,78,94]),
    new students("Cristian", 1,[88,97,94,94]),
    new students("Rodrigo", 3,[90,77,91,88]),
    new students("Thiago", 0,[77,95,82,91])
]

console.log(studentsList);

// // Micro desafio - Passo 2
// // ------------------------------------------------------

a1 = new students("Thiago", 0,[77,95,82,91]);
console.log(a1.averageGrade());

// // // // Micro desafio - Passo 3
// // // ------------------------------------------------------
// // // Feito em course.js


// // // // Micro desafio - Passo 4
// // // ------------------------------------------------------
const addStudent = studentsList;
addStudent.push("João da Cove", 2, [77,95,82,91]);
console.log(addStudent);

// // // // Micro desafio - Passo 5
// // // ------------------------------------------------------

function approved (student, course){
(student.grade <= course.minGrade && student.absence < course.maxAbsence) || (student.grade >= 1.1 * course.minGrade && student.absence === course.maxAbsence) ? true : false
};
console.log(approved("Cristian","Programação Imperativa"));

// // // // Micro desafio - Passo 6
// // // ------------------------------------------------------
// // não sei fazer

// // // // Micro desafio - Passo 7
// // // -----------------------------------------------------
// // não sei fazer