// Manipulando o DOM

const nameUser = prompt("Qual o seu nome?");

const titleTag = document.createElement('h1');
const titleText = document.createTextNode(`Olá, ${nameUser}`);

titleTag.appendChild(titleText);
document.body.appendChild(titleTag);

let titleSelect = document.querySelector('h1').innerText += '. Seja bem-vindo!';

let titleStyle = document.querySelector('h1');
titleStyle.style.color = 'blue';
titleStyle.style.fontSize = '25px';
titleStyle.style.textAlign = 'center';
titleStyle.style.backgroundColor = 'black';

document.querySelector('title').innerText = 'Welcome!';
