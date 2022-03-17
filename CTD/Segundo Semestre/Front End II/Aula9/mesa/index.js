const botoes = document.querySelectorAll("button")

const operacoes = {
    "somar": somar,
    "subtrair": subtrair,
    "multiplicar": multiplicar,
    "dividir": dividir
}


botoes.forEach (botao => botao.addEventListener("click",() => {
    const v1 = parseInt(document.getElementById("v1").value);
    const v2 = parseInt(document.getElementById("v2").value);
    const operacao = operacoes[botao.getAttribute("id")];
    alert(calcular(operacao, v1, v2));
}));

