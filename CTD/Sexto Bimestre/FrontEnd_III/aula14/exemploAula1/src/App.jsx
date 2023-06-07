import React from "react"
import axios from "axios"

function App() {
  const [estados, setEstados] = React.useState([])
  const [cidades, setCidades] = React.useState([])
  const [estadoSelecionado, setEstadoSelecionado] = React.useState("")

  const buscaEstadosApi = async () => {
    try {
      console.log("Buscando Estados...")
      const response = await axios.get('https://servicodados.ibge.gov.br/api/v1/localidades/estados')
      setEstados([{ id: 0, sigla: "Selecione..." }, ...response.data])
    } catch (error) {
      console.error("error:", error)
    }
  }
  const buscaCidadeApi = async () => {
    try {
      console.log("Buscando Cidades...")
      const response = await axios.get(`https://servicodados.ibge.gov.br/api/v1/localidades/estados/${estadoSelecionado}/municipios`)
      setCidades(response.data)
    } catch (error) {
      console.error("error:", error)
    }
  }

  React.useEffect(() => {
    buscaEstadosApi()
  }, [])
  React.useEffect(() => {
    buscaCidadeApi()
  }, [estadoSelecionado])

  return (
    <>
      <h5>Selecione...</h5>
      <select
        onChange={(e) => setEstadoSelecionado(e.target.value)}
        value={estadoSelecionado}
      >
        {estados.map(estado => <option key={estado.id} value={estado.sigla}>{estado.nome}</option>)}
      </select>
      {estadoSelecionado &&
        <>
          <h5>Estado: {estadoSelecionado}</h5>
          <h5>Cidades: </h5>
          <ul>
            {
              cidades.map(cidade => <ul key={cidade.id}>{cidade.nome}</ul>)
            }
          </ul>
        </>
      }
    </>
  )
}
export default App

//api IBGE - https://servicodados.ibge.gov.br/api/docs