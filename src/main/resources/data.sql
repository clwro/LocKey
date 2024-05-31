INSERT INTO imovel (endereco, nome, nome_inquilino) VALUES
('Rua A, 123', 'Casa A', 'João Silva'),
('Rua B, 456', 'Casa B', 'Maria Souza'),
('Rua C, 789', 'Casa C', 'Carlos Santos');

INSERT INTO usuario (login, senha, tipo_conta, id_imovel) VALUES
('joao', 'senha123', 'locatario', 1),
('maria', 'senha456', 'inquilino', 2),
('carlos', 'senha789', 'locatario', 3);

INSERT INTO financeiro (id_imovel, boletos, status_pagamento) VALUES
(1, 1500.00, 'pendente'),
(2, 2000.00, 'pago'),
(3, 2500.00, 'pendente');

INSERT INTO emergencia (tipo_emergencia, descricao, nivel_urgencia) VALUES
('Incêndio', 'Fogo no apartamento', 3),
('Inundação', 'Água invadiu a casa', 2),
('Assalto', 'Tentativa de assalto', 1);

INSERT INTO servicos (tipo_servico, descricao, urgencia) VALUES
('Eletricista', 'Troca de fiação', 2),
('Encanador', 'Reparo no encanamento', 3),
('Jardineiro', 'Corte de grama', 1);
