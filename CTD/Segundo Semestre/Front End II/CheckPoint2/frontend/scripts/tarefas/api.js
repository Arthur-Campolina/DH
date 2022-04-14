// Refatoração do código
let tokenJwt = localStorage.getItem("jwt");
let endPointUpdateTask = `https://ctd-todo-api.herokuapp.com/v1/tasks`;

const API = {
    get: () => {console.log("get")},
};
