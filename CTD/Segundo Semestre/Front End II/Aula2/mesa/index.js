// capturando a escolha do jogador (1,2,3);
// Capturar a escolha da maquina (Math.random())
// Testar quem foi o ganhador da rodada
// Identificar ganhador da partida.

const question = parseInt(prompt("How many rounds would you like to play?"));
for (let i = 0; i < question; i++) {
  const playersChoice = parseInt(
    prompt("Choose a number:\n1 - rock;\n2 - paper;\n3 - scissors:")
  );

  const computersChoice = parseInt(Math.random() * 3 + 1);

  let case0 = playersChoice == computersChoice;
  let case1 = playersChoice == 1 && computersChoice == 3;
  let case2 = playersChoice == 3 && computersChoice == 2;
  let case3 = playersChoice == 2 && computersChoice == 1;
  let case4 = computersChoice == 1 && playersChoice == 3;
  let case5 = computersChoice == 3 && playersChoice == 2;
  let case6 = computersChoice == 2 && playersChoice == 1;

  if (playersChoice > 4 || playersChoice < 0) {
    console.log("Erro! Digite um numero válido.");
    rockPaperScissors();
  } else {
    switch (true) {
      case case1:
        alert("Player 1 is the winner");
        break;
      case case2:
        alert("Player 1 is the winner");
        break;
      case case3:
        alert("Player 1 is the winner");
        break;
      case case4:
        alert("Computer is the winner.");
        break;
      case case5:
        alert("Computer is the winner.");
        break;
      case case6:
        alert("Computer is the winner.");
        break;
      default:
        alert("It is a draw.");
    }
  }
}
