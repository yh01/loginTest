create database if not exists loginTest;
use loginTest;

drop table if exists user;
create table user(
	user_name varchar(255), pass varchar(255)
);

insert into user(user_name,pass)values("test","test");