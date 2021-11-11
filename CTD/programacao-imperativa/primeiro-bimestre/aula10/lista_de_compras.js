let produtos = "celular computador tv geladeira fogão";

console.log(produtos.split(" "));
let lista = [ 'celular', 'computador', 'tv', 'geladeira', 'fogão' ];

let push = lista.push("luminária");
console.log(lista);
console.log(push);

let shift = lista.shift();
console.log(lista);
console.log(shift);

let unshift = lista.unshift("celular");
console.log(lista);
console.log(unshift);

let pop = lista.pop();
console.log(lista);
console.log(pop);

let join = lista.join(" - ");
console.log(lista);
console.log(join);