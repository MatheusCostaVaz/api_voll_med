# API REST

API Rest desenvolvido por Alura e utilizado nos cursos de Spring Boot.

# Tecnologias

- Java 17
- Spring Boot 3
- Maven
- MySQL
- Hibernate
- Flyway
- Lombok
- JWT
- Springdoc
  

# Executar via termina

java -Dspring.profiles.active=prod -DDATASOURCE_URL=jdbc:mysql://localhost/vollmed_api -DDATASOURCE_USERNAME= -DDATASOURCE_PASSWORD= -jar target/api-0.0.1-SNAPSHOT.jar


# Sobre o projeto

Voll.med é uma clínica médica fictícia que precisa de um aplicativo para gestão de consultas. O aplicativo deve possuir funcionalidades que permitam o cadastro de médicos e de pacientes, e também o agendamento e cancelamento de consultas.

Enquanto um time de desenvolvimento será responsável pelo aplicativo mobile, o nosso será responsável pelo desenvolvimento da API Rest desse projeto.

# Funcionalidades

- CRUD de médicos;
- CRUD de pacientes;
- Agendamento de consultas;
- Cancelamento de consultas.
