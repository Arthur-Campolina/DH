import React from "react"

import "./styles.css";
import { MyRow } from "./MyRow";

function App() {
  const [qtdStudentsBD, setQtdStudentsBD] = React.useState(0)
  const [sumGradesBD, setSumGradesBD] = React.useState(0)
  const [qtdStudentsBE, setQtdStudentsBE] = React.useState(0)
  const [sumGradesBE, setSumGradesBE] = React.useState(0)
  const [qtdStudentsFE, setQtdStudentsFE] = React.useState(0)
  const [sumGradesFE, setSumGradesFE] = React.useState(0)
  const [qtdStudentsDO, setQtdStudentsDO] = React.useState(0)
  const [sumGradesDO, setSumGradesDO] = React.useState(0)
  const [subject, setSubject] = React.useState("")
  const [grade, setGrade] = React.useState(0)

  function handleSubmit(event) {
    event.preventDefault();
    if (subject === "database") {
      setQtdStudentsBD(qtdStudentsBD + 1)
      setSumGradesBD(sumGradesBD + grade)
    }
    if (subject === "backend") {
      setQtdStudentsBE(qtdStudentsBE + 1)
      setSumGradesBE(sumGradesBE + grade)
    }
    if (subject === "frontend") {
      setQtdStudentsFE(qtdStudentsFE + 1)
      setSumGradesFE(sumGradesFE + grade)
    }
    if (subject === "devops") {
      setQtdStudentsDO(qtdStudentsDO + 1)
      setSumGradesDO(sumGradesDO + grade)
    }
  }

  return (
    <div className="container">
      <h1>Média de Alunos por Disciplina</h1>
      <form className="form" onSubmit={handleSubmit}>
        <div className="container_input">
          <select defaultValue="Selecione uma disciplina..." onChange={() => setSubject(event.target.value)}>
            <option disabled>Selecione uma disciplina...</option>
            <option value="database">Banco de Dados</option>
            <option value="backend">Desenvolvimento Backend</option>
            <option value="frontend">Desenvolvimento Frontend</option>
            <option value="devops">Devops</option>
          </select>
          <input type="number" min={0} max={10} value={grade} onChange={() => setGrade(Number(event.target.value))} />
        </div>
        <input type="button" value="Salvar" onClick={handleSubmit} />
      </form>

      <div className="container">
        <table border="1" className="line_title">
          <thead>
            <tr>
              <th>Disciplina</th>
              <th>Quantidade de Alunos</th>
              <th>Média das notas dos alunos</th>
            </tr>
          </thead>
          <tbody>
            <MyRow subject="Banco de Dados" qtdStudents={qtdStudentsBD} sumGrades={sumGradesBD} />
            <MyRow subject="Desenvolvimento Backend" qtdStudents={qtdStudentsBE} sumGrades={sumGradesBE} />
            <MyRow subject="Desenvolvimento Frontend" qtdStudents={qtdStudentsFE} sumGrades={sumGradesFE} />
            <MyRow subject="Devops" qtdStudents={qtdStudentsDO} sumGrades={sumGradesDO} />
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default App;
