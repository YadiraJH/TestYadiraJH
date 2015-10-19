# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table student (
  id                        integer auto_increment not null,
  name                      varchar(255),
  lastname                  varchar(255),
  semester                  integer,
  constraint pk_student primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table student;

SET FOREIGN_KEY_CHECKS=1;

