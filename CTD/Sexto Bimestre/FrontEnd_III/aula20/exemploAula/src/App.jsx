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
    console.log(language)
    dispatch({
      type: language.id === "EN" ? "PTBR" : "EN",
      payload: language.id === "EN" ? languages.portuguese : languages.english
    })
  }

  React.useEffect(() => {
    const languageStorage = localStorage.getItem("language")
    if (languageStorage) {
      dispatch({
        type: languageStorage,
        payload: languageStorage === "EN" ? languages.english : languages.portuguese
      })
    }
  }, [])
  React.useEffect(() => {
    localStorage.setItem("language", language.id)
  }, [language])

  return (
    <div className="App">
      <>
        <LanguageContext.Provider value={{ language, handleChangeLA }}>
          <Navbar />
          <Body />
        </LanguageContext.Provider>
        <footer>
          <h1>Iccaro Oliveira, Gustavo Felipe, Ariane França e Arthur Campolina</h1>
        </footer>
      </>
    </div>
  )
}

export default App