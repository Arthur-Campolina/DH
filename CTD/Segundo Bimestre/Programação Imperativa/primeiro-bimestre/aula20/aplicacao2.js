const listaPessoas = require('./pessoas')

// a média das idades das pessoas que responderam ótimo;

let idade = listaPessoas.filter(idade => idade.opniao === 3);

let mediaIdadeOtimo = (listaIdade) => {
    let { length } = listaIdade;
    return listaIdade.reduce((x, y) => {
        return x + (y.idade / length);
    }, 0);
};

console.log(`A média das idades das pessoas que responderam ótimo é de ${mediaIdadeOtimo(idade).toFixed(0)}anos`)

// a quantidade de pessoas que responderam regular;

let pessoasRegular = 0
for (i = 0; i < listaPessoas.length; i++) {
    if (listaPessoas[i].opniao === 1) {
        pessoasRegular++;
    }
}
console.log(`O total de pessoas que responderam regular é de ${pessoasRegular}.`)

// a porcentagem de pessoas que responderam bom entre todos os espectadores analisados.

let pessoasBom = 0
for (i = 0; i < listaPessoas.length; i++) {
    if (listaPessoas[i].opniao === 2) {
        pessoasBom++;
    }
}
let percentual = (pessoasBom/listaPessoas.length)*100;
console.log(`O total de pessoas que responderam regular é de ${percentual}%.`)