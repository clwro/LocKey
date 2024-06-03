package com.lockey.lockey.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Financeiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_imovel")
    private Imovel imovel;

    private BigDecimal valor;

    @Column(name = "status_pagamento")
    private String statusPagamento;

    @Column(name = "nome_conta")
    private String nomeConta;

    @Column(name = "data_vencimento")
    private String dataVencimento;
}
