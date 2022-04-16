function deleteTask(event) {
    let tokenJwt = localStorage.getItem("jwt");
  
    let endPointDeleteTask = `https://ctd-todo-api.herokuapp.com/v1/tasks/${event}`;
  
  
    let configDeleteTasks = {
      method: "DELETE",
      headers: {
        "content-type": "application/json",
        authorization: tokenJwt,
      },
    };
  
    fetch(endPointDeleteTask, configDeleteTasks)
      .then((result) => {
        return result.json();
      })
      .then((result) => {
        Swal.fire({
          icon: 'question',
          title: 'VocÃª tem certeza que quer excluir a tarefa?',
          showDenyButton: true,
          confirmButtonText: 'Sim',
        }).then((result) => {
          if (result.isConfirmed) {
            Swal.fire({
              icon: 'warning',
              title: 'Tarefa excluida!',
              showConfirmButton: false,
              timer: 1000
            })
            setTimeout(() => {
              window.location.reload();
            }, 1100)
      
          } else if (result.isDenied) {
            Swal.fire({
              icon: 'success',
              title: 'Tarefa mantida!',
              showConfirmButton: false,
              timer: 1000
            })
          }
        })
      })
      .catch((e) => {
        alert(e);
      });
  }


