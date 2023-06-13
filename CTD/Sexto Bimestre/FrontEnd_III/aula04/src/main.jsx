import ReactDOM from 'react-dom/client'
import App from './App.jsx'
import Hello from './Hello.jsx'

const people = [
  {
    name: 'Arthur',
    origin: 'Brasil'
  },
  {
    name: 'João',
    origin: 'México'
  },
  {
    name: 'Ahmed',
    origin: 'Arábia'
  },
  {
    name: 'Jhon',
    origin: 'America'
  },
]

ReactDOM.createRoot(document.getElementById('root')).render(
  <App>
    {people.map((person) => {
      return (<Hello name={person.name} origin={person.origin} key={`${person.name}/${person.origin}`} />)
    })
    }
  </App>
)
