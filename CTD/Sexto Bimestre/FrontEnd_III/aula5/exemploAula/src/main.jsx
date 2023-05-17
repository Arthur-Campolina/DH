import ReactDOM from 'react-dom/client'

import "./styles.css"
import style from './carStyle.module.css'
import { cars } from '../utils/cars.js'
import App from './App.jsx'
import Car from './Cars.jsx'

ReactDOM.createRoot(document.getElementById('root')).render(
  <App>
    <h1 className={style.h3}>Cars</h1>
    {cars.map((car) => {
      const { make, model, year } = car
      return (
        <Car
          make={make}
          model={model}
          year={year}
          key={`${make}/${model}/${year}`}
        />)
    })
    }
  </App>
)
