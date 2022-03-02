//length
console.log("Oi eu sou o Arthur".length);

//indexOf x lastindexof() - para achar elementos repetidos
console.log("Oi, meu nome é Arthur".indexOf("nome"));

//slice
var texto = "Dias de luta, dias de glória!";
console.log(texto.slice(8,12));

//trim
console.log(texto.trim());

//eplauce
console.log(texto.replace("luta", "glória"));

//Split - cria um array
console.log(texto.split(" "));

//Array - muito importante
let lista = ["Marcos", "João", "Fulano", 25, true];
console.log(lista[0]);//exibe uma posição
lista[4] = "Novo";
console.log(lista); 
lista.push("Joaquim", "Maria");
console.log(lista);
let listaUltimo = lista.pop();
console.log(lista);
console.log(listaUltimo);
let listaPrimeiro = lista.shift();
console.log(lista);
console.log(listaPrimeiro);
let listaAdd = lista.unshift("Outro");
console.log(lista);
console.log(listaAdd);
//.join transforma o array em string

//retorna se existe o valor citado
console.log(lista.includes("Fulano"));