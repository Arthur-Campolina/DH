import React from 'react'
import { ContadorDeCliques } from './ContadorDeCliques'

export function App() {
  const [checkbox, setCheckbox] = React.useState(false)

  React.useEffect(() => {
    console.log("UseEffect App")
  }, [])

  return (
    <>
      <h1>Olá</h1>

      <label>Exibir contador de cliques</label>
      <input type='checkbox' value={checkbox} onChange={() => setCheckbox(!checkbox)}></input>
      {checkbox &&
        <ContadorDeCliques />
      }
    </>
  )
}