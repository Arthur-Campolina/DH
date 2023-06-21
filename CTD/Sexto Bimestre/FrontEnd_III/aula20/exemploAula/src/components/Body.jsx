import React from 'react'
import LanguageContext from '../contexts/context'

const Body = () => {

    const { language } = React.useContext(LanguageContext)
    const { text } = language
    return (
        <div>
            <h1>{text.title}</h1>
            <p>{text.description}</p>
        </div>
    )
}

export default Body