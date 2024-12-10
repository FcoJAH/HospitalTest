package com.test.hospital.controller;

import com.test.hospital.model.Consulta;
import com.test.hospital.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @GetMapping
    public List<Consulta> getAllConsultas() {
        return consultaService.getAllConsultas();
    }

    @GetMapping("/{idConsulta}")
    public Consulta getConsultaById(@PathVariable Long idConsulta) {
        return consultaService.getConsultaById(idConsulta);
    }

    @PostMapping
    public Consulta createConsulta(@RequestBody Consulta consulta) {
        return consultaService.saveConsulta(consulta);
    }

    @DeleteMapping("/{idConsulta}")
    public void deleteConsulta(@PathVariable Long idConsulta) {
        consultaService.deleteConsulta(idConsulta);
    }
}

