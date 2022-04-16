let logOut = document.getElementById("closeApp");

<<<<<<< HEAD
let tokenJwt = localStorage.getItem("jwt");

logOut.addEventListener("click", (e) => {
  e.preventDefault();

  Swal.fire({
    icon: "question",
    title: "Você tem certeza que quer encerrar a sessão?",
    showDenyButton: true,
    confirmButtonText: "Sim",
    denyButtonText: 'Não',
  }).then((result) => {
    /* Read more about isConfirmed, isDenied below */
    if (result.isConfirmed) {
      Swal.fire({
        icon: "warning",
        title: "Sessão encerrada !",
        showConfirmButton: false,
        timer: 1000,
      });
      setTimeout(() => {
        tokenJwt = localStorage.removeItem("jwt");
        location.href = "index.html";
      }, 1100);
    } else if (result.isDenied) {
      Swal.fire({
        icon: "success",
        title: "Sessão mantida !",
        showConfirmButton: false,
        timer: 1000,
      });
      // location.reload()
    }
  });
=======
logOut.addEventListener("click", (e) => {
  e.preventDefault();
  let tokenJwt = localStorage.removeItem("jwt");

  let finalizarSessao = confirm("Deseja realmente sair da sua sessão?");

  if (finalizarSessao) {
    tokenJwt;
    location.href = "index.html";
  } else {
  }
>>>>>>> 86b5f1e1591282dc6784f6cb916edc19b40b704b
});
