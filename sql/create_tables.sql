CREATE SEQUENCE IF NOT EXISTS public.tbl_aerolineas_id_aerolinea_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;

CREATE SEQUENCE IF NOT EXISTS public.tbl_aeropuertos_id_aeropuerto_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;

CREATE SEQUENCE IF NOT EXISTS public.tbl_movimientos_id_movimiento_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;


CREATE SEQUENCE IF NOT EXISTS public.tbl_vuelos_id_vuelo_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;


CREATE TABLE IF NOT EXISTS public.tbl_aerolineas
(
    id_aerolinea integer NOT NULL DEFAULT nextval('tbl_aerolineas_id_aerolinea_seq'::regclass),
    nombre_aerolinea character varying(30) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT tbl_aerolineas_pkey PRIMARY KEY (id_aerolinea)
);

CREATE TABLE IF NOT EXISTS public.tbl_aeropuertos
(
    id_aeropuerto integer NOT NULL DEFAULT nextval('tbl_aeropuertos_id_aeropuerto_seq'::regclass),
    nombre_aeropuerto character varying(50) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT tbl_aeropuertos_pkey PRIMARY KEY (id_aeropuerto)
);

CREATE TABLE IF NOT EXISTS public.tbl_movimientos
(
    id_movimiento integer NOT NULL DEFAULT nextval('tbl_movimientos_id_movimiento_seq'::regclass),
    descripcion character varying(20) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT tbl_movimientos_pkey PRIMARY KEY (id_movimiento)
);

CREATE TABLE IF NOT EXISTS public.tbl_vuelos
(
    id_vuelo integer NOT NULL DEFAULT nextval('tbl_vuelos_id_vuelo_seq'::regclass),
    dia timestamp without time zone NOT NULL,
    id_aerolinea integer NOT NULL,
    id_aeropuerto integer NOT NULL,
    id_movimiento integer NOT NULL,
    CONSTRAINT tbl_vuelos_pkey PRIMARY KEY (id_vuelo),
    CONSTRAINT fk_vuelo_aerolinea FOREIGN KEY (id_aerolinea)
        REFERENCES public.tbl_aerolineas (id_aerolinea) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_vuelo_aeropuerto FOREIGN KEY (id_aeropuerto)
        REFERENCES public.tbl_aeropuertos (id_aeropuerto) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_vuelo_movimiento FOREIGN KEY (id_movimiento)
        REFERENCES public.tbl_movimientos (id_movimiento) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

