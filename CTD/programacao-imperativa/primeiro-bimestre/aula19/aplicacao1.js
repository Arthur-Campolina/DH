// Ex 1
const listaPessoas = require('./pessoas')


  let menorAltura = Math.min.apply(Math, listaPessoas.map(function (x) { return x.altura; }))
  
  
  let maiorAltura = Math.min.apply(Math, listaPessoas.map(function (x) { return x.altura; }))
  
  console.log(`A menor altura do grupo é ${menorAltura}m e a maior é ${maiorAltura}m.`)
  

// Ex 2

let mulheres = listaPessoas.filter(mulher => mulher.sexo === 'F');


const mulheres = arr => arr.reduce((a,b) => a + b, 0) / arr.length;
