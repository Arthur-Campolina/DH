//Crie uma função que converta polegadas em centímetros. Recebe pelo parâmetro polegadas e retorna seu equivalente em centímetros.

function centímetros (x){
console.log(x*2.54);
}
centímetros (5);

// Crie uma função que receba uma string e a converta em um URL. ex: "funcaojs" é retornado como "http://www.funcaojs.com.br"

function url (x){
       return("http://www." +x+ ".com.br");
}

console.log (url("funcaojs"));