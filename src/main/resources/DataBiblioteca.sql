
INSERT INTO biblioteca.bibliotecario (bibliotecario_nome, bibliotecario_email, bibliotecario_senha)
VALUES
('Carlos Pereira', 'carlos@example.com', 'senha123');

INSERT INTO biblioteca.visitante (visitante_nome, visitante_telefone)
VALUES
('Roberto Carlos', '555-2468');

INSERT INTO biblioteca.livro (livro_titulo, autor_livro, ano_publicacao_livro)
VALUES
('Dom Casmurro', 'Machado de Assis', 1899),
('O Pequeno Príncipe', 'Antoine de Saint-Exupéry', 1943);

INSERT INTO biblioteca.membro (membro_nome, membro_endereco, membro_telefone)
VALUES
('João Silva', 'Rua das Flores, 123', '555-1234'),
('Maria Oliveira', 'Avenida do Estado, 987', '555-5678');

-- Assumindo que os IDs dos livros e membros inseridos são 1 e 2, respectivamente
INSERT INTO biblioteca.emprestimo (livro_id, membro_id, data_emprestimo, data_devolucao)
VALUES
(1, 1, '2023-01-01', '2023-01-15'),
(2, 2, '2023-02-01', '2023-02-11');
