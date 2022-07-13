*** Settings ***
Library                 SeleniumLibrary
Resource                ./Hurb.resource
Test Teardown           Close Browser

*** Test Case ***
Processo de reserva de pacote de viagens
  Acessar o site
  Permitir todos os cookies
  Selecionar a opção “Pacotes”
  Buscar Buenos Aires e clicar em “Pesquisar”
  Selecionar pacote de viagem
  Escolher pacote
  Pagina pagamento
