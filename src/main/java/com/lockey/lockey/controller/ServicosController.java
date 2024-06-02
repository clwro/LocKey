package com.lockey.lockey.controller;

import com.lockey.lockey.model.Servicos;
import com.lockey.lockey.service.ServicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/servicos")
public class ServicosController {

    @Autowired
    private ServicosService servicosService;

    @GetMapping
    public List<Servicos> getAllServicos() {
        return servicosService.getAllServicos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servicos> getServicosById(@PathVariable Long id) {
        return servicosService.getServicosById(id)
                .map(servicos -> ResponseEntity.ok().body(servicos))
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping
    public Servicos createServicos(@RequestBody Servicos servicos) {
        return servicosService.createServicos(servicos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteServicos(@PathVariable Long id) {
        servicosService.deleteServicos(id);
        return ResponseEntity.noContent().build();
    }
}
