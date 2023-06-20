
import HomeCard from "../Home/HomeCard";
import hoteis from "../../hoteis.json";


import React from 'react';
import { ThemeContext, themes } from "../../contexts/ThemeContext";


function Home() {
    const [theme, setTheme] = React.useState(themes.light)
    const themeToggleHandler = () => {
        theme == theme.dark ? setTheme(theme.light) : setTheme(theme.dark)
    }

    return (
        <>
            <ThemeContext.Provider value={{ theme, themeToggleHandler }} >
                <h1>Hoteis disponíveis</h1>

                <div style={
                    {
                        display: "flex",
                        flexWrap: "wrap",
                        justifyContent: "center",
                    }
                }>
                    {

                        hoteis.map(
                            (hotel) => {
                                return (
                                    <HomeCard
                                        key={hotel.id}
                                        hotel={hotel}
                                    />
                                )
                            }
                        )


                        /* Exibir Cards dos Hoteis */
                    }
                </div>
            </ThemeContext.Provider>
        </>
    );
}

export default Home;