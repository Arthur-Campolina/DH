let carros = [
  {
    url: "images/fusca-rebaixado.png",
    nome: "Fusca",
    carroceria: "Duas portas",
    motor: "Traseiro,1.3l, 8v",
    potencia: "46cv",
    descricao:
      "O Volkswagen Typ 1, popularmente conhecido como Fusca (no Brasil) ou Carocha (em Portugal), foi o primeiro modelo de automóvel fabricado pela companhia alemã Volkswagen, sendo produzido entre 1938 e 2003.",
  },
  {
    url: "images/boat-tail.png",
    nome: "Rolls Royce Boat Tail",
    carroceria: "Duas portas",
    motor: "Traseiro,1.3l, 8v",
    potencia: "560cv",
    descricao:
      "Boat Tail - O Rolls-Royce Boat Tail é um carro de luxo de médio porte construído pela Rolls-Royce Motor Cars . É o carro novo legal de rua mais caro do mundo, com US$ 28 milhões.",
  },
  {
    url: "images/honda.png",
    nome: "Honda Civic",
    carroceria: "Duas portas",
    motor: "Dianteiro, 1.6l, 16v",
    potencia: "125cv",
    descricao:
      "Honda Civic: Último ano da 5ª Geração do Civic, lançada em 1992. Veio para o Brasil no mesmo ano, e logo conquistou os apaixonados pela marca. Esta Honda Civic EXS de 1995 é um cupê com câmbio manual. Uma cor muito legal para carros esportivos: branco ártico. Poucas versões dessa geração vinham com a tecnologia VTEC, um sistema de comando variável de válvulas que aumenta o torque do motor em baixas e altas rotações. Este, tem. E a partir dessa geração do Civic a montadora trouxe inovações que fizeram deste carro resistente ao tempo, sendo confiável para rodar aonde for preciso até hoje.",
  },
  {
    url: "images/supra.png",
    nome: "Supra",
    carroceria: "Duas portas",
    motor: "Dianteiro, 3.0l, 24v",
    potencia: "330cv",
    descricao:
      "Toyota Supra - Se um carro esportivo japonês pudesse definir uma década, teria que vir da Toyota. Seu carro-chefe da década de 1990 foi o Toyota Supra. O que começou como um nível de acabamento em 1978 evoluiu ao longo de 4 gerações para se tornar seu próprio modelo.",
  },
];

carros.forEach((carro) =>
  inserirHtml(
    carro.url,
    carro.nome,
    carro.carroceria,
    carro.motor,
    carro.potencia,
    carro.descricao
  )
);

function cadastro() {
  let nome = document.querySelector(".nome").value;
  let url = document.querySelector(".url").value;
  let carroceria = document.querySelector(".carroceria").value;
  let motor = document.querySelector(".motor").value;
  let potencia = document.querySelector(".potencia").value;
  let descricao = document.querySelector(".descricaoVeiculo").value;

  inserirHtml(url, nome, carroceria, motor, potencia, descricao);
}

function inserirHtml(url, nome, carroceria, motor, potencia, descricao) {
  let cardsPai = document.querySelector(".pai");
  let template = montarTemplate(
    url,
    nome,
    carroceria,
    motor,
    potencia,
    descricao
  );
  cardsPai.innerHTML += template;
}

function montarTemplate(url, nome, carroceria, motor, potencia, descricao) {
  let template = `
    <div class="col-xs-12 col-md-6 carros-card">
                <img src="${url}" class = "img-fluid" alt="${nome}">
                <h1>${nome}</h1>

                <p>Carroceria: ${carroceria}</p>
                <p>Motor: ${motor} Traseiro,1.3l, 8v</p>
                <p>Potência: ${potencia}</p>
                <p class="descricao">${descricao}</p>

    </div>
    `;

  return template;
}

