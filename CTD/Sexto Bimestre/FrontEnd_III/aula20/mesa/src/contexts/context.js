import React from 'react';
import EN from "./languages/english.json"
import PTBR from "./languages/portuguese.json"

export const languages = {
    english: {
        id: "EN",
        text: EN
    },
    portuguese: {
        id: "PTBR",
        text: PTBR
    },
};

const LanguageContext = React.createContext(languages);

export default LanguageContext;