package com.test.hospital.service;

import com.test.hospital.model.Hospital;
import com.test.hospital.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalService {
    @Autowired
    private HospitalRepository hospitalRepository;

    public List<Hospital> getAllHospitals() {
        return hospitalRepository.findAll();
    }

    public Hospital saveHospital(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

    public Hospital getHospitalById(Long idHospital) {
        Optional<Hospital> hospital = hospitalRepository.findById(idHospital);
        return hospital.orElseThrow(() -> new RuntimeException("Hospital not found with id " + idHospital));  // Lanza excepción si no lo encuentra
    }

    public Hospital updateHospital(Long idHospital, Hospital hospital) {
        // Verificar si el hospital existe
        if (!hospitalRepository.existsById(idHospital)) {
            throw new RuntimeException("Hospital not found with id " + idHospital);
        }

        // Actualizar el hospital
        hospital.setIdHospital(idHospital);  // Establece el ID del hospital que se debe actualizar
        return hospitalRepository.save(hospital);  // Guarda el hospital actualizado
    }

    public void deleteHospital(Long idHospital) {
        if (!hospitalRepository.existsById(idHospital)) {
            throw new RuntimeException("Hospital not found with id " + idHospital);
        }
        hospitalRepository.deleteById(idHospital);  // Elimina el hospital por su ID
    }

}

