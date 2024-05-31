package com.lockey.lockey.service;

import com.lockey.lockey.model.Financeiro;
import com.lockey.lockey.repository.FinanceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FinanceiroService {

    @Autowired
    private FinanceiroRepository financeiroRepository;

    public List<Financeiro> getAllFinanceiros() {
        return financeiroRepository.findAll();
    }

    public Optional<Financeiro> getFinanceiroById(Long id) {
        return financeiroRepository.findById(id);
    }

    public Financeiro createFinanceiro(Financeiro financeiro) {
        return financeiroRepository.save(financeiro);
    }

    public void deleteFinanceiro(Long id) {
        financeiroRepository.deleteById(id);
    }
}
