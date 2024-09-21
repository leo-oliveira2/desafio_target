SELECT c.id_cliente, c.razao_social as nome, t.numero_telefone as
FROM clientes c
JOIN telefones t ON c.id_cliente = t.id_cliente
JOIN estados e ON c.estado_id = e.id_estado
WHERE e.sigla_estado = 'SP';