package com.lockey.lockey.controller;

import com.lockey.lockey.model.Emergencia;
import com.lockey.lockey.service.EmergenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emergencias")
public class EmergenciaController {

    @Autowired
    private EmergenciaService emergenciaService;

    @GetMapping
    public List<Emergencia> getAllEmergencias() {
        return emergenciaService.getAllEmergencias();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Emergencia> getEmergenciaById(@PathVariable Long id) {
        return emergenciaService.getEmergenciaById(id)
                .map(emergencia -> ResponseEntity.ok().body(emergencia))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Emergencia createEmergencia(@RequestBody Emergencia emergencia) {
        return emergenciaService.createEmergencia(emergencia);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmergencia(@PathVariable Long id) {
        emergenciaService.deleteEmergencia(id);
        return ResponseEntity.noContent().build();
    }
}
