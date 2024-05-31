package com.lockey.lockey.service;

import com.lockey.lockey.model.Imovel;
import com.lockey.lockey.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository imovelRepository;

    public List<Imovel> getAllImovels() {
        return imovelRepository.findAll();
    }

    public Optional<Imovel> getImovelById(Long id) {
        return imovelRepository.findById(id);
    }

    public Imovel createImovel(Imovel imovel) {
        return imovelRepository.save(imovel);
    }

    public void deleteImovel(Long id) {
        imovelRepository.deleteById(id);
    }

}
