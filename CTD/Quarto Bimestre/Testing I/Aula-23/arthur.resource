*** Variables ***
${SITE}                     https://www.saucedemo.com
${NAVEGADOR}                Chrome
${CAMPO_USUARIO}            css=#user-name
${USUARIO}                  standard_user
${CAMPO_SENHA}              css=#password
${SENHA}                    secret_sauce
${BOTAO_LOGIN}              css=#login-button
${ADICIONAR_CARRINHO}       css=#add-to-cart-sauce-labs-backpack
${CARRINHO}                 css=#shopping_cart_container
${CHECKOUT}                 css=#checkout
${CAMPO_NOME}               css=#first-name
${USER_NOME}                Arthur
${CAMPO_SOBRENOME}          css=#last-name
${USER_SOBRENOME}           Campolina
${CAMPO_CEP}                css=#postal-code
${USER_CEP}                 31270540
${CONTINUE_BUTTON}          css=#continue


*** Keywords ***
Acessar o site
  Open Browser      ${SITE}                 ${NAVEGADOR}
  Maximize Browser Window
  Set Selenium Speed        0.5

Fazer login
  Input Text        ${CAMPO_USUARIO}        ${USUARIO}
  Input Text        ${CAMPO_SENHA}          ${SENHA}
  Click Element     ${BOTAO_LOGIN}

Adicionar um produto ao carrinho
  Click Element     ${ADICIONAR_CARRINHO}

Acessar o carrinho
  Click Element     ${CARRINHO}

Clicar em checkout
  Click Element     ${CHECKOUT}

Preencher dados do usuario
  Input Text        ${CAMPO_NOME}           ${USER_NOME}        
  Input Text        ${CAMPO_SOBRENOME}      ${USER_SOBRENOME}  
  Input Text        ${CAMPO_CEP}            ${USER_CEP} 
  Click Element     ${CONTINUE_BUTTON}  