package com.test.hospital.repository;

import com.test.hospital.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario, como encontrar empleados por puesto o salario.
}
