package com.lockey.lockey.service;

import com.lockey.lockey.model.Emergencia;
import com.lockey.lockey.repository.EmergenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmergenciaService {

    @Autowired
    private EmergenciaRepository emergenciaRepository;

    public List<Emergencia> getAllEmergencias() {
        return emergenciaRepository.findAll();
    }

    public Optional<Emergencia> getEmergenciaById(Long id) {
        return emergenciaRepository.findById(id);
    }

    public Emergencia createEmergencia(Emergencia emergencia) {
        return emergenciaRepository.save(emergencia);
    }

    public void deleteEmergencia(Long id) {
        emergenciaRepository.deleteById(id);
    }
}
