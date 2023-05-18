import './App.css'
import React from 'react'
import HomeComponent from './components/Home';
import { cities } from './utils/cities';

function App() {

  return (
    <div className="App">
      <HomeComponent items={cities} />
    </div>
  )
}

export default App