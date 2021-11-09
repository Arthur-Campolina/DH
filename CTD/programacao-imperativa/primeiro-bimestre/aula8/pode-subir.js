let altura = 1.8;

//EXERCÍCIO 1
if (altura >= 1.4 && altura <= 2 || altura <= 1.4 && altura >= 1.2) {
    console.log(true);
} else {
    console.log(false);
}

//EXERCÍCIO 2
if (altura >= 1.4 && altura <= 2) {
    console.log("Acesso autorizado!");
} else if (altura <= 1.4 && altura >= 1.2){
    console.log("Acesso autorizado somente com acompanhante!")
} else {
    console.log("acesso negado!");
}