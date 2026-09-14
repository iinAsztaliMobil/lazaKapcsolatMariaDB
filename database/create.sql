grant all privileges on bama.* to bama@localhost identified by 'titok';

create table employees(
    id integer not null primary key,
    name varchar(30),
    city varchar(30),
    salary integer
);