import './App.css'
import React from 'react'

const initialStudents = [
  {
    id: 1,
    nome: "Arthur",
    sobrenome: "Campolina"
  },
  {
    id: 2,
    nome: "Leonardo",
    sobrenome: "Almeida"
  },
  {
    id: 3,
    nome: "Cauê",
    sobrenome: "Silveira"
  },
  {
    id: 4,
    nome: "Filipe",
    sobrenome: "Rodrigues"
  }
]

const reducer = (state, action) => {
  console.log(state, action)
  switch (action.type) {
    case "DELETE":
      const newStudentsArray = state.filter((student) => student.id !== action.id)
      return newStudentsArray
    case "LOCALSTORAGE-STATE":
      return action.payload
    default:
      return state
  }
}

function App() {
  const [students, dispatch] = React.useReducer(reducer, initialStudents)
  const deleteHandler = (id) => {
    dispatch({
      type: "DELETE",
      id: id
    })
  }
  React.useEffect(() => {
    const localStorageStudents = localStorage.getItem("students")
    if (localStorageStudents) {
      const parsedData = JSON.parse(localStorageStudents)
      dispatch({
        type: "LOCALSTORAGE-STATE",
        payload: parsedData
      })
    }
  }, [])
  React.useEffect(() => {
    localStorage.setItem("students", JSON.stringify(students))
  }, [students])
  return (
    <div className="App">
      {students.map((student) => (
        <div key={student.id}>
          <h1>{student.nome}</h1>
          <h2>{student.sobrenome}</h2>
          <button onClick={() => deleteHandler(student.id)}>Delete</button>
        </div>
      ))}
    </div>
  )
}

export default App