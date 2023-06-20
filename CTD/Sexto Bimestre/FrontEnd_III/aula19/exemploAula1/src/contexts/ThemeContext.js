import React from "react"

const themes = {
    dark: {
        appTheme: "appThemeDark",
    },
    light: {
        appTheme: "appThemeLight",
    }
}

const ThemeContext = React.createContext(themes.dark)

export { themes, ThemeContext }