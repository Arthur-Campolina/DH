//Valor Padrão
let pipoca ="pipoca";
let tempoPipoca = 10;
let macarrao ="macarrão";
let tempoMacarra = 8;
let carne ="carne";
let tempoCarne = 15;
let feijao = "feijão";
let tempoFeijao = 12;
let brigadeiro = "brigadeiro";
let tempoBrigadeiro = 8;

//Valor Inserido Pelo Usuário
let comida = "macarrao";
let tempo = 8;

//Programa
if (comida == pipoca && tempo > tempoPipoca && tempo <= 2*tempoPipoca){
    console.log("A comida queimou!");
} else if (comida == macarrao && tempo > tempoMacarra && tempo <= 2*tempoMacarra){
    console.log("A comida queimou!");
} else if (comida == carne && tempo > tempoCarne && tempo <= 2*tempoCarne){
    console.log("A comida queimou!");
} else if (comida == feijao && tempo > tempoFeijao && tempo <= 2*tempoFeijao){
    console.log("A comida queimou!");
} else if (comida == brigadeiro && tempo > tempoBrigadeiro && tempo <= 2*tempoBrigadeiro){
    console.log("A comida queimou!");
} else if (comida == pipoca && tempo < tempoPipoca){
    console.log("Tempo insuficiente")
} else if (comida == macarrao && tempo < tempoMacarra){
    console.log("Tempo insuficiente")
} else if (comida == carne && tempo < tempoCarne){
    console.log("Tempo insuficiente")
} else if (comida == feijao && tempo < tempoFeijao){
    console.log("Tempo insuficiente")
} else if (comida == brigadeiro && tempo < tempoBrigadeiro){
    console.log("Tempo insuficiente")
} else if (comida ==pipoca && tempo >= 3*tempoPipoca){
    console.log("Kabumm!")
} else if (comida ==macarrao && tempo >= 3*tempoMacarra){
    console.log("Kabumm!")
} else if (comida ==carne && tempo >= 3*tempoCarne){
    console.log("Kabumm!")
} else if (comida ==feijao && tempo >= 3*tempoFeijao){
    console.log("Kabumm!")
} else if (comida ==brigadeiro && tempo >= 3*tempoBrigadeiro){
    console.log("Kabumm!")
} else if (comida != brigadeiro && comida != feijao && comida != carne && comida != pipoca && comida != macarrao) {
    console.log ("Prato Inexistente!")
} else {
    console.log("Prato pronto, bom apetite!!!")
}