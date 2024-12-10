package com.test.hospital.model;

import jakarta.persistence.*;

@Entity
public class Cuarto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCuarto;

    private Integer numeroCuarto;

    @ManyToOne
    @JoinColumn(name = "id_hospital")
    private Hospital hospital;

    // Getters y Setters
    public Long getIdCuarto() {
        return idCuarto;
    }

    public void setIdCuarto(Long idCuarto) {
        this.idCuarto = idCuarto;
    }

    public Integer getNumeroCuarto() {
        return numeroCuarto;
    }

    public void setNumeroCuarto(Integer numeroCuarto) {
        this.numeroCuarto = numeroCuarto;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
