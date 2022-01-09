#language: pt
#Author: clecioguga7@gmail.com

Funcionalidade: Tela para Cadastro de Usuários
  EU COMO  usuário do sistema
  DESEJO realizar o cadastro de novos usuários
  PARA QUE seja possível armazenar e gerenciar seus dados
  
    Cenario: Cadastro do usuario
    Dado que eu esteja no site "http://prova.stefanini-jgr.com.br/teste/qa/" 
    Quando clico no campo nome 
    E preencho o campo email 
    E preencher o campo senha 
    Entao clico em enviar