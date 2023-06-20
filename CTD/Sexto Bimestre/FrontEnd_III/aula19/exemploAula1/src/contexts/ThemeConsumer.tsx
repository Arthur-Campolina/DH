import React from "react";
import { ThemeContext } from "./ThemeContext";

export const ThemeConsumer = ({ children }) => {
  const { theme } = React.useContext(ThemeContext);
  return <div className={theme.appTheme}>{children}</div>;
};
