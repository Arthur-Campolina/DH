function cadastro(){
    let nome = document.querySelector(".nome").value;
    let url = document.querySelector(".url").value;
    let carroceria = document.querySelector(".carroceria").value;
    let motor = document.querySelector(".motor").value;
    let potencia = document.querySelector(".potencia").value;
    let descricao = document.querySelector(".descricaoVeiculo").value;

    let cardsPai = document.querySelector('.pai')

    let template = `
    <div class="col">
                <img src="${url}" alt="Fusca">
                <h1>${nome}</h1>

                <p>Carroceria: ${carroceria}</p>
                <p>Motor: ${motor} Traseiro,1.3l, 8v</p>
                <p>Potência: ${potencia}</p>
                <p class="descricao">${descricao}</p>

            </div>
    `
    cardsPai.innerHTML += template;

    console.log(cardsPai)
}