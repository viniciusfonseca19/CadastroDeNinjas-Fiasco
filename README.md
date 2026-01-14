# 🥷 Ninja Cadastro API

API REST para cadastro de ninjas e atribuição de missões, desenvolvida com foco em aprendizado prático de backend, organização de dados e relacionamento entre entidades.

---

## 🚀 Funcionalidades

* Cadastrar novos ninjas
* Listar todos os ninjas
* Buscar ninja por ID
* Atualizar dados do ninja
* Remover ninja
* Criar missões
* Atribuir uma missão a um ninja
* Listar missões de um ninja

---

## 🛠️ Tecnologias utilizadas

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL / H2 (ou outro banco, se aplicável)
* Maven
* Postman / Insomnia para testes

---

## 📦 Estrutura do projeto

```
ninja-cadastro-api
│
├── Ninjas
├── Missões
└── CadastroDeNinjasApiApplication.java
```

---

## 📌 Entidades principais

### 🥷 Ninja

* id
* nome
* idade
* email
* missão (relacionamento)

### 🎯 Missão

* id
* título
* dificuldade

---

## 🔄 Relacionamento

* Um ninja pode ter **uma missão ativa**
* Uma missão pode ser atribuída a **um ninja**

(Relacionamento OneToOne ou ManyToOne, dependendo da implementação)

---

## 📥 Exemplos de endpoints

### Criar ninja

```
POST /ninjas
```

### Listar ninjas

```
GET /ninjas
```

### Criar missão

```
POST /missoes
```

### Atribuir missão ao ninja

```
PUT /ninjas/{id}/missao/{missaoId}
```

---

## ▶️ Como executar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/ninja-cadastro-api.git
```

2. Entre na pasta do projeto:

```bash
cd ninja-cadastro-api
```

3. Execute o projeto:

```bash
./mvnw spring-boot:run
```

4. Acesse:

```
http://localhost:8080
```

---

## 🧪 Testes

Recomendado utilizar:

* Postman
* Insomnia
* Thunder Client (VS Code)

---

## 📚 Objetivo do projeto

Este projeto foi criado para:

* Praticar desenvolvimento de APIs REST
* Aprender relacionamento entre entidades
* Aplicar boas práticas com Spring Boot
* Simular sistemas reais de cadastro e controle

---

## 👨‍💻 Autor

Desenvolvido por **Vini**

---

## ⭐ Futuras melhorias

* Autenticação com JWT
* Sistema de níveis e experiência
* Histórico de missões
* Paginação e filtros
* Documentação com Swagger

---

Se quiser, posso gerar também:

✅ Versão em inglês
✅ README com badges
✅ README com exemplos JSON
✅ Documentação Swagger
✅ Diagrama de entidades

Só pedir 😄
