package com.lockey.lockey.service;

import com.lockey.lockey.model.Servicos;
import com.lockey.lockey.repository.ServicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicosService {

    @Autowired
    private ServicosRepository servicosRepository;

    public List<Servicos> getAllServicos() {
        return servicosRepository.findAll();
    }

    public Optional<Servicos> getServicosById(Long id) {
        return servicosRepository.findById(id);
    }

    public Servicos createServicos(Servicos servicos) {
        return servicosRepository.save(servicos);
    }

    public void deleteServicos(Long id) {
        servicosRepository.deleteById(id);
    }
}
