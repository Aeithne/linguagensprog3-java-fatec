# 📚 P2_GestãoDeAlunos: Sistema de Gerenciamento Acadêmico

Este é um mini-projeto desenvolvido em **Java Spring Boot** que implementa um sistema de gerenciamento acadêmico simplificado como avaliação da disciplina de Linguagens de Programação 3.

O objetivo principal foi consolidar os conceitos de Programação Orientada a Objetos (POO) com a arquitetura **MVC (Model-View-Controller)** e a persistência de dados utilizando **Spring Data JPA**.

---

## 🚀 Funcionalidades Principais (CRUD Completo)

O sistema oferece gerenciamento completo para duas entidades com relacionamento:

### 1. 🧑‍🎓 Alunos
* **Campos:** Nome, Email, Matrícula, e o **Curso** (relacionamento Many-to-One).
* **Operações:** Cadastro (`Create`), Listagem (`Read`), Edição (`Update`) e Exclusão (`Delete`).
* **Validação:** Implementação de validações básicas (`@NotBlank`, `@Email`) usando Jakarta Bean Validation.

### 2. 📝 Cursos
* **Campos:** Nome, Carga Horária e Descrição.
* **Operações:** Cadastro (`Create`), Listagem (`Read`), Edição (`Update`) e Exclusão (`Delete`).

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 21+
* **Framework:** Spring Boot 3+
* **Padrão de Projeto:** MVC (Model-View-Controller)
* **Web:** Spring Web (Controladores e Roteamento)
* **View Layer:** [Thymeleaf](https://www.thymeleaf.org/) (Templates HTML)
* **Persistência:** Spring Data JPA (Hibernate)
* **Banco de Dados:** **H2 Database** (Configurado para persistência em arquivo).
* **Build Tool:** Apache Maven

---

## ⚙️ Como Executar o Projeto

1.  **Pré-requisitos:** Certifique-se de ter o **JDK 21** ou superior e o **Apache Maven** configurados.
2.  **Clonar/Abrir:** Clone o repositório ou abra o projeto no NetBeans.
3.  **Executar:** Navegue até a pasta raiz do projeto no terminal e execute o comando Maven:
    ```bash
    mvn spring-boot:run
    ```
4.  **Acessar:** Após a inicialização, abra seu navegador e acesse a rota principal:
    ```
    http://localhost:8080/
    ```
