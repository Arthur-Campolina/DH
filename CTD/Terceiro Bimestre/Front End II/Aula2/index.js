// Capiturar informção e exibir
// ---- Alert
let user = "Arthur"

alert(`User ${user} was successfully logged on!`);

// ---- Confirm

let confirmAnswer;
confirmAnswer = confirm(`${user} are you sure you want to logoff?`);
console.log(confirmAnswer);

confirmAnswer ? alert("A sessão foi encerrada!") : alert("A sessão não foi encerrada!");

// ---- Prompt e Formas de converter Dados parseInt(), parseFloat(), 

promptUser = prompt("Insert a number", "Number");
alert(parseInt(promptUser) + 10);

//---- Math.random() * (max - min) + min;

let randomNum = Math.random() * 3 + 1;
alert(randomNum)

