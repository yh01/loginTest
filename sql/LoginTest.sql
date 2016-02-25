create database if not exists loginTest;
use loginTest;

drop table if exists user;
create table user(
	user_id int not null primary key auto_increment,
	user_name varchar(255),
	pass varchar(255) unique key ,
	credit_number varchar(4),
	address varchar(255)
);

insert into user(user_name,pass,credit_number,address)values("test","test","1234","東京都東京市東京区東京町1-1-1");
insert into user(user_name,pass,credit_number,address)values("test2","test2","5678","東京都東京市東京区東京町2-2-2");