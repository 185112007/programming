create table tip(
	id serial not null primary key,
	kategory_isim varchar(100) not null
)

create table arabalar(
	id serial not null primary key,
	isim varchar(100) not null,
	kat_id int not null,
	fiyat decimal(10,2),
	foreign key (kat_id) references tip(id)
)

insert into tip (kategory_isim) 
values ('suv'), ('crossover'),('sudan'),('hatchback');

select * from tip;

insert into arabalar (isim , kat_id , fiyat )
values ('araba1', 1, 100),
	   ('araba2', 1, 200),
	   ('araba3', 1, 300),
	   ('araba4', 2, 400),
	   ('araba5', 2, 500),
	   ('araba6', 2, 600),
	   ('araba7', 3, 700),
	   ('araba8', 3, 800),
	   ('araba9', 4, 900),
	   ('araba10', 4, 1000),
	   ('araba11', 4, 1100);
	   
select * from arabalar a ;

insert into arabalar (isim , kat_id , fiyat )
values ('araba1', 1, 1000),
	   ('araba2', 1, 2000),
	   ('araba3', 1, 3000),
	   ('araba4', 2, 4000),
	   ('araba5', 2, 5000),
	   ('araba6', 2, 6000),
	   ('araba7', 3, 7000),
	   ('araba8', 3, 8000),
	   ('araba9', 4, 9000),
	   ('araba10', 4, 10000),
	   ('araba11', 4, 11000);
	   
select * from arabalar a ;

select * from tip t ;
select * from arabalar a ;
select isim,fiyat from arabalar a ;

select isim, fiyat from arabalar a order by fiyat;

select isim, fiyat from arabalar a order by fiyat desc;

select isim, fiyat from arabalar a where fiyat =1000;

select isim, fiyat from arabalar a where fiyat !=1000; -- <>

select isim, fiyat from arabalar a where fiyat > 1000;

select isim, fiyat from arabalar a where fiyat in (100, 1000, 2000);

select isim, fiyat from arabalar a where fiyat not in (100, 1000, 2000);

select isim,fiyat from arabalar a where fiyat between 100 and 1000;

select isim, fiyat from arabalar a where fiyat not between 100 and 1000;

select isim,fiyat from arabalar a  where isim like '%5';

select isim from arabalar a where isim like '%5';

select distinct isim from arabalar a where isim like '%5';

select distinct isim from arabalar a order by isim ;

select isim from arabalar a where isim like 'araba1_';

select distinct isim from arabalar a where isim like 'araba1_';

select * from arabalar a ;

select * from arabalar a limit 5;

select * from arabalar a limit 5 offset 3;

