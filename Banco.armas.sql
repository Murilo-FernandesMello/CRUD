create database bdAulaPOO2;
Use bdAulaPOO2;

create table tbUsuario(
idUsu int(11) primary key auto_increment,
nomeUsu varchar(80) not null,
emailUsu varchar (200) not null,
telUsu varchar (15),
sexoUsu int default(3), 
senhaUsu varchar (60) not null);

describe tbUsuario;

insert into tbUsuario (nomeUsu,emailUsu,telUsu,sexoUsu,senhaUsu)
values ("ADM","admin", "(51) 99223-3445","1","admin");

select * 
from tbUsuario;

delete from tbUsuario
where idUsu =1;

truncate tbUsuario;

insert into tbUsuario (nomeUsu,emailUsu,telUsu,sexoUsu,senhaUsu)
values ("teste","b", "(51) 99222-3445","2","123");

insert into tbUsuario (nomeUsu,emailUsu,telUsu,sexoUsu,senhaUsu)
values ("Júlia","julia@gmail","(51) 99223-5689","3","123");

select * from tbUsuario;

use bdAulaPOO2;

select * from tbUsuario;

create table tbArmas(
idArm int(11) not null primary key auto_increment,
nomeArm varchar (255) not null,
tipoArm varchar (255) not null,
calibreArm varchar (255) not null,
FuncArm varchar (255) not null,
precoArm double not null,
numArm int not null);

alter table tbArmas change numArm numArm varchar(12);

insert into tbArmas(nomeArm,tipoArm,calibreArm,FuncArm,precoArm,numArm)
values("M4A1","Fuzil","566mm","Automático","10000","BA8965410M");

select * from tbArmas;
use Banco.armas;
select * from tbArmas;