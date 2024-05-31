package com.lockey.lockey.controller;

import com.lockey.lockey.model.Financeiro;
import com.lockey.lockey.service.FinanceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/financeiros")
public class FinanceiroController {

    @Autowired
    private FinanceiroService financeiroService;

    @GetMapping
    public List<Financeiro> getAllFinanceiros() {
        return financeiroService.getAllFinanceiros();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Financeiro> getFinanceiroById(@PathVariable Long id) {
        return financeiroService.getFinanceiroById(id)
                .map(financeiro -> ResponseEntity.ok().body(financeiro))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Financeiro createFinanceiro(@RequestBody Financeiro financeiro) {
        return financeiroService.createFinanceiro(financeiro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFinanceiro(@PathVariable Long id) {
        financeiroService.deleteFinanceiro(id);
        return ResponseEntity.noContent().build();
    }
}
