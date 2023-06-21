import React from 'react'
import LanguageContext from '../contexts/context'

const Body = () => {

    const { languageCards } = React.useContext(LanguageContext)
    return (
        <div>
            {languageCards.map((card) => (
                <div key={card.id}>
                    <h1>{card.title}</h1>
                    <p>{card.description}</p>
                </div>)
            )}

        </div>
    )
}

export default Body