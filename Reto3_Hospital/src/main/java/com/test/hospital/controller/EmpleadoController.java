package com.test.hospital.controller;

import com.test.hospital.model.Empleado;
import com.test.hospital.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    // Crear un nuevo empleado
    @PostMapping
    public Empleado createEmpleado(@RequestBody Empleado empleado) {
        return empleadoService.saveEmpleado(empleado);
    }

    // Obtener todos los empleados
    @GetMapping
    public List<Empleado> getAllEmpleados() {
        return empleadoService.getAllEmpleados();
    }

    // Obtener un empleado por ID
    @GetMapping("/{idEmpleado}")
    public Empleado getEmpleadoById(@PathVariable Long idEmpleado) {
        return empleadoService.getEmpleadoById(idEmpleado);
    }

    // Actualizar un empleado
    @PutMapping("/{idEmpleado}")
    public Empleado updateEmpleado(@PathVariable Long idEmpleado, @RequestBody Empleado empleadoDetails) {
        return empleadoService.updateEmpleado(idEmpleado, empleadoDetails);
    }

    // Eliminar un empleado
    @DeleteMapping("/{idEmpleado}")
    public void deleteEmpleado(@PathVariable Long idEmpleado) {
        empleadoService.deleteEmpleado(idEmpleado);
    }
}
