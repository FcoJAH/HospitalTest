package com.test.hospital.service;

import com.test.hospital.model.Empleado;
import com.test.hospital.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    // Crear un nuevo empleado
    public Empleado saveEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    // Obtener todos los empleados
    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    // Obtener un empleado por su ID
    public Empleado getEmpleadoById(Long idEmpleado) {
        Optional<Empleado> empleado = empleadoRepository.findById(idEmpleado);
        return empleado.orElseThrow(() -> new RuntimeException("Empleado no encontrado"));
    }

    // Actualizar un empleado
    public Empleado updateEmpleado(Long idEmpleado, Empleado empleadoDetails) {
        Empleado empleado = getEmpleadoById(idEmpleado);
        empleado.setNombre(empleadoDetails.getNombre());
        empleado.setPuesto(empleadoDetails.getPuesto());
        empleado.setSalario(empleadoDetails.getSalario());
        empleado.setFechaIngreso(empleadoDetails.getFechaIngreso());
        return empleadoRepository.save(empleado);
    }

    // Eliminar un empleado
    public void deleteEmpleado(Long idEmpleado) {
        empleadoRepository.deleteById(idEmpleado);
    }
}
