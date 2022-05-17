const body = document.querySelector("body");
const h1 = document.querySelector("h1");
const item = document.querySelectorAll("item");
const elemento = document.querySelectorAll("h2, p");

function darkMode() {
  body.style.backgroundColor = "rgb(39, 39, 39)";

  h1.style.backgroundColor = "rgb(39, 39, 39)";
  h1.style.color = "rgb(170, 170, 170)";
  h1.style.borderColor = "black";

  item.backgroundColor = "rgb(19, 19, 19)";
  item.borderColor = "black";

  elemento.forEach(item => {
      item.style.color = "red";
  })
}

function lightMode() {
    body.style.backgroundColor = "white";
  
    h1.style.backgroundColor = "rgb(39, 39, 39)";
    h1.style.color = "rgb(170, 170, 170)";
    h1.style.borderColor = "black";
  
    item.backgroundColor = "rgb(19, 19, 19)";
    item.borderColor = "black";
  
    elemento.forEach(item => {
        item.style.color = "red";
    })
  }