*** Variables ***
${SITE}                     https://hurb.com/br
${NAVEGADOR}                Chrome
${BOTAO_COKIES}             css=#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll
${BOTAO_PACOTES}            xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[1]/div/div/button[2]
${CAMPO_PESQUISA}           css=#destination-input
${CIDADE}                   Buenos Aires
${BOTAO_PESQUISA}           xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[2]/button
${PACOTE}                   xpath=//*[@id="__next"]/div/main/section/div[1]/a[1]/div[1]/img
${BOTAO_ESCOLHER}           css=#h-3t22h6
${CHECKBOX}                 css=#LGPKG-1384831-3032675
${BOTAO_PROXIMO}            css=#h-1yuatql
${BOTAO_DIARIAS}            css=#h-7k3cv9
${BOTAO_PROXIMO2}           css=#h-1yuatql
${BOTAO_PAGAMENTO}          css=#h-1yuatql
${CAMPO_EMAIL}              css=#itxEmail
${EMAIL}                    joao@gmail.com
${NEWSLETER}                css=#newsletter-optin
${BOLETO_PARCELADO}         css=#ui-tabs-anchor
${CAMPO_USUARIO}            css=#billHolder   
${USUARIO}                  Joao Gomes
${CAMPO_CPF}                css=#billHolderCpf         
${USER_CPF}                 255.850.177-13
${CAMPO_CELULAR}            css=#billHolderTel            
${USER_CELULAR}             81984205178
${CANCELAR}                 css=#cancellation-policy
${BOTAO_GERAR_BOLETO}       css=#info

*** Keywords ***
Acessar o site
  Open Browser      ${SITE}                     ${NAVEGADOR}
  sleep             5
  Maximize Browser Window
  Set Selenium Speed                            1

Permitir todos os cookies
  sleep             5
  Click Element     ${BOTAO_COKIES}

Selecionar a opção “Pacotes”
  Click Element     ${BOTAO_PACOTES}

Buscar Buenos Aires e clicar em “Pesquisar”
  Input Text        ${CAMPO_PESQUISA}           ${CIDADE}   
  Click Element     ${BOTAO_PESQUISA}

Selecionar pacote de viagem
  Click Element     ${PACOTE}
  Click Element     ${PACOTE}
  sleep             5
  Switch Window     NEW

Escolher pacote
  Click Element     ${BOTAO_ESCOLHER}
  Select Checkbox   ${CHECKBOX}
  Click Element     ${BOTAO_PROXIMO}
  Click Element     ${BOTAO_DIARIAS} 
  Click Element     ${BOTAO_PROXIMO2}
  Click Element     ${BOTAO_PAGAMENTO}

Pagina pagamento
  Input Text        ${CAMPO_EMAIL}              ${EMAIL}
  Click Element     ${NEWSLETER}
  Click Element     ${BOLETO_PARCELADO}
  Input Text        ${CAMPO_USUARIO}            ${USUARIO}
  Input Text        ${CAMPO_CPF}                ${USER_CPF}
  Input Text        ${CAMPO_CELULAR}            ${USER_CELULAR}
  Click Element     ${CANCELAR}
  Click Element     ${BOTAO_GERAR_BOLETO}
