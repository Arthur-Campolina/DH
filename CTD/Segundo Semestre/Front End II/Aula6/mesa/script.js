const cards = document.querySelectorAll(".item");
const parent = document.querySelector(".container")

cards.forEach(card => {
    parent.removeChild(card)
});

const insertCard = (parent, card) => {
    parent.appendChild(card)
}

cards.forEach(card => insertCard(parent, card))

