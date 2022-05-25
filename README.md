![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)

<h1 align="center">POC MOBILE </h1>
<p align="center">Projeto de exemplo para automações mobile, automatiza app Alura Esportes</p>

## ⚒️ Recursos utilizados
- **Tecnologias**
    - [Java](https://www.java.com/pt-BR/)
    - [Maven](https://maven.apache.org/guides/index.html)
    - [Lombok](https://projectlombok.org/features/all)
    - [Junit 5](https://junit.org/junit5)
    - [Cucumber](https://cucumber.io/)
    - [Appium](https://appium.io/)
    - [Allure](https://docs.qameta.io/allure/)

## 📂 Escolha suite de teste
***Para escolher uma suite de testes, utilize os parâmetros:***

- ` Dsuite=Cadastro`

## 📱 Escolha da Plataforma
***Para selecionar a Plataforma de execução do teste, utilize os parâmetros:***

- Dplatform=IOS

- Dplatform=ANDROID

> OBS: Caso a variavel platform não seja declarada, o valor default é Dplatform=ANDROID. E
> caso seja informado qualquer valor diferente de ANDROID ou IOS, sera lançada uma exception.
 

## Requisitos para executar os testes do projeto
> Caso não atenda algum dos requsitos e não saiba como configurar a máquina siga este tutorial [README CONFIGURAÇÕES](README-configuracao.md)  


## 🚀 Execução dos Testes
Para executar a suite de cadastro no Android:    
``mvn clean test -Dtest=CadastroSuite -Dplatform=ANDROID``

>Você pode também rodar os testes através da interface de sua IDE, nesse caso para escolher a plataforma
> é necessário alterar o valor de retorno do Else dentro do metodo getPlatform() na classe Utils.


## 📜 Geração de relatório
