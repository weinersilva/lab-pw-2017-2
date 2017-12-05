# tacs-microservice-ddd

Exemplo de microserviço com DDD.

Esse projeto utiliza Maven, Java, JAX-RS, RestEasy, JPA, Hibernate, Tomcat e Derby.

## Executando

Para executar o microserviço, suba o banco de dados Derby, o servidor de aplicações Tomcat e acesse `http://localhost:9090`

### Banco de Dados - Derby

`mvn exec:java@derby-start`

### Servidor de Aplicações - Tomcat

`mvn tomcat7:run`

### Maven Wrapper

Esse projeto usa o Maven Wrapper. Significa que se o Maven não estiver instalado e configurado, pode-se executar `.\mvnw` no Windows e `./mvnw` no Linux ao invés de executar `mvn`.