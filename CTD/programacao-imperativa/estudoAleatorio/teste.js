// function ePar(n){
//     let simnao = n%2 != 0 ? true:false;
// } 

// console.log(ePar(10));

// function longitudeNomeCompleto (nome, sobrenome){
//   return nome.length + sobrenome.length + 1;
// }
// console.log(longitudeNomeCompleto("joao", "maria"));

function maximo(n1, n2) {
    let max = Math.abs(n2, n1);
    if (max >= n1) {
        return n1;
    } else if (max >= n2) {
        return n2;
    }
}

console.log(maximo(15, 10));