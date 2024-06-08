# Projeto de Gestão de Imóveis

## Introdução
### Descrição do Problema
A gestão de imóveis, incluindo a administração de locatários, inquilinos e serviços associados, pode ser complexa e demandar muito tempo. Muitos sistemas existentes são fragmentados ou não atendem completamente às necessidades de pequenas e médias empresas de gestão imobiliária.

### Solução Desenvolvida
Desenvolvemos uma aplicação web completa para gestão de imóveis, que inclui funcionalidades para administração de imóveis, usuários, serviços, emergências e controle financeiro. Esta solução visa centralizar todas as operações em um único sistema, melhorando a eficiência e a transparência.

## Estratégias para Escolha da Solução
Optamos por utilizar uma stack tecnológica moderna e robusta, que inclui:
- **Backend**: Spring Boot com JPA para a camada de persistência, H2 como banco de dados em memória para simplicidade durante o desenvolvimento, e Lombok para reduzir a verbosidade do código.
- **Frontend**: HTML, CSS (com Bootstrap para estilização responsiva), e JavaScript (com Axios para chamadas AJAX).

## Arquitetura do Sistema
### Descrição da Arquitetura
O sistema segue uma arquitetura de três camadas:
1. **Camada de Apresentação**: Interface do usuário desenvolvida com HTML, CSS e JavaScript.
2. **Camada de Negócio**: Implementada com Spring Boot, contendo a lógica de negócios e controladores RESTful.
3. **Camada de Dados**: JPA/Hibernate para mapeamento objeto-relacional e H2 como banco de dados.

### Esquemas/Diagramas da Arquitetura

https://gamma.app/docs/Lockey-xbhdmli1sltj4cf?mode=doc

## Tecnologias Utilizadas
- **Spring Boot**: Framework para criação de aplicações Java.
- **JPA/Hibernate**: Persistência de dados.
- **H2 Database**: Banco de dados em memória.
- **Lombok**: Simplificação do código Java.
- **HTML/CSS**: Estrutura e estilo do frontend.
- **Bootstrap**: Framework CSS responsivo.
- **JavaScript**: Comportamento dinâmico no frontend.
- **Axios**: Cliente HTTP para consumo de APIs RESTful.

## Vídeo de Apresentação
[Link para o vídeo no YouTube]()

## Repositório GitHub
[Link para o repositório GitHub](https://github.com/clwro/LocKey)


## Instruções para Execução da Aplicação

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/clwro/LocKey.git

2. Navegue até o diretório do projeto:
   ```bash
   cd src/main/java/com/lockey/lockey

3. Compile e execute a aplicação:
   ```bash
   ./mvnw spring-boot:run

4.Acesse a aplicação:
Frontend:

```bash
http://localhost:8080


   
