import ReactDOM from 'react-dom/client'
import App from './App.jsx'

const person = {
  name: "Arthur",
  surname: "Campolina",
  age: 32
}

ReactDOM.createRoot(document.getElementById('root')).render(
  <App person={person} />
)
