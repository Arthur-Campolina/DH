function students(name, absence, grade) {
    this.name = name;
    this.absence = absence;
    this.grade = grade;
    this.averageGrade = function () {
        let total = 0;
        this.grade.forEach(grade => {total += grade});
        const average = total / this.grade.length;
        return average;
    }
    this.addAbsence = function () { this.absence++ }
    
}

module.exports = students;

