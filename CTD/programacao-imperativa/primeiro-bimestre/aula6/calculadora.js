//2
function adicionar (x,y){
       return(x+y);
}
console.log (adicionar(5,5));

//3
function subtracao (x,y){
return(x-y);
}
console.log (subtracao(5,5));

//4
function multiplicacao (x,y){
return(x*y);
}
console.log (multiplicacao (5,5))

//5
function divisao (x,y){
return(x/y);
    }
console.log (divisao(5,0));

console.log ("-------------- Teste de Operações / Calculadora --------------");

//3.1
function quadradoDoNumero (x){
return multiplicacao(x,x);
}
console.log(quadradoDoNumero(5));

//3.2
function mediaDeTresNumeros (x,y,z){
let result = adicionar(x,y);
return (adicionar(result, z)/3);
}
console.log(mediaDeTresNumeros(2,4,6));

//3.3
function calculaPorcentagem (x,y){
let result = y/100;
return multiplicacao(x,result);
}
console.log(calculaPorcentagem(100,15));