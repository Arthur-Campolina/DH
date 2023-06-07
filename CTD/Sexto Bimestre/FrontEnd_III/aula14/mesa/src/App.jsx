import React from 'react'
import axios from 'axios'

function App() {
  const [comentarios, setComentarios] = React.useState([])

  const getData = async () => {
    try {
      console.log("Buscando comentários...")
      const response = await axios.get('https://jsonplaceholder.typicode.com/comments')
      setComentarios(response.data)
      console.log(response.data)
    } catch (error) {
      console.error("Error:", error)
    }
  }

  React.useEffect(() => {
    getData()
  }, [])

  return (
    <>
      <ul>
        {comentarios.map(comentario => <li key={comentario.id}>{comentario.body}</li>)}
      </ul>
    </>
  )
}

// Guilherme Cardoso / Rogerio Silva / Arthur Campolina
export default App