CREATE DATABASE HospitalDB;
USE HospitalDB;

CREATE TABLE Hospital (
    id_hospital INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(255) NOT NULL
);

CREATE TABLE Cuarto (
    id_cuarto INT AUTO_INCREMENT PRIMARY KEY,
    numero_cuarto INT NOT NULL,
    id_hospital INT NOT NULL,
    FOREIGN KEY (id_hospital) REFERENCES Hospital(id_hospital)
);

CREATE TABLE Persona (
    id_persona INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    numero_seguro_social VARCHAR(50) UNIQUE NOT NULL,
    tipo_persona ENUM('DOCTOR', 'PACIENTE') NOT NULL,
    especialidad VARCHAR(100),
    edad INT,
    CHECK (tipo_persona = 'DOCTOR' AND especialidad IS NOT NULL OR tipo_persona = 'PACIENTE' AND edad IS NOT NULL)
);

CREATE TABLE Operacion (
    id_operacion INT AUTO_INCREMENT PRIMARY KEY,
    fecha_hora DATETIME NOT NULL,
    id_doctor INT NOT NULL,
    id_paciente INT NOT NULL,
    id_cuarto INT NOT NULL,
    FOREIGN KEY (id_doctor) REFERENCES Persona(id_persona),
    FOREIGN KEY (id_paciente) REFERENCES Persona(id_persona),
    FOREIGN KEY (id_cuarto) REFERENCES Cuarto(id_cuarto)
);
