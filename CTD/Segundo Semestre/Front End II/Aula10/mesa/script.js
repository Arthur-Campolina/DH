// Crie um formulário com dois inputs de texto, um para nome e outro para sobrenome, e um botão submit. 
// Quando ocorrer entrada de dados nos dois campos de texto e o botão submit for pressionado, imprima no html três saídas utilizando os métodos: trim(), toUpperCase(), toLowerCase(). Imprima também mais uma saída usando o concat() do nome com o sobrenome.
// Por fim, para a última saída você deve utilizar o replace(), substituindo todas as letras “a” por “@” e letras “e” por “3”.

let nome = document.getElementById("nome");
let sobrenome = document.getElementById("sobrenome");

let botaoSalvar = document.getElementById("salvar");

botaoSalvar.addEventListener("click", function(evento){
    evento.preventDefault();

    console.log((nome.value.trim().toLowerCase().concat(' ', sobrenome.value.toUpperCase())).replace(/a/gi, "@").replace(/e/gi, "3"));
})