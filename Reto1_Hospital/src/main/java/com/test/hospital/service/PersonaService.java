package com.test.hospital.service;

import com.test.hospital.model.Persona;
import com.test.hospital.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }
}

