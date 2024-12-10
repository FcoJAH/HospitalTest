package com.test.hospital.repository;

import com.test.hospital.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    // Verificar si existe un paciente con el mismo número de seguro social
    boolean existsByNumeroSeguroSocial(String numeroSeguroSocial);
}

