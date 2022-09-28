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
SELECT idArm, nomeArm, tipoArm, calibreArm, FuncArm, numArm FROM tbArmas order by nomeArm ASC;
select * from tbUsuario where nomeUsu Like "%J%";

alter table tbUsuario
add cepUsu varchar (11) after nomeUsu;

alter table tbUsuario
add logUsu varchar (255) after cepUsu,
add bairroUsu varchar (255) after logUsu,
add cidadeUsu varchar (255) after bairroUsu,
add estadoUsu varchar (255) after cidadeUsu;

alter table tbUsuario
add numUsu int (4) after logUsu;

use bdAulaPOO2;

insert into tbUsuario (nomeUsu,cepUsu,logUsu,numUsu,bairroUsu,cidadeUsu,estadoUsu,emailUsu,telUsu,sexoUsu,senhaUsu)
values ("Teste","123456","João Rodrigues",123,"Centro","Sapucaia do Sul","RS","t@gmail.com","51986126462",1,"123");

select * from tbUsuario;

describe tbUsuario;
SELECT * FROM tbUsuario order by nomeUsu ASC;

describe tbArmas;

alter table tbArmas 
modify column precoArm varchar(255); 

SELECT idarm, calibrearm, precoarm, numarm FROM tbarmas;