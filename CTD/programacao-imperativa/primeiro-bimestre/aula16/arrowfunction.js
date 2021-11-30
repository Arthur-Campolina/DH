// Arrow Function
let soma = (a,b) => a + b;
console.log(soma(10,15));

// Call Back - em um determinado tempo estipulado ela executará uma função
setTimeout(function(){
    console.log("Olá");
}, 1000);

// Micro desafio Call Back
function acaoCarro(callback){
    return callback();
}

function andar(){
    console.log("O carro está andando");
}

function parar(){
    console.log("O carro parou");
}

acaoCarro(andar);