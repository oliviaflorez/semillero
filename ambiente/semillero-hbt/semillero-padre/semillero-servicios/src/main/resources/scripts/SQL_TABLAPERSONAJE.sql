create table personaje(
  pers_id number(10) not null,
  pers_nombre varchar2(50) not null,
  pers_id_comic number(3) not null,
  pers_estado varchar2(50 char) not null,
  pers_superpoder varchar2(200 char)not null,
  constraint "personaje_estado_CHK" check(pers_estado IN ('ACTIVO', 'INACTIVO')),
  constraint "PK_personaje" PRIMARY KEY(pers_id)
);

create sequence "SEC_PERSONAJE" minvalue 1 start with 1 increment by 2;

alter table personaje
add constraint "FK_PERSONAJE_ID"
foreign key(pers_id_comic)
references comic(SCID);

select * from personaje;

insert into personaje(pers_id, pers_nombre, pers_id_comic, pers_estado,pers_superpoder)
values(sec_personaje.nextval,'BATMAN',4,'ACTIVO', 'MILLONARIO');
