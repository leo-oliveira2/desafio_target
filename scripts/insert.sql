INSERT INTO estados (id_estado, sigla_estado, nome_estado) 
VALUES ('SP', 'São Paulo'),
       ('RJ', 'Rio de Janeiro'),
       ('MG', 'Minas Gerais');

INSERT INTO tipos_telefone (id_tipo_telefone, descricao_tipo) 
VALUES ('Celular'),
       ('Residencial'),
       ('Comercial');

INSERT INTO clientes (id_cliente, razao_social, estado_id) 
VALUES ('Empresa A', 1),  
       ('Empresa B', 2),  
       ('Empresa C', 3);  

INSERT INTO telefones (id_telefone, numero_telefone, id_cliente, id_tipo_telefone) 
VALUES ('11999999999', 1, 1),  -- Cliente 1, tipo 'Celular'
       ('2133333333', 2, 2),   -- Cliente 2, tipo 'Residencial'
       ('3132222222', 3, 3),   -- Cliente 3, tipo 'Comercial'
       ('11988888888', 1, 1),  -- Cliente 1, tipo 'Celular'
       ('2122222222', 2, 3);   -- Cliente 2, tipo 'Comercial'
