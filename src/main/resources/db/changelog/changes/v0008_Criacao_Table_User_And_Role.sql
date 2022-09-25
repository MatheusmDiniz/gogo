CREATE SEQUENCE user_id_seq;

CREATE TABLE public.user (
    id int4 NOT NULL DEFAULT nextval('user_id_seq'::regclass),
    name            varchar (255) not null,
    email            varchar (255) not null,
    password            varchar (255) not null,
    CONSTRAINT user_pkey primary key (id)
);

