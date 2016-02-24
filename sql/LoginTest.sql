create database if not exists loginTest;
use loginTest;

drop table if exists user;
create table user(
	user_id int not null primary key auto_increment,
	user_name varchar(255),
	pass varchar(255)
);

insert into user(user_id,user_name,pass)values(1,"test","test");
insert into user(user_id,user_name,pass)values(2,"test2","test2");