create database if not exists EditTest;
use EditTest;

drop table if exists user;
create table user(
	user_id int not null primary key auto_increment,
	user_name varchar(255),
	pass varchar(255) unique key
);


drop table if exists temp;
create table temp(
	user_id int not null primary key auto_increment,
	user_name varchar(255),
	pass varchar(255) unique key
);