
CREATE SCHEMA biblioteca;


CREATE TABLE IF NOT EXISTS biblioteca.bibliotecario (
    bibliotecario_id BIGSERIAL PRIMARY KEY,
    bibliotecario_nome VARCHAR(50) NOT NULL,
    bibliotecario_email VARCHAR(50) UNIQUE,
    bibliotecario_senha VARCHAR(15) NOT NULL
);

CREATE TABLE IF NOT EXISTS biblioteca.visitante (
    visitante_id BIGSERIAL PRIMARY KEY,
    visitante_nome VARCHAR(50) NOT NULL,
    visitante_telefone VARCHAR(25)
);

CREATE TABLE IF NOT EXISTS biblioteca.livro (
    livro_id BIGSERIAL PRIMARY KEY,
    livro_titulo VARCHAR(50) NOT NULL,
    autor_livro VARCHAR(50),
    ano_publicacao_livro INTEGER
);

CREATE TABLE IF NOT EXISTS biblioteca.membro (
    membro_id BIGSERIAL PRIMARY KEY,
    membro_nome VARCHAR(50) NOT NULL,
    membro_endereco VARCHAR(150),
    membro_telefone VARCHAR(25)
);

CREATE TABLE IF NOT EXISTS biblioteca.emprestimo (
    emprestimo_id BIGSERIAL PRIMARY KEY,
    livro_id BIGINT NOT NULL,
    membro_id BIGINT NOT NULL,
    data_emprestimo VARCHAR(50) NOT NULL,
    data_devolucao VARCHAR(50) NOT NULL,
    FOREIGN KEY (livro_id) REFERENCES biblioteca.livro(livro_id),
    FOREIGN KEY (membro_id) REFERENCES biblioteca.membro(membro_id)
);
