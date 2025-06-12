# 🐾 Sistema de Gerenciamento de Clínica Veterinária - VETLOVE

**Organização eficiente para cuidar dos pets!**

---

## 📄 Visão Geral do Projeto

Este projeto consiste em um sistema de gerenciamento desenvolvido para otimizar as operações de uma clínica veterinária. Ele foi concebido como parte de [Mencione a disciplina ou contexto acadêmico, por exemplo: "uma atividade para a disciplina de Banco de Dados" ou "meu projeto final de Programação Orientada a Objetos"].

O principal objetivo era praticar e consolidar conceitos de gerenciamento de dados e interação com banco de dados, simulando um ambiente real de negócios.

## ✨ Funcionalidades Principais

O sistema foi desenvolvido para oferecer as seguintes funcionalidades:

* **Gerenciamento de Usuários:**
    * Cadastro, visualização, edição e exclusão (CRUD) de **Funcionários** da clínica.
    * Cadastro, visualização, edição e exclusão (CRUD) de **Veterinários** com suas respectivas especialidades.
* **Gerenciamento de Clientes e Pacientes:**
    * Cadastro, visualização, edição e exclusão (CRUD) de **Clientes** (tutores dos animais).
    * Associação de múltiplos **Pacientes** (animais) a cada cliente.
* **Gestão de Serviços:**
    * Registro e consulta de serviços oferecidos pela clínica (consultas, banho e tosa, vacinas, etc.).
* **Controle Financeiro Básico:**
    * Registro e gerenciamento de formas de pagamento para os serviços.

## 🛠️ Tecnologias Utilizadas

* **Linguagem de Programação:** Java
* **Banco de Dados:** PostgreSQL
* **Frameworks/Bibliotecas:** JPA
* **Outras Ferramentas:** Maven

---

## 🏗️ Estrutura do Projeto e Potencial de Execução

Embora este projeto seja um **trabalho acadêmico** e não esteja em estado de execução plena, ele foi estruturado pensando em um ambiente de desenvolvimento típico. A seguir, detalho a arquitetura e as etapas que seriam necessárias para sua configuração e funcionamento:

* **Pré-requisitos:** O projeto foi concebido para ser executado com  Java JDK 21+ e PostgreSQL.
* **Configuração do Banco de Dados:** O esquema do banco de dados seria configurado através de scripts SQL (geralmente `schema.sql` ou similar), que criariam as tabelas para usuários, clientes, pacientes, serviços e pagamentos. A conexão seria estabelecida através de um arquivo de configuração (`application.properties` ou similar), onde credenciais e detalhes do banco de dados seriam definidos.
* **Dependências:** As dependências do projeto (bibliotecas e frameworks) seriam gerenciadas por `Maven`, garantindo a importação correta de todos os módulos necessários.
* **Estrutura de Pastas:** O código está organizado em pastas lógicas, separando a lógica de negócio e os recursos de configuração.

O objetivo desta estrutura era permitir a exploração das funcionalidades de CRUD e a interação com o banco de dados.

---

## 🧠 Aprendizados e Desafios

Este projeto foi fundamental para o meu desenvolvimento em:

* **Modelagem de Banco de Dados:** Aprofundei meus conhecimentos na criação de esquemas relacionais para gerenciar entidades complexas como usuários, clientes, pacientes e serviços.
* **Operações CRUD:** Reforcei a implementação de operações básicas de criação, leitura, atualização e exclusão de dados, um pilar essencial em qualquer sistema.
* **Conexão com Banco de Dados:** Ganhei experiência prática na integração da aplicação com um sistema de gerenciamento de banco de dados, lidando com drivers e queries SQL.

Um dos desafios notáveis foi gerenciar as relações entre as tabelas de clientes e pacientes.

## 📊 Status do Projeto

Este é um **projeto acadêmico** e, como tal, não está em desenvolvimento ativo ou manutenção constante. Ele representa uma fase importante do meu aprendizado em desenvolvimento de sistemas e banco de dados.

---
