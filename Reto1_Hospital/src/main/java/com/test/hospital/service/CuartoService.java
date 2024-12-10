package com.test.hospital.service;

import com.test.hospital.model.Cuarto;
import com.test.hospital.repository.CuartoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuartoService {
    @Autowired
    private CuartoRepository cuartoRepository;

    public Cuarto saveCuarto(Cuarto cuarto) {
        return cuartoRepository.save(cuarto);
    }
}

