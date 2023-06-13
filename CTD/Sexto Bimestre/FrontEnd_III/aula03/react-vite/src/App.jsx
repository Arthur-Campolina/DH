import { useState } from 'react'
import Hello from './Hello'

const person = {
  name: 'Arthur',
  surname: 'Campolina',
  age: 32
}

const App = () => {
  const [count, setCount] = useState(0)
  const [render, setRender] = useState(false)
  const buttonHandler = () => {
    setRender(current => !current)
  }

  return (
    <>
      <div>
        <Hello person={person} />
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
