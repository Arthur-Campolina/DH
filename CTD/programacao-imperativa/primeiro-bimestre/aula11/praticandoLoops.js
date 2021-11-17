console.log("_________________")
console.log("Exercício 1:")
for(let contador = 1; contador <=5; contador++){
    console.log("Ola Mundo!");
}
console.log("_________________")
console.log("Exercício 2:")
for(let contador = 1; contador <=10; contador = contador + 2){
    console.log(contador);
}
console.log("_________________")
console.log("Exercício 3:")
var multiplicador = 2;
for(let contador = 1; contador <=10; contador = contador++){
    console.log(multiplicador, " vezes", contador, " = ",(multiplicador*contador++));
}