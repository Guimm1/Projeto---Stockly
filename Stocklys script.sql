CREATE database stocklys;

USE stocklys;

CREATE TABLE funcionario (
	id_funcionario INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nome_funcionario VARCHAR(255) NOT NULL,
    codigo_empresa INT NOT NULL,
    senha VARCHAR(15) NOT NULL,
	cpf CHAR(11) NOT NULL,
    telefone CHAR(11) NOT NULL,
    email VARCHAR(255) NOT NULL
);

CREATE TABLE fornecedor (
	id_fornecedor INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cnpj CHAR(14) NOT NULL,
    logadouro VARCHAR(255), 
    bairro VARCHAR(255),
    cep INT NOT NULL
);

CREATE TABLE produto (
	id_produto INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    marca VARCHAR(255) NOT NULL,
    fabricacao DATE NOT NULL,
    validade DATE NOT NULL,
    quantidade INT NOT NULL

);

CREATE TABLE venda(
	id_venda INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	datah DATE NOT NULL
);

CREATE TABLE produto_venda(
	id_produto_venda INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    quantidade_venda INT NOT NULL,
    id_venda INT,
    id_produto INT,
    FOREIGN KEY (id_venda) REFERENCES venda(id_venda),
	FOREIGN KEY (id_produto) REFERENCES produto(id_produto)
);

CREATE TABLE produto_fornecedor(
	id_produto_fornecedor INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_fornecedor INT,
    id_produto INT,
    FOREIGN KEY (id_fornecedor) REFERENCES fornecedor(id_fornecedor),
    FOREIGN KEY (id_produto) REFERENCES produto(id_produto)
);

SELECT * FROM funcionario;
SELECT * FROM produto;
SELECT * FROM fornecedor;
SELECT * FROM venda;
SELECT * FROM produto_venda;
SELECT * FROM produto_fornecedor;

