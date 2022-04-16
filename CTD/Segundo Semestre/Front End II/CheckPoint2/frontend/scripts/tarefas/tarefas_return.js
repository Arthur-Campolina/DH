function returnTask(event) {
  let tokenJwt = localStorage.getItem("jwt");

  let endPointUpdateTask = `https://ctd-todo-api.herokuapp.com/v1/tasks/${event}`;

  let bodyUpdateTask = {
    completed: false,
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
=======

>>>>>>> 86b5f1e1591282dc6784f6cb916edc19b40b704b
      window.location.reload();
    })
    .catch((e) => {
      console.log(e);
    });
}
