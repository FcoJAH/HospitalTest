package com.test.hospital.service;

import com.test.hospital.model.Paciente;
import com.test.hospital.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente savePaciente(Paciente paciente) {
        // Verificar si el número de seguro social ya existe
        if (pacienteRepository.existsByNumeroSeguroSocial(paciente.getNumeroSeguroSocial())) {
            throw new RuntimeException("El número de seguro social ya está registrado.");
        }

        try {
            return pacienteRepository.save(paciente);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Error de integridad de datos: " + e.getMessage());
        }
    }

    public List<Paciente> getAllPacientes() {
        return pacienteRepository.findAll();
    }

    public Paciente getPacienteById(Long idPaciente) {
        return pacienteRepository.findById(idPaciente).orElseThrow(() -> new RuntimeException("Paciente no encontrado"));
    }

    public Paciente updatePaciente(Long idPaciente, Paciente paciente) {
        paciente.setIdPaciente(idPaciente);
        return pacienteRepository.save(paciente);
    }

    public void deletePaciente(Long idPaciente) {
        pacienteRepository.deleteById(idPaciente);
    }
}

