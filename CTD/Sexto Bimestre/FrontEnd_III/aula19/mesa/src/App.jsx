import './App.css'
import React, { useState } from 'react'
import LanguageContext, { languages } from './contexts/context';
import Navbar from './components/Navbar';
import Body from './components/Body';

function App() {

  const [language, setLanguage] = useState(languages.english);

  const handleChangeLA = () => {
    console.log(language)
    language.id === "EN" ? setLanguage(languages.portuguese) : setLanguage(languages.english)
  }

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