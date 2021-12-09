const students = require('./students')

const course = {
    name: "Programação Imperativa",
    minGrade: 70,
    maxAbsence: 4,
    studentsList: students
}

module.exports = course;