CREATE SEQUENCE client_id_seq;

create table cliente (
    id int4 NOT NULL DEFAULT nextval('client_id_seq'::regclass),
    nome            varchar (255) not null,
    data_nascimento            timestamptz NULL,
    primary key (id)
)
