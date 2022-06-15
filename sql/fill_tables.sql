INSERT INTO public.tbl_aerolineas(
	nombre_aerolinea)
	VALUES ('Volaris');

INSERT INTO public.tbl_aerolineas(
	nombre_aerolinea)
	VALUES ('Aeromar');

INSERT INTO public.tbl_aerolineas(
	nombre_aerolinea)
	VALUES ('Interjet');

INSERT INTO public.tbl_aerolineas(
	nombre_aerolinea)
	VALUES ('Aeromexico');

INSERT INTO public.tbl_aeropuertos(
	nombre_aeropuerto)
	VALUES ('Benito Juarez');

INSERT INTO public.tbl_aeropuertos(
	nombre_aeropuerto)
	VALUES ('Guanajuato');

INSERT INTO public.tbl_aeropuertos(
	nombre_aeropuerto)
	VALUES ('La Paz');

INSERT INTO public.tbl_aeropuertos(
	nombre_aeropuerto)
	VALUES ('Oaxaca');

INSERT INTO public.tbl_movimientos(
	descripcion)
	VALUES ('Salida');

INSERT INTO public.tbl_movimientos(
	descripcion)
	VALUES ('Llegada');


INSERT INTO public.tbl_vuelos(
	dia, id_aerolinea, id_aeropuerto, id_movimiento)
	VALUES ('2021-05-02T00:18:00.000Z',1 ,1 ,1);

INSERT INTO public.tbl_vuelos(
	dia, id_aerolinea, id_aeropuerto, id_movimiento)
	VALUES ('2021-05-02T00:18:00.000Z',2 ,1 ,1);

INSERT INTO public.tbl_vuelos(
	dia, id_aerolinea, id_aeropuerto, id_movimiento)
	VALUES ('2021-05-02T00:18:00.000Z',3 ,2 ,2);

INSERT INTO public.tbl_vuelos(
	dia, id_aerolinea, id_aeropuerto, id_movimiento)
	VALUES ('2021-05-02T00:18:00.000Z',4 ,3 ,2);

INSERT INTO public.tbl_vuelos(
	dia, id_aerolinea, id_aeropuerto, id_movimiento)
	VALUES ('2021-05-02T00:18:00.000Z',1 ,3 ,2);

INSERT INTO public.tbl_vuelos(
	dia, id_aerolinea, id_aeropuerto, id_movimiento)
	VALUES ('2021-05-02T00:18:00.000Z',2 ,1 ,1);

INSERT INTO public.tbl_vuelos(
	dia, id_aerolinea, id_aeropuerto, id_movimiento)
	VALUES ('2021-05-04T00:18:00.000Z',2 ,3 ,1);

INSERT INTO public.tbl_vuelos(
	dia, id_aerolinea, id_aeropuerto, id_movimiento)
	VALUES ('2021-05-04T00:18:00.000Z',3 ,4 ,1);

INSERT INTO public.tbl_vuelos(
	dia, id_aerolinea, id_aeropuerto, id_movimiento)
	VALUES ('2021-05-04T00:18:00.000Z',3 ,4 ,1);