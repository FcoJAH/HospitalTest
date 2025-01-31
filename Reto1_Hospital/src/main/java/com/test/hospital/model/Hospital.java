package com.test.hospital.model;

import jakarta.persistence.*;

@Entity
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHospital;

    private String nombre;
    private String direccion;

    // Getters y Setters
    public Long getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(Long idHospital) {
        this.idHospital = idHospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
