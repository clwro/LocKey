# API Endpoints

## Imóveis

### Listar todos os imóveis
- **Método:** GET
- **URL:** `http://localhost:8080/api/imoveis`

### Obter um imóvel pelo ID
- **Método:** GET
- **URL:** `http://localhost:8080/api/imoveis/{id}`
- **Exemplo:** `http://localhost:8080/api/imoveis/1`

### Criar um novo imóvel
- **Método:** POST
- **URL:** `http://localhost:8080/api/imoveis`
- **Corpo da Requisição (JSON):**
  ```json
  {
    "endereco": "Rua Exemplo, 123",
    "nome": "Imóvel Exemplo",
    "nomeInquilino": "João Silva"
  }
### Atualizar um imóvel
- **Método:**  PUT
- **URL:**  http://localhost:8080/api/imoveis/{id}
- **Exemplo:**  http://localhost:8080/api/imoveis/1
- **Corpo da Requisição (JSON):**
-   ```json
    {
      "endereco": "Rua Atualizada, 456",
      "nome": "Imóvel Atualizado",
      "nomeInquilino": "Maria Silva"
    }
### Deletar um imóvel
- **Método:**  DELETE
- **URL:** http://localhost:8080/api/imoveis/{id}
- **Exemplo:**  http://localhost:8080/api/imoveis/1

## Usuarios

### Listar todos os usuários
- **Método:**  GET
- **URL:** http://localhost:8080/api/usuarios
- **Exemplo:** http://localhost:8080/api/usuarios

### Obter um usuário pelo ID
- **Método:** GET
- **URL:**  http://localhost:8080/api/usuarios/{id}
- **Exemplo:** http://localhost:8080/api/usuarios/1

### Criar um novo usuário
- **Método:** POST
- **URL:**  http://localhost:8080/api/usuarios
- **Corpo da Requisição (JSON):**
  ```json
  {
     "login": "usuario1",
     "senha": "senha123",
     "tipoConta": "locatario",
     "imovel": 
     "id": 1
  }
### Atualizar um usuário
- **Método:**  PUT
- **URL:** http://localhost:8080/api/usuarios/{id}
- **Exemplo:** http://localhost:8080/api/usuarios/1
- **Corpo da Requisição (JSON):**
    ```json
    {
         "login": "usuario1",
         "senha": "senha123",
         "tipoConta": "locador",
         "imovel": 
         "id": 1
    }
### Deletar um usuário
- **Método:**  DELETE
- **URL:** http://localhost:8080/api/usuarios/{id}
- **Exemplo:** http://localhost:8080/api/usuarios/1
- **Corpo da Requisição (JSON):**
    ```json
    {
         "login": "usuario1",
         "senha": "senha123",
         "tipoConta": "locador",
         "imovel": 
         "id": 1
    }
## Financeiro
### Listar todas as entradas financeiras
- **Método:** GET
- **URL:** http://localhost:8080/api/financeiro/
- **Exemplo:** http://localhost:8080/api/financeiro/
- **Corpo da Requisição (JSON):**
    ```json
    {
        "valor": 1000,
        "descricao": "Aluguel",
        "data": "2021-10-10",
        "tipo": "entrada",
        "imovel": 
        "id": 1
    }
### Obter uma entrada financeira pelo ID
- **Método:** GET
- **URL:** http://localhost:8080/api/financeiro/{id}
- **Exemplo:** http://localhost:8080/api/financeiro/1
- **Corpo da Requisição (JSON):**
    ```json
    {
        "valor": 1000,
        "descricao": "Aluguel",
        "data": "2021-10-10",
        "tipo": "entrada",
        "imovel": 
        "id": 1
    }
### Criar uma nova entrada financeira
- **Método:** POST
- **URL:** http://localhost:8080/api/financeiro/
- **Corpo da Requisição (JSON):**
    ```json
    {
        "valor": 1000,
        "descricao": "Aluguel",
        "data": "2021-10-10",
        "tipo": "entrada",
        "imovel": 
        "id": 1
    }
### Atualizar uma entrada financeira
- **Método:** PUT
- **URL:** http://localhost:8080/api/financeiro/{id}
- **Exemplo:** http://localhost:8080/api/financeiro/1
- **Corpo da Requisição (JSON):**
    ```json
    {
        "valor": 1000,
        "descricao": "Aluguel",
        "data": "2021-10-10",
        "tipo": "entrada",
        "imovel": 
        "id": 1
    }
### Deletar uma entrada financeira
- **Método:** DELETE
- **URL:** http://localhost:8080/api/financeiro/{id}
- **Exemplo:** http://localhost:8080/api/financeiro/1
- **Corpo da Requisição (JSON):**
    ```json
    {
        "valor": 1000,
        "descricao": "Aluguel",
        "data": "2021-10-10",
        "tipo": "entrada",
        "imovel": 
        "id": 1
    }
## Emergências
### Listar todas as emergências
- **Método:** GET
- **URL:** http://localhost:8080/api/emergencias/
- **Exemplo:** http://localhost:8080/api/emergencias/
- **Corpo da Requisição (JSON):**
    ```json
    {
        "descricao": "Vazamento",
        "data": "2021-10-10",
        "imovel": 
        "id": 1
    }
### Obter uma emergência pelo ID
- **Método:** GET
- **URL:** http://localhost:8080/api/emergencias/{id}
- **Exemplo:** http://localhost:8080/api/emergencias/1
- **Corpo da Requisição (JSON):**
    ```json
    {
        "descricao": "Vazamento",
        "data": "2021-10-10",
        "imovel": 
        "id": 1
    }
### Criar uma nova emergência
- **Método:** POST
- **URL:** http://localhost:8080/api/emergencias/
- **Corpo da Requisição (JSON):**
    ```json
    {
        "descricao": "Vazamento",
        "data": "2021-10-10",
        "imovel": 
        "id": 1
    }
### Atualizar uma emergência
- **Método:** PUT
- **URL:** http://localhost:8080/api/emergencias/{id}
- **Exemplo:** http://localhost:8080/api/emergencias/1
- **Corpo da Requisição (JSON):**
    ```json
    {
        "descricao": "Vazamento",
        "data": "2021-10-10",
        "imovel": 
        "id": 1
    }
### Deletar uma emergência
- **Método:** DELETE
- **URL:** http://localhost:8080/api/emergencias/{id}
- **Exemplo:** http://localhost:8080/api/emergencias/1
- **Corpo da Requisição (JSON):**
    ```json
    {
        "descricao": "Vazamento",
        "data": "2021-10-10",
        "imovel": 
        "id": 1
    }
## Serviços
### Listar todos os serviços
- **Método:** GET
- **URL:** http://localhost:8080/api/servicos/
- **Exemplo:** http://localhost:8080/api/servicos/
- **Corpo da Requisição (JSON):**
    ```json
    {
        "descricao": "Limpeza",
        "data": "2021-10-10",
        "imovel": 
        "id": 1
    }
### Obter um serviço pelo ID
- **Método:** GET
- **URL:** http://localhost:8080/api/servicos/{id}
- **Exemplo:** http://localhost:8080/api/servicos/1
- **Corpo da Requisição (JSON):**
    ```json
    {
        "descricao": "Limpeza",
        "data": "2021-10-10",
        "imovel": 
        "id": 1
    }
### Criar um novo serviço
- **Método:** POST
- **URL:** http://localhost:8080/api/servicos/
- **Corpo da Requisição (JSON):**
    ```json
    {
        "descricao": "Limpeza",
        "data": "2021-10-10",
        "imovel": 
        "id": 1
    }
### Atualizar um serviço
- **Método:** PUT
- **URL:** http://localhost:8080/api/servicos/{id}
- **Exemplo:** http://localhost:8080/api/servicos/1
- **Corpo da Requisição (JSON):**
    ```json
    {
        "descricao": "Limpeza",
        "data": "2021-10-10",
        "imovel": 
        "id": 1
    }
### Deletar um serviço
- **Método:** DELETE
- **URL:** http://localhost:8080/api/servicos/{id}
- **Exemplo:** http://localhost:8080/api/servicos/1
- **Corpo da Requisição (JSON):**
    ```json
    {
        "descricao": "Limpeza",
        "data": "2021-10-10",
        "imovel": 
        "id": 1
    }

# Desenvolvido por Arthur Câmara Cosso Gomes

