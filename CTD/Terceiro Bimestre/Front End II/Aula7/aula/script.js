let listImgFelinos = document.querySelectorAll('img');
console.log(listImgFelinos);

for (let img of listImgFelinos) {
    let atributo = img.getAttribute('src');
}

listImgFelinos.forEach(img => img.getAttribute('src'))