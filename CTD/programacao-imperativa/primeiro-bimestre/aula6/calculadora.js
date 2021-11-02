//CALCULADORA NIVEL 1
//2
function adicionar (x,y){
       return(x+y);
}

//3
function subtracao (x,y){
return(x-y);
}

//4
function multiplicacao (x,y){
return(x*y);
}

//5
function divisao (x,y){
return(x/y);
}


//CALCULADORA NIVEL 2
//1
console.log ("-------------- Teste de Operações / Calculadora --------------");

//2
function subtrai (x,y){
    return subtracao(x,y);
}
console.log(subtrai(4,2));

function soma (x,y){
    return adicionar(x,y);
}
console.log(soma(4,2));

//3
function multiplica(x,y){
    return multiplicacao(x,y)
}
console.log (multiplica(5,5));

//4
function divide(x,y){
    return divisao(x,y)
}
console.log (divide(5,5));

//5
function divide(x,y){
    return divisao(x,y)
}
console.log (divide(5,0));

//CALCULADORA NIVEL 3
//1
function quadradoDoNumero (x){
return multiplicacao(x,x);
}
console.log(quadradoDoNumero(5));

//2
function mediaDeTresNumeros (x,y,z){
let result = adicionar(x,y);
return (adicionar(result, z)/3);
}
console.log(mediaDeTresNumeros(2,4,6));

//3
function calculaPorcentagem (x,y){
let result = y/100;
return multiplicacao(x,result);
}
console.log(calculaPorcentagem(100,15));