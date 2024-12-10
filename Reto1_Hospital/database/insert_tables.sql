INSERT INTO Hospital (nombre, direccion) VALUES ('Hospital General', 'Av. Libertad 123');

INSERT INTO Persona (nombre, numero_seguro_social, tipo_persona, especialidad)
VALUES ('Dr. Juan Pérez', '123456789', 'DOCTOR', 'Cardiología');

INSERT INTO Persona (nombre, numero_seguro_social, tipo_persona, edad)
VALUES ('Carlos García', '112233445', 'PACIENTE', 35);

INSERT INTO Cuarto (numero_cuarto, id_hospital) VALUES (101, 1);

INSERT INTO Operacion (fecha_hora, id_doctor, id_paciente, id_cuarto)
VALUES ('2024-12-10 10:00:00', 1, 1, 1);
