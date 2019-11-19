create database bh18db;
use bh18db;
-- comment
create table employees(
	id int auto_increment primary key,
    name varchar(50) unique not null,
    age int default 20 check(age > 0),
    sex boolean,
    birthday date default '2019-02-15',
    speciality varchar(56)
    
);

-- drop table employees;
-- truncate table employees;
-- delete from employees;

insert into employees (id, name, age, sex, birthday, speciality)
	value (5, 'Vasily', 19, true, '2000-01-11', 'Stolyar');
insert into employees (id, name, age, sex, birthday, speciality)
	values (4, 'Mihail', 29, true, '1990-11-05', 'Stolyar')
		,(null, 'Olga', 49, false, '1970-06-25', 'Buhgalter');
insert into employees value(null, 'Igor', 5, true, null, null);
insert into employees (name,age,sex)value('Ivan',24,'1');

select * from employees;

select id, name, speciality from employees;
select id as 'nomer', name as 'imya', speciality from employees;
select * from employees where id > 7;
select * from employees where birthday > '2000-01-01' && speciality = 'Stolyar';

select id, name, bithday from employees e;

update employees set sex=false where name='Vasily';

delete from employees where age <= 20;

