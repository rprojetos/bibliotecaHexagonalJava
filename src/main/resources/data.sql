-- Criando a tabela manualmente antes de inserir os dados
CREATE TABLE IF NOT EXISTS livros (
    titulo VARCHAR(255) PRIMARY KEY,
    autor VARCHAR(255),
    numero_paginas INT,
    tamanho_arquivo FLOAT,
    data_documento DATE
);

-- Inserindo os dados após garantir que a tabela existe
INSERT INTO livros (titulo, autor, numero_paginas, tamanho_arquivo, data_documento) VALUES
('ia-generativa.pdf', 'John Doe', 250, 3.5, '2024-01-01'),
('machine-learning.pdf', 'Jane Smith', 320, 4.2, '2023-12-10'),
('deep-learning.pdf', 'Alan Turing', 500, 6.8, '2022-11-15'),
('big-data.pdf', 'Ada Lovelace', 280, 3.9, '2023-07-20'),
('cloud-computing.pdf', 'Linus Torvalds', 450, 5.5, '2021-05-30'),
('blockchain.pdf', 'Satoshi Nakamoto', 200, 2.8, '2020-08-14'),
('cyber-security.pdf', 'Kevin Mitnick', 350, 4.7, '2023-04-22'),
('data-science.pdf', 'Andrew Ng', 400, 5.2, '2023-09-18'),
('artificial-intelligence.pdf', 'Geoffrey Hinton', 370, 4.9, '2022-06-25'),
('software-architecture.pdf', 'Martin Fowler', 420, 5.6, '2021-02-11');
