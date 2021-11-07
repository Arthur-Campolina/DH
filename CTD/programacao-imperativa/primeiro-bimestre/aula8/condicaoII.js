let dia  = "quarta";

//IF TERÁRIO
// let resultado = dia == "domingo"? "vou a praia!":"fico em casa";
// console.log(resultado);

//SWITCH

switch(dia){
    case "segunda":
        console.log("Vou trabalhar!");
        break;
    case "terça":
        console.log("Vou a academia!");
        break;
    case "quarta":
        console.log("Fico em casa!");
    case "quinta":
        console.log("Jogo bola!");
        break;
    case "sexta":
        console.log("Descanso!");
        break;
    default: 
        console.log("Dia da maldade!");
}