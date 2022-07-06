*** Settings ***
Library                 SeleniumLibrary
Resource                ./arthur.resource
Test Teardown           Close Browser

*** Test Case ***
Processo de compra na loja Sauce Demo
  Acessar o site
  Fazer login
  Adicionar um produto ao carrinho
  Acessar o carrinho
  Clicar em checkout
  Preencher dados do usuario