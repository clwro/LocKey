package com.lockey.lockey;

import com.lockey.lockey.model.*;
import com.lockey.lockey.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;

@Component
public class DbSeeder implements CommandLineRunner {

    private final ImovelRepository imovelRepository;
    private final UsuarioRepository usuarioRepository;
    private final FinanceiroRepository financeiroRepository;
    private final EmergenciaRepository emergenciaRepository;
    private final ServicosRepository servicosRepository;

    @Autowired
    public DbSeeder(ImovelRepository imovelRepository, UsuarioRepository usuarioRepository,
                    FinanceiroRepository financeiroRepository, EmergenciaRepository emergenciaRepository,
                    ServicosRepository servicosRepository) {
        this.imovelRepository = imovelRepository;
        this.usuarioRepository = usuarioRepository;
        this.financeiroRepository = financeiroRepository;
        this.emergenciaRepository = emergenciaRepository;
        this.servicosRepository = servicosRepository;
    }

    @Override
    public void run(String... args) {
        // Seed Imovel
        Imovel imovel1 = new Imovel(null, "Rua A, 123", "Casa A", "João Silva");
        Imovel imovel2 = new Imovel(null, "Rua B, 456", "Casa B", "Maria Souza");
        Imovel imovel3 = new Imovel(null, "Rua C, 789", "Casa C", "Carlos Santos");
        imovelRepository.saveAll(Arrays.asList(imovel1, imovel2, imovel3));

        // Seed Usuario
        Usuario usuario1 = new Usuario(null, "joao", "senha123", "locatario", imovel1);
        Usuario usuario2 = new Usuario(null, "maria", "senha456", "inquilino", imovel2);
        Usuario usuario3 = new Usuario(null, "carlos", "senha789", "locatario", imovel3);
        usuarioRepository.saveAll(Arrays.asList(usuario1, usuario2, usuario3));

        // Seed Financeiro
        Financeiro financeiro1 = new Financeiro(null, imovel1, new BigDecimal("1500.00"), "pendente");
        Financeiro financeiro2 = new Financeiro(null, imovel2, new BigDecimal("2000.00"), "pago");
        Financeiro financeiro3 = new Financeiro(null, imovel3, new BigDecimal("2500.00"), "pendente");
        financeiroRepository.saveAll(Arrays.asList(financeiro1, financeiro2, financeiro3));

        // Seed Emergencia
        Emergencia emergencia1 = new Emergencia(null, "Incêndio", "Fogo no apartamento", 3);
        Emergencia emergencia2 = new Emergencia(null, "Inundação", "Água invadiu a casa", 2);
        Emergencia emergencia3 = new Emergencia(null, "Assalto", "Tentativa de assalto", 1);
        emergenciaRepository.saveAll(Arrays.asList(emergencia1, emergencia2, emergencia3));

        // Seed Servicos
        Servicos servico1 = new Servicos(null, "Eletricista", "Troca de fiação", 2);
        Servicos servico2 = new Servicos(null, "Encanador", "Reparo no encanamento", 3);
        Servicos servico3 = new Servicos(null, "Jardineiro", "Corte de grama", 1);
        servicosRepository.saveAll(Arrays.asList(servico1, servico2, servico3));
    }
}
