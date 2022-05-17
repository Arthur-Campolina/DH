// Exercício de Fixação

let dados = {
    "nome": "Christopher",
    "profissao": "Programador",
    "idade": 25,
    "linguagens": ["PHP", "Javascript", "Dart"],
    "disponibilidade ParaViajar": true,
    "ramo Profissional": {
        "anos DeExperiencia": 12,
        "nivel": "Senior"
    }
}
// Qual rede social você acha que pode ser um JSON que tem os seguintes dados?
// R: Linkedin

// EXERCÍCIO 1

let usuario = {
    nConta : 123445,
    tipoConta : "cc",
    saldo : 100000000,
    titularConta: "Raquel França"
}

// EXERCÍCIO 2
let contaTeste = {
    nConta : 123445,
    tipoConta : "cc",
    saldo : 100000000,
    titularConta: "Raquel França"
}
console.log(contaTeste.nConta);

// EXERCÍCIO 3
function Usuario (nConta, tipoConta, saldo, titularConta){
    this.nConta = nConta;
    this.tipoConta = tipoConta;
    this.saldo = saldo;
    this.titularConta = titularConta
}
