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

//Crie uma função que recebe uma string e retorna a mesma frase, mas com o caracter de exclamação ( ! ).

function url2 (x){
       return("http://www." +x+ ".com.br!" );
}
console.log (url2("funcaojs"));

//Crie uma função que calcule a idade dos cachorros, considerando que 1 ano humano, equivale a 7 anos para eles.

function idadeCachorro (x){
       return(x*7);
}
console.log(idadeCachorro(5));

//Crie uma função que calcule o valor da sua hora de trabalho, tendo como parâmetro o seu salário mensal.

function horaTrabalho (s,h){
       return(s/h);
}
console.log(horaTrabalho(2500,160));

//Crie a função calculadora de IMC* de uma pessoa, que recebe a altura em centímetros e o peso em quilogramas. Em seguida, execute a função, testando diferentes valores. 

function IMC (A,P){
       return(P/(A*A));
}
console.log (IMC(1.78,95));

//Crie uma função que receba uma string em minúsculas, converta-a em maiúsculas e as retorne. Investigue o que o método de .toUpperCase() faz

function converter (x){
       let min = x;
       return min.toUpperCase();
}
console.log(converter("hello world!"));

//Crie uma função que receba um parâmetro e retorne o tipo de dado deste parâmetro.
function tipoDado (x){
       return typeof x;
}
console.log(tipoDado("Hello World"));

//Crie uma função pela qual passamos o raio de um círculo e ela retorna a circunferência. C = 2 * π * r

function circulo (c){
       return (c*Math.PI);
}
console.log(circulo(5));