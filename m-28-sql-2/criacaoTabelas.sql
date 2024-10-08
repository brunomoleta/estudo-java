CREATE TABLE CATEGORIA (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    isComida BOOLEAN DEFAULT TRUE
);

CREATE TABLE PRODUTO (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    preço NUMERIC NOT NULL,
    desconto BOOLEAN DEFAULT FALSE,
    categoria_id INTEGER,
    FOREIGN KEY (categoria_id) REFERENCES CATEGORIA (id)
);

CREATE TABLE CLIENTE (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    celular INTEGER NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    endereço VARCHAR(50) NOT NULL UNIQUE,
    criacao TIMESTAMP DEFAULT NOW(),
    clubeFidelidade BOOLEAN DEFAULT FALSE,
    image VARCHAR(50) DEFAULT NULL
);

CREATE TABLE VENDA (
    id SERIAL PRIMARY KEY,
    cliente_id INTEGER,
    criacao TIMESTAMP DEFAULT NOW(),
    FOREIGN KEY (cliente_id) REFERENCES CLIENTE (id)
);

CREATE TABLE VENDA_PRODUTO (
    venda_id INTEGER,
    produto_id INTEGER,
    PRIMARY KEY (venda_id, produto_id),
    FOREIGN KEY (venda_id) REFERENCES VENDA (id),
    FOREIGN KEY (produto_id) REFERENCES PRODUTO (id)
);
