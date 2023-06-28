import './App.css'
import React from 'react'
import { Card } from './components/card'
import { Form } from './components/Form'
import { TasksContext } from './contexts/Contexts'
import { useApi } from './Hooks/useApi'

const initialTasks = [
  {
    id: 1,
    action: "Criar e-mail para novo usuário",
    time: 5
  },
  {
    id: 2,
    action: "Olhar problema com o OneDrive do usuário",
    time: 15
  },
]

const reducer = (state, action) => {
  console.log("Type: ", action.type, "Payload: ", action.payload)
  switch (action.type) {
    case "CREATE-TASK":
      return action.payload
    case "DELETE-TASK":
      const newTasksArray = state.filter((student) => student.id !== action.payload)
      return newTasksArray
    case "LOCALSTORAGE-STATE":
      return action.payload
    default:
      return state
  }
}

function App() {
  const [tasks, dispatch] = React.useReducer(reducer, initialTasks)
  React.useEffect(() => {
    const localStorageTasks = localStorage.getItem("tasks")
    if (localStorageTasks) {
      const parsedData = JSON.parse(localStorageTasks)
      dispatch({
        type: "LOCALSTORAGE-STATE",
        payload: parsedData
      })
    }
  }, [])
  React.useEffect(() => {
    localStorage.setItem("tasks", JSON.stringify(tasks))
  }, [tasks])

  return (
    <div className="App">
      <TasksContext.Provider value={{ tasks, dispatch }}>
        <Form />
        <br />
        <Card />
      </TasksContext.Provider>
    </div>
  )
}

export default App