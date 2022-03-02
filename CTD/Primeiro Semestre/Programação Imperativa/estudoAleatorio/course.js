const students = require('./avaliacaoFinal')

const course = {
    name: "Programação Imperativa",
    minGrade: 70,
    maxAbsence: 4,
    studentsList: students
}

module.exports = course;
console.log(course)