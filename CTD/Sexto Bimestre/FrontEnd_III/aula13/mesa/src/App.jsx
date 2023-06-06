import React from 'react'
import { Pedido } from './Pedido'

function App() {
  const [status, setStatus] = React.useState(false)

  React.useEffect(() => {
    setTimeout(() => {
      setStatus(true)
      console.log("O Componente foi Atualizado!")
    }, 2000)

  }, [])

  return (
    <>
      <label>Seu Pedido: </label>
      {status &&
        <span>Pizza</span>
      }
      <br />
      <Pedido />

      <p>Grupo: Ariane França, Cauê Silveira, Dumith Bou, Arthur Campolina</p>
    </>
  )
}

export default App