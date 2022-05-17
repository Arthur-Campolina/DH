const login = document.getElementById('login');

function enviar(event) {
    event.preventDefault();
}

login.addEventListener('click', (event) => enviar(event))