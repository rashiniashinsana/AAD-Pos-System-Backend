DROP DATABASE IF EXISTS  pos_system;


create database IF NOT EXISTS pos_system;
SHOW DATABASES ;
use pos_system;
create table customer(
                         id VARCHAR(50) primary key,
                         name VARCHAR(50) NOT NULL ,
                         address VARCHAR(50) NOT NULL ,
                         salary DOUBLE NOT NULL
);
