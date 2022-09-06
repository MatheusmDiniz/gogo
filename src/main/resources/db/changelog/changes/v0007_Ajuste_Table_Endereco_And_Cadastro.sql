DROP TABLE endereco;
DROP TABLE cadastro;

DROP SEQUENCE cadastro_id_seq;
DROP SEQUENCE endereco_id_seq;


CREATE SEQUENCE endereco_id_seq;

create table endereco (
    id int4 NOT NULL DEFAULT nextval('endereco_id_seq'::regclass),
    rua            varchar (255) not null,
    bairro            varchar (255) not null,
    cidade            varchar (255) not null,
    numero            varchar (255) not null,
    pais            VARCHAR(255) not null,
    complemento       varchar (255) null,
    cep            varchar (255) not null,
    CONSTRAINT endereco_pkey primary key (id)
);

CREATE SEQUENCE cliente_id_seq;

CREATE TABLE public.cliente (
	id int4 NOT NULL DEFAULT nextval('cliente_id_seq'::regclass),
	endereco_id     INTEGER,
	nome varchar(255) NOT NULL,
	data_nascimento timestamptz NULL,
	sexo varchar(255) NULL,
	telefone varchar(255) NULL,
	rg varchar(255) NULL,
	cpf varchar(255) NULL,
	CONSTRAINT cliente_pkey PRIMARY KEY (id),
	CONSTRAINT fk_endereco FOREIGN KEY (endereco_id) REFERENCES endereco (id)
);

