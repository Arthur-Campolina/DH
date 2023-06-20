import React, { useContext } from 'react'
import "../App.css"
import LanguageContext from '../contexts/context'

const Navbar = () => {
    const { language, handleChangeLA } = useContext(LanguageContext)
    const { text } = language

    return (
        <div className="navbar">
            <p>{text.home}</p>
            <p>{text.current}</p>
            <button onClick={handleChangeLA}>{text.button}</button>
        </div>
    )
}

export default Navbar

// title: string;
//         description: string;
//         home: string;
//         current: string;
//         button: string;