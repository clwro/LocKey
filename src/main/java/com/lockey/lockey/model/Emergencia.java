package com.lockey.lockey.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Emergencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_emergencia")
    private String tipoEmergencia;

    private String descricao;

    @Column(name = "nivel_urgencia")
    private Integer nivelUrgencia;
}
