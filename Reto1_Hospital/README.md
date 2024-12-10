# Reto 1: Modelo de Datos "Hospital"

Este proyecto es parte de la prueba técnica y se centra en la gestión de datos para un hospital. Implementa las entidades `Hospital`, `Cuarto`, `Persona` (Doctor/Paciente), y `Operacion`, utilizando **Spring Boot**, **JPA**, y **MySQL** como base de datos.

## Instrucciones para ejecutar el proyecto

### 1. Requisitos previos:
- Tener **Java 11** o superior instalado.
- Tener **MySQL** instalado y en ejecución.
- Tener **Maven** instalado para la gestión de dependencias.

### 2. Configuración de la base de datos:
1. **Crear base de datos**:
   Asegúrate de tener la base de datos en MySQL disponible **HospitalDB**.

2. **Ejecuta los siguientes scripts SQL** para crear las tablas y cargar los datos de ejemplo:
    - **Ejecuta** el script `create_tables.sql` para crear las tablas en la base de datos.
    - **Ejecuta** el script `insert_data.sql` para insertar algunos datos de ejemplo.

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

5. Probar los Endpoints.
   Los siguientes endpoints están disponibles en la aplicación para interactuar con los pacientes y consultas:

* Endpoints Pacientes:

Crear un hospital (POST)

URL: POST http://localhost:8080/hospitales

Body:

    {
      "nombre": "Hospital ABC",
      "direccion": "Calle 123"
      }

* Obtener todos los hospitales (GET)

URL: GET http://localhost:8080/hospitales

* Obtener un hospital por ID (GET)

URL: GET http://localhost:8080/hospitales/{idHospital}

* Actualizar un hospital (PUT)

URL: PUT http://localhost:8080/hospitales/{idHospital}

Body:

    {
      "nombre": "Hospital Central",
      "direccion": "Av. Reforma 789"
      }

* Eliminar un hospital (DELETE)

URL: DELETE http://localhost:8080/hospitales/{idHospital}