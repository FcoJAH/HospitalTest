package com.test.hospital.controller;

import com.test.hospital.model.Paciente;
import com.test.hospital.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<Paciente> getAllPacientes() {
        return pacienteService.getAllPacientes();
    }

    @GetMapping("/{idPaciente}")
    public Paciente getPacienteById(@PathVariable Long idPaciente) {
        return pacienteService.getPacienteById(idPaciente);
    }

    @PostMapping
    public Paciente createPaciente(@RequestBody Paciente paciente) {
        return pacienteService.savePaciente(paciente);
    }

    @PutMapping("/{idPaciente}")
    public Paciente updatePaciente(@PathVariable Long idPaciente, @RequestBody Paciente paciente) {
        return pacienteService.updatePaciente(idPaciente, paciente);
    }

    @DeleteMapping("/{idPaciente}")
    public void deletePaciente(@PathVariable Long idPaciente) {
        pacienteService.deletePaciente(idPaciente);
    }
}

