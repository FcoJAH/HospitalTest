package com.test.hospital.model;

import jakarta.persistence.*;

@Entity
public class Operacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOperacion;

    private String fechaHora;

    @ManyToOne
    @JoinColumn(name = "id_doctor")
    private Persona doctor;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Persona paciente;

    @ManyToOne
    @JoinColumn(name = "id_cuarto")
    private Cuarto cuarto;

    // Getters y Setters
    public Long getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(Long idOperacion) {
        this.idOperacion = idOperacion;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Persona getDoctor() {
        return doctor;
    }

    public void setDoctor(Persona doctor) {
        this.doctor = doctor;
    }

    public Persona getPaciente() {
        return paciente;
    }

    public void setPaciente(Persona paciente) {
        this.paciente = paciente;
    }

    public Cuarto getCuarto() {
        return cuarto;
    }

    public void setCuarto(Cuarto cuarto) {
        this.cuarto = cuarto;
    }
}
