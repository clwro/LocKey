CREATE TABLE IF NOT EXISTS IMOVEL (
                                      id INT AUTO_INCREMENT PRIMARY KEY,
                                      endereco VARCHAR(255) NOT NULL,
    nome VARCHAR(255) NOT NULL,
    nome_inquilino VARCHAR(255) NOT NULL
    );

CREATE TABLE IF NOT EXISTS USUARIO (
                                       id INT AUTO_INCREMENT PRIMARY KEY,
                                       login VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    tipo_conta VARCHAR(255) NOT NULL,
    id_imovel INT,
    FOREIGN KEY (id_imovel) REFERENCES IMOVEL(id)
    );

CREATE TABLE IF NOT EXISTS FINANCEIRO (
                                          id INT AUTO_INCREMENT PRIMARY KEY,
                                          id_imovel INT,
                                          boletos DECIMAL(10, 2) NOT NULL,
    status_pagamento VARCHAR(255) NOT NULL,
    FOREIGN KEY (id_imovel) REFERENCES IMOVEL(id)
    );

CREATE TABLE IF NOT EXISTS EMERGENCIA (
                                          id INT AUTO_INCREMENT PRIMARY KEY,
                                          tipo_emergencia VARCHAR(255) NOT NULL,
    descricao TEXT NOT NULL,
    nivel_urgencia INT NOT NULL
    );

CREATE TABLE IF NOT EXISTS SERVICOS (
                                        id INT AUTO_INCREMENT PRIMARY KEY,
                                        tipo_servico VARCHAR(255) NOT NULL,
    descricao TEXT NOT NULL,
    urgencia INT NOT NULL
    );