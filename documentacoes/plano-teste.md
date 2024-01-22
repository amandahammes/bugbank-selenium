# Plano de testes BUGBANK

<p align="center"> <img src="https://bugbank.netlify.app/_ipx/w_640,q_75/%2F_next%2Fstatic%2Fmedia%2Fbugbank.ede6fc83.png?url=%2F_next%2Fstatic%2Fmedia%2Fbugbank.ede6fc83.png&w=640&q=75"> </p>

1) Introdução

1.1) Escopo

    - Página de Registro com CTs de sucesso e falha;
    - Página de Login com CTs de sucesso e falha;
    - Transferir dinheiro disponível na conta para outra conta com sucesso;

1.2) Objetivo de Qualidade

    Garantir que registro de novas contas, logins e transferências estejam sempre funcionando e caso não estejam, sejam rapidamente identificadas e corrigidas pela equipe de desenvolvedores.

1.3) Funções e Responsabilidades

    - Escrita de toda documentação: Amanda Kopper Hammes
    - Criação de testes: Amanda Kopper Hammes
    - Code Reviews: Amanda Kopper Hammes

2) Metodologia de Teste

2.1) Visão Geral

    Método Kanban de acordo com estrutura do GitHub.

2.2) Níveis de Teste

    Os testes tipo E2E foram escolhidos para assegurar que os principais fluxos da aplicação estejam em funcionamento e para que os bugs dentro desses fluxos sejam rapidamente corrigidos.

2.3) Triagens de Bugs e Completude do Teste

    - Cobertura de teste das funcionalidades essenciais; 
    - Todos os casos de teste automatizados executados semanalmente;
    - Todos os bugs abertos foram corrigidos ou serão corrigidos na próxima versão; 

3) Resultados do Teste

Artefatos a serem entregues durante os ciclos de vida do teste:

    - Plano de teste;
    - Casos de teste para cada fluxo E2E; 
    - Relatório de Bug; 
    - Matriz de Rastreabilidade de Requisitos; 
    - Estratégia de Teste;  
    - Métricas de teste; 

4) Ferramentas de Teste (Automação)

Ambiente de Teste: [BugBank](https://bugbank.netlify.app/#)

Ferramentas:

    - Selenium/Webdriver
    - Junit


**Referências:**

[Estratégias Testes Regressão](https://www.infoq.com/br/articles/regression-testing-strategies/)

[Modelo Plano de Teste](https://www.guru99.com/pt/test-plan-for-project.html)

[Como conduzir Testes Regressivos](https://www.techtarget.com/searchsoftwarequality/answer/How-to-conduct-regression-tests)

[Elaborando um Plano Eficiente de Teste de Software](https://awari.com.br/plano-de-teste-de-software-elaborando-um-plano-eficiente-de-testes-de-software/)