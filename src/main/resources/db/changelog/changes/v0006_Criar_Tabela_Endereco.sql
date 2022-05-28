CREATE SEQUENCE endereco_id_seq;

create table endereco (
    id int4 NOT NULL DEFAULT nextval('endereco_id_seq'::regclass),
    cadastro_id     INTEGER not null,
    rua            varchar (255) not null,
    bairro            varchar (255) not null,
    cidade            varchar (255) not null,
    numero            varchar (255) not null,
    complemento            varchar (255) not null,
    cep            varchar (255) not null,
    CONSTRAINT fk_cadastro_id FOREIGN KEY (cadastro_id) REFERENCES cadastro (id),
    primary key (id)
)