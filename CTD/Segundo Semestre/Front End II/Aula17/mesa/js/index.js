load();
function load() {
  fetch("https://randomuser.me/api/")
    .then((response) => {
      return response.json();
    })
    .then((data) => {
      //manipulamos a resposta
      return renderizarDadosUsuario(data.results[0]);
    })
    .catch((err) => {
      console.log(err);
    });

  function renderizarDadosUsuario(dados) {
    let card = document.querySelector(".card");
    let novaDiv = `
        <img class="img-foto" src="${dados.picture.large}"></img>
        <h1>${dados.name.title} ${dados.name.first} ${dados.name.last}</h1>   
        `;
    card.innerHTML = novaDiv;
  }
}
