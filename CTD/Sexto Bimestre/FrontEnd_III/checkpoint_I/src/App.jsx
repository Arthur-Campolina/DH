import React from 'react'

import { MyCard } from "./components/MyCard/MyCard";
import "./styles.css";

const teams = [
  {
    nameAndPosition: "Cruzeiro100",
    country: "Brasil"
  },
  {
    nameAndPosition: "Flamengo93",
    country: "Brasil"
  },
]

function App() {
  const [nameAndPosition, setNameAndPosition] = React.useState("");
  const [country, setCountry] = React.useState("");
  const [cards, setCards] = React.useState(teams);
  const [statusMessage, setstatusMessage] = React.useState(false)
  const countrystatusMessage = country.length >= 3
  console.log("countrystatusMessage", countrystatusMessage)
  const nameAndPisitionstatusMessage = /^(?=.*\d).{6,}$/.test(nameAndPosition)
  console.log("nameAndPisitionstatusMessage", nameAndPisitionstatusMessage)

  const handleChangeNameAndPosition = (event) => {
    setNameAndPosition(event.target.value)
  }
  const handleChangeCountry = (event) => {
    setCountry(event.target.value.trim())
  }
  const handleSubmit = (event) => {
    event.preventDefault();
    const newCard = {
      nameAndPosition,
      country
    }
    if (nameAndPisitionstatusMessage && countrystatusMessage) {
      setCards(previousArray => [...previousArray, newCard])
      setstatusMessage(false)
    }
    if (!nameAndPisitionstatusMessage || !countrystatusMessage) {
      setstatusMessage(true)
    }
    console.log("cards", cards)
  }

  return (
    <div className="container">
      <h1>Insira o Time do Seu ❤</h1>
      <form className="form" onSubmit={handleSubmit}>
        <div className="container_input">
          <label>País:</label>
          <input
            type="text"
            placeholder="Brasil"
            value={country}
            onChange={handleChangeCountry}
          />
          <label>Nome + Posição:</label>
          <input
            type="text"
            placeholder="Atlético1"
            value={nameAndPosition}
            onChange={handleChangeNameAndPosition}
          />

        </div>
        {statusMessage &&
          <h5>Por favor, verifique os dados inseridos no formulário!</h5>
        }
        <br />
        <button>salvar</button>
      </form>

      <div className="container">
        {
          cards.map(team => <MyCard
            nameAndPosition={team.nameAndPosition}
            country={team.country}
            key={`${team.nameAndPosition}/${team.country}/Math.random()`}
          />)
        }
      </div>
    </div>
  );
}

export default App;
