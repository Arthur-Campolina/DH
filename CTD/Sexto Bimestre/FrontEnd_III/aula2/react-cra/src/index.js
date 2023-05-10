import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';
import FunctionTest from './FunctionTest';

const root = ReactDOM.createRoot(document.getElementById('root'));

const nome = 'Arthur'
const profissao = 'Dev'

root.render(
  <>
    <App nome={nome} />
    <FunctionTest profissao={profissao} />
  </>
);

