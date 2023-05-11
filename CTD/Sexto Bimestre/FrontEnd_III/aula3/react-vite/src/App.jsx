import { useState } from 'react'

const App = ({ person }) => {
  const { name, surname, age } = person
  const [count, setCount] = useState(0)
  const [render, setRender] = useState(false)
  const buttonHandler = () => {
    setRender(current => !current)
  }

  return (
    <>
      <div>
        <p>
          Ola, {name} {surname}! Você tem {age} anos
        </p>
      </div>
      <button onClick={buttonHandler}>Click</button>
      {render &&
        <div>
          <div>
            <button onClick={() => setCount((count) => count + 1)}>
              Add
            </button>
          </div>
          <div>
            <button onClick={() => setCount((count) => count - 1)}>
              Subtract
            </button>
          </div>
          <div>
            <h1>count is {count}</h1>
          </div>
        </div >
      }
    </>
  )
}

export default App
