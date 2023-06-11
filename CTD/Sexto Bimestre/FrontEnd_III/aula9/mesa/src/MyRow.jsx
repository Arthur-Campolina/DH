export const MyRow = ({ subject, qtdStudents, sumGrades }) => {
    let avgGrade = (sumGrades / qtdStudents).toFixed(2)
    if (qtdStudents <= 0) avgGrade = 0
    return (
        <tr>
            <td>{subject}</td>
            <td>{qtdStudents}</td>
            <td>{avgGrade}</td>
        </tr>
    )
}
