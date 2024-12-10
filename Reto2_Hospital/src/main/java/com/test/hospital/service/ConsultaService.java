package com.test.hospital.service;

import com.test.hospital.model.Consulta;
import com.test.hospital.model.Paciente;
import com.test.hospital.repository.ConsultaRepository;
import com.test.hospital.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    public Consulta saveConsulta(Consulta consulta) {
        // Verificar si el paciente existe
        Paciente paciente = pacienteRepository.findById(consulta.getPaciente().getIdPaciente()).orElse(null);
        if (paciente == null) {
            throw new RuntimeException("El paciente con ID " + consulta.getPaciente().getIdPaciente() + " no existe.");
        }

        // Asignar el paciente encontrado a la consulta
        consulta.setPaciente(paciente);

        // Guardar la consulta con el paciente asociado
        return consultaRepository.save(consulta);
    }

    public List<Consulta> getAllConsultas() {
        return consultaRepository.findAll();
    }

    public Consulta getConsultaById(Long idConsulta) {
        return consultaRepository.findById(idConsulta).orElseThrow(() -> new RuntimeException("Consulta no encontrada"));
    }

    public void deleteConsulta(Long idConsulta) {
        consultaRepository.deleteById(idConsulta);
    }
}

