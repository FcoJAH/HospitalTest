CREATE DATABASE GestionPacientes;
USE GestionPacientes;

CREATE TABLE Paciente (
    id_paciente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    edad INT NOT NULL,
    numero_seguro_social VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE Consulta (
    id_consulta INT AUTO_INCREMENT PRIMARY KEY,
    fecha_hora DATETIME NOT NULL,
    id_paciente INT NOT NULL,
    diagnostico VARCHAR(255),
    FOREIGN KEY (id_paciente) REFERENCES Paciente(id_paciente)
);
