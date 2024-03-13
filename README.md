# Autenticação e Autorização com Spring Security e JWT Tokens

Este repositório contém um projeto de exemplo que demonstra como implementar autenticação e autorização em uma aplicação web Java utilizando Spring Security e tokens JWT (JSON Web Tokens).

## Funcionalidades

- Implementação básica de autenticação e autorização com Spring Security.
- Utilização de tokens JWT para autenticação.
- Exemplo de endpoints protegidos e públicos.
- Configuração de permissões de acesso aos endpoints.
- Uso de banco de dados em memória (H2) para armazenar usuários e papéis (roles).
- Instruções de como configurar e executar o projeto.

## Pré-requisitos

- Java JDK 8 ou superior.
- Maven instalado.
- Um navegador web.
- Um IDE Java (recomendado: IntelliJ IDEA, Eclipse, NetBeans).

## Configuração e Execução

1. Clone este repositório para sua máquina local:

```bash
git clone https://github.com/mario-evangelista/autenticacao-autorizacao-spring-security-jwt-tokens.git
```

2. Navegue até o diretório do projeto:

```bash
cd autenticacao-autorizacao-spring-security-jwt-tokens
```

3. Compile o projeto utilizando Maven:

```bash
mvn clean install
```

4. Execute a aplicação:

```bash
mvn spring-boot:run
```

5. Acesse a aplicação em seu navegador web:

```
http://localhost:8080
```

## Utilização

Após a execução da aplicação, você poderá explorar os seguintes endpoints:

- `/api/public` - Endpoint público acessível a todos.
- `/api/private` - Endpoint protegido, requer autenticação com token JWT válido.
- `/api/admin` - Endpoint protegido que requer token JWT válido com papel (role) "ROLE_ADMIN".

Para obter um token JWT válido, faça uma requisição POST para o endpoint `/api/authenticate` com as credenciais de um usuário registrado no sistema. Por exemplo:

```bash
curl -X POST http://localhost:8080/api/authenticate \
-H "Content-Type: application/json" \
-d '{"username": "usuario", "password": "senha"}'
```

O token JWT retornado deverá ser incluído no cabeçalho de autorização (Authorization) para acessar os endpoints protegidos:

```bash
curl -X GET http://localhost:8080/api/private \
-H "Authorization: Bearer <token_jwt_aqui>"
```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues para relatar problemas, sugerir melhorias ou enviar pull requests com novos recursos.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
