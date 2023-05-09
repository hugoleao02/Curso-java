alter table empresas modify cnpj varchar(14);

insert into empresas(nome,cnpj)
values
    ('Bradesco',87489756421321),
    ('Vale',87489751461361),
    ('Cielo',12345678902136);

    desc empresas;
    desc prefeitos;

    select * from empresas;
    select * from cidades;

    insert into  empresas_unidades(empresa_id, cidade_id,sede)
    values
        (1,1,1),
        (1,2,0),
        (2,1,0),
        (2,2,1);