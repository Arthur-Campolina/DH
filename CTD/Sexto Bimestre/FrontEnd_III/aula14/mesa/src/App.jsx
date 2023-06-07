import React from 'react'
import axios from 'axios'
import { MyCard } from './components/MyCard/MyCard'

function App() {
  const [comentarios, setComentarios] = React.useState([])
  const [nome, setNome] = React.useState("")
  const [email, setEmail] = React.useState("")
  const [comentario, setComentario] = React.useState("")
  const [shouldShow, setShouldShow] = React.useState(false)

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

  const postData = async (body) => {
    try {
      console.log("Criando comentário...")
      await axios.post('https://jsonplaceholder.typicode.com/posts', body)
      console.log("Comentário criado...")
    } catch (error) {
      console.error("Error:", error)
    }
  }

  React.useEffect(() => {
    getData()
  }, [])

  const onClickHandler = () => {
    const body = {
      title: email,
      body: comentario,
      userId: 1,
    }
    postData(body)
  }

  return (
    <>
      <h3>Deseja ver comentários</h3>
      <button onClick={() => setShouldShow(!shouldShow)}>Click</button>
      <form>
        <br />
        <label>Nome: </label>
        <input type='text' value={nome} onChange={(e) => setNome(e.target.value)} />
        <br />
        <label>E-mail: </label>
        <input type='email' value={email} onChange={(e) => setEmail(e.target.value)} />
        <br />
        <label>Comentário: </label>
        <input type='text' value={comentario} onChange={(e) => setComentario(e.target.value)} />
      </form>
      <br />
      <button onClick={onClickHandler}>Inserir</button>
      {shouldShow &&
        <ul>
          {comentarios.map((c) => <MyCard key={c.id} body={c.body} email={c.email} name={c.name} />)}
        </ul>
      }
    </>
  )
}

// Guilherme Cardoso / Rogerio Silva / Arthur Campolina
export default App