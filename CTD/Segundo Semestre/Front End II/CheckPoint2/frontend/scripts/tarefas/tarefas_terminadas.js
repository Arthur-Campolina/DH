let ulTarefaTerminada = document.querySelector(".tarefas-terminadas");

<<<<<<< HEAD
function renderizaTarefasTerminadas(tarefa) {
  let liTarefaFinalizada = document.createElement("li");
  liTarefaFinalizada.classList.add("tarefa");
  liTarefaFinalizada.setAttribute("data-aos", "fade-right");
  liTarefaFinalizada.setAttribute("data-aos-duration", "1000");

  liTarefaFinalizada.innerHTML = `
    <div class="done"></div>
    <div class="descricao">
    <p class="nome">${tarefa.description}</p>
    <p class="timestamp"><i class="far fa-calendar-alt"></i> ${dayjs(
      tarefa.createdAt
    ).format("DD/MM/YYYY - HH:mm:ss A - dddd")}</p>
    <div>
        <button onclick = "returnTask(${tarefa.id})"><i class="fas fa-undo-alt change"></i></button>
        <button onclick = "deleteTask(${tarefa.id})"><i class="far fa-trash-alt"></i></button>
    </div>
    </div>
  
          `;

  ulTarefaTerminada.appendChild(liTarefaFinalizada);
}

=======
>>>>>>> 86b5f1e1591282dc6784f6cb916edc19b40b704b
function getId(id) {
  let tokenJwt = localStorage.getItem("jwt");

  let endPointUpdateTask = `https://ctd-todo-api.herokuapp.com/v1/tasks/${id}`;

  let bodyUpdateTask = {
    completed: true,
<<<<<<< HEAD
    createdAt: dayjs(),
=======
>>>>>>> 86b5f1e1591282dc6784f6cb916edc19b40b704b
  };

  let updateTaskJson = JSON.stringify(bodyUpdateTask); // Foi convertida para JSON para conseguirmos enviar para o servidor

  let configUpdateTasks = {
    method: "PUT",
    body: updateTaskJson,
    headers: {
      "content-type": "application/json",
      authorization: tokenJwt,
    },
  };

  fetch(endPointUpdateTask, configUpdateTasks)
    .then((result) => {
      return result.json();
    })
    .then((result) => {
<<<<<<< HEAD
      Swal.fire({
        icon: "success",
        title: "Tarefa concluída com suceso !",
        showConfirmButton: false,
        timer: 1300,
      });
      setTimeout(() => {
        window.location.reload();
      }, 1400);
=======

      window.location.reload();
>>>>>>> 86b5f1e1591282dc6784f6cb916edc19b40b704b
    })
    .catch((e) => {
      console.log(e);
    });
}
<<<<<<< HEAD
=======

function renderizaTarefasTerminadas(tarefa) {
  let liTarefaFinalizada = document.createElement("li");
  liTarefaFinalizada.classList.add("tarefa");

  liTarefaFinalizada.innerHTML = `
    <div class="done"></div>
    <div class="descricao">
    <p class="nome">${tarefa.description}</p>
    <div>
        <button onclick = "returnTask(${tarefa.id})"><i class="fas fa-undo-alt change"></i></button>
        <button onclick = "deleteTask(${tarefa.id})"><i class="far fa-trash-alt"></i></button>
    </div>
    </div>
  
          `;

  ulTarefaTerminada.appendChild(liTarefaFinalizada);
}
>>>>>>> 86b5f1e1591282dc6784f6cb916edc19b40b704b
