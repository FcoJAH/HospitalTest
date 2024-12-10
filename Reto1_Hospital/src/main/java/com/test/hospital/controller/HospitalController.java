package com.test.hospital.controller;

import com.test.hospital.model.Hospital;
import com.test.hospital.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospitales")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping
    public List<Hospital> getAllHospitals() {
        return hospitalService.getAllHospitals();
    }

    @GetMapping("/{idHospital}")
    public Hospital getHospitalById(@PathVariable Long idHospital) {
        return hospitalService.getHospitalById(idHospital);
    }

    @PostMapping
    public Hospital createHospital(@RequestBody Hospital hospital) {
        return hospitalService.saveHospital(hospital);
    }

    @PutMapping("/{idHospital}")
    public Hospital updateHospital(@PathVariable Long idHospital, @RequestBody Hospital hospital) {
        return hospitalService.updateHospital(idHospital, hospital);
    }

    @DeleteMapping("/{idHospital}")
    public void deleteHospital(@PathVariable Long idHospital) {
        hospitalService.deleteHospital(idHospital);
    }
}
