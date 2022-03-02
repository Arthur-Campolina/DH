let numeros = [1,5,9,3,5,7];
let dobro = numeros.map(function(item){
    return item * 2;
});

console.log(dobro);
// -----------------------------------------------------------------------
let total = idades.reduce(function(acumulador, item) {
    return acumulador+' - '+item;
});

console.log(total);

// -----------------------------------------------------------------------
let paises = ['Brasil', 'Cuba', 'Peru', 'India'];

paises.forEach(function(item) {
    console.log("<li>"+item+"</li>");
});
