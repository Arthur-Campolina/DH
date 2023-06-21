import './App.css'
import React from 'react'
import LanguageContext, { languages } from './contexts/context';
import Navbar from './components/Navbar';
import Body from './components/Body';

function App() {

  function languageReducer(state, action) {
    switch (action.type) {
      case "PTBR":
        return action.payload
      case "EN":
        return action.payload
      default:
        return state
    }
  }
  const [language, dispatch] = React.useReducer(languageReducer, languages.english)
  const handleChangeLA = () => {
    dispatch({
      type: language.id === "EN" ? "PTBR" : "EN",
      payload: language.id === "EN" ? languages.portuguese : languages.english
    })
  }

  const cards = [
    {
      id: 1,
      title: "Oi",
      description: "Você"
    },
    {
      id: 2,
      title: "Oi",
      description: "Você"
    },
    {
      id: 3,
      title: "Oi",
      description: "Você"
    }
  ]

  const [languageCards, dispatch2] = React.useReducer(cardReducer, cards)
  const handleDelete = (id) => {
    dispatch2({
      type: "DELETE",
      payload: id
    })
  }

  function cardReducer(state, action) {
    const id = state
    if (action = "DELETE") {
      const newArray = languageCards.filter((card) => card.id !== id)
      return newArray
    }
  }


  React.useEffect(() => {
    const languageStorage = localStorage.getItem("language")
    const cardsStorage = localStorage.getItem("cards")
    if (languageStorage) {
      dispatch({
        type: languageStorage,
        payload: languageStorage === "EN" ? languages.english : languages.portuguese
      })
    }
    if (cardsStorage) {
      dispatch({
        type: "cards",
        payload: JSON.parse(cardsStorage)
      })
    }
  }, [])
  React.useEffect(() => {
    localStorage.setItem("language", language.id)
    localStorage.setItem("cards", JSON.stringify(languageCards))
  }, [language])

  return (
    <div className="App">
      <>
        <LanguageContext.Provider value={{ language, handleChangeLA, languageCards }}>
          <Navbar />
          <Body />
        </LanguageContext.Provider>
        <footer>
          <h1>Leonardo Almeida, Cauê Silveira, Felipe Rodrigues e Arthur Campolina</h1>
        </footer>
        <button onClick={handleDelete}>Delete</button>
      </>
    </div>
  )
}

export default App