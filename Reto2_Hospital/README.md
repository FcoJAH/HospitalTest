# Reto 2: Sistema de Gestión de Pacientes y Consultas

Este proyecto es parte de la prueba técnica y se enfoca en la gestión de **pacientes** y **consultas médicas**. La aplicación permite agregar, actualizar, eliminar y obtener información sobre los pacientes y sus consultas médicas.

## Estructura del Proyecto

La estructura del proyecto incluye las siguientes entidades principales:

- **Paciente:** Representa a un paciente con información personal.
- **Consulta:** Representa una consulta médica realizada a un paciente.

### 1. Requisitos previos:
- Tener **Java 17** o superior instalado.
- Tener **MySQL** o **MariaDB** instalado y en ejecución.
- Tener **Maven** instalado para la gestión de dependencias.

### 2. Configuración de la base de datos:

1. Crea la base de datos en **MySQL** llamada `GestionPacientes`:

   ```sql
   CREATE DATABASE GestionPacientes;
   
2. Ejecuta los siguientes scripts SQL para crear las tablas y cargar los datos de ejemplo:
    ```sql
    create_tables.sql para crear las tablas en la base de datos.
    insert_data.sql para insertar algunos datos de ejemplo.

3. Configuración de la conexión a la base de datos:
   En el archivo src/main/resources/application.properties, configura tu base de datos de la siguiente manera:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/GestionPacientes?useSSL=false&serverTimezone=UTC
    spring.datasource.username=root  # Cambia esto por tu usuario de MySQL
    spring.datasource.password=tu_contraseña  # Cambia esto por tu contraseña de MySQL
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
    
    # Configuración de JPA
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true

4. Ejecutar la aplicación:
   Para ejecutar la aplicación, usa el siguiente comando de Maven:
    ```batch
   mvn spring-boot:run

5. Probar los Endpoints:
   Los siguientes endpoints están disponibles en la aplicación para interactuar con los pacientes y consultas:

* Endpoints Pacientes:

Crear un paciente (POST)

URL: POST http://localhost:8080/pacientes

Body:

    {
    "nombre": "Juan Pérez", 
    "edad": 45, 
    "numeroSeguroSocial": "SS12345" 
    }
    
* Obtener todos los pacientes (GET)

URL: GET http://localhost:8080/pacientes

* Obtener un paciente por ID (GET)

URL: GET http://localhost:8080/pacientes/{idPaciente}
    
* Actualizar un paciente (PUT)

URL: PUT http://localhost:8080/pacientes/{idPaciente}

Body:

    { 
    "nombre": "Juan Pérez", 
    "edad": 46, 
    "numeroSeguroSocial": "SS12345" 
    }

* Eliminar un paciente (DELETE) 

URL: DELETE http://localhost:8080/pacientes/{idPaciente}
 
* Endpoints Consultas: 

Crear una consulta (POST) 

URL: POST http://localhost:8080/consultas 

Body:

    {
      "fechaHora": "2024-12-10T10:00:00",
      "diagnostico": "Consulta general",
      "paciente": {
      "idPaciente": 1  // Asegúrate de que este sea un ID válido de un paciente en la base de datos
         }
      }
 
* Obtener todas las consultas (GET) 

URL: GET http://localhost:8080/consultas

* Obtener una consulta por ID (GET) 

URL: GET http://localhost:8080/consultas/{idConsulta}

* Eliminar una consulta (DELETE) 

URL: DELETE http://localhost:8080/consultas/{idConsulta}