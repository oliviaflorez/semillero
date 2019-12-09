--Creacion de tabla que contendra rol del personaje
create table rolpersonaje(
  rol_id number(10) not null,
  rol_nombre varchar2(50) not null,
  rol_estado varchar2(50 char) not null,
  constraint UQ_nombreRestriccion unique(rol_nombre), --se crea restriccion en campo nombre para que no se repita
  constraint PK_rolpersonaje PRIMARY KEY(rol_id) --se crea campo rol_id como llave primaria de la tabla rolpersonaje
);

-- adiciono a la table personaje una restriccion en el campo nombre para que este no se repita
alter table personaje
add constraint UQ_persnombreRestriccion 
unique(pers_nombre);

commit;