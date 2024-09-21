CREATE TABLE clientes (
    id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    razao_social VARCHAR(255) NOT NULL,
    estado_id INT,
    FOREIGN KEY (estado_id) REFERENCES estados(id_estado)
);

CREATE TABLE telefones (
    id_telefone INT PRIMARY KEY AUTO_INCREMENT,
    numero_telefone VARCHAR(20) NOT NULL,
    id_cliente INT,
    id_tipo_telefone INT,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
    FOREIGN KEY (id_tipo_telefone) REFERENCES tipos_telefone(id_tipo_telefone)
);

CREATE TABLE tipos_telefone (
    id_tipo_telefone INT PRIMARY KEY AUTO_INCREMENT,
    descricao_tipo VARCHAR(50) NOT NULL
);

CREATE TABLE estados (
    id_estado INT PRIMARY KEY AUTO_INCREMENT,
    sigla_estado CHAR(2) NOT NULL,
    nome_estado VARCHAR(100) NOT NULL
);
