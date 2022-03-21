// Captrurar informações e obter valores.

let nomeESobrenome = document.getElementById('nome');
let idade = document.getElementById('idade'); 
let altura = document.getElementById('açtura');
let biografia = document.getElementById('biografia');
let botaoSalvar = document.getElementById('salvar');
let listaItens = document.getElementById('listaItens');

botaoSalvar.addEventListener('click', function(evento){

    evento.preventDefault();

    console.log(nomeESobrenome.value);
    console.log(idade.value);
    console.log(altura.value);
    console.log(biografia.value);
});

// Normaliza