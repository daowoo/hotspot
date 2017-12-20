drop table if exists t_site;

create table t_site (
  id int primary key auto_increment,
  site_name varchar(45),
  ip varchar(45),
  local_path varchar(45),
  longitude DECIMAL(10, 7),
  latitude  DECIMAL(10, 7)
);

insert into t_site (site_name, ip, local_path, latitude, longitude) values ('王二淀', '123.78.21.211', 'local/path', '39.160', '116.900');
insert into t_site (site_name, ip, local_path, latitude, longitude) values ('黄花店', '123.78.21.211', 'local/path', '39.370', '116.906');

DROP TABLE IF EXISTS t_phone;
CREATE TABLE t_phone (
  id int PRIMARY KEY AUTO_INCREMENT,
  phone_number LONG,
  site_name VARCHAR(45),
  time DATETIME
);

INSERT INTO t_phone(phone_number, site_name, time) VALUES ( '13429827456', '王二淀', '2016-01-02 00:00:00.00');
INSERT INTO t_phone(phone_number, site_name, time) VALUES ( '13429527456', '王二淀', '2016-01-03 00:00:00.00');
INSERT INTO t_phone(phone_number, site_name, time) VALUES ( '13529827456', '王二淀', '2016-01-04 00:00:00.00');
INSERT INTO t_phone(phone_number, site_name, time) VALUES ( '13629827456', '王二淀', '2016-01-05 00:00:00.00');
INSERT INTO t_phone(phone_number, site_name, time) VALUES ( '13729827456', '王二淀', '2016-01-06 00:00:00.00');


DROP TABLE IF EXISTS t_car;
CREATE TABLE t_car (
  id int PRIMARY KEY AUTO_INCREMENT,
  plate_number VARCHAR(45),
  time DATETIME,
  site_name VARCHAR(45)
);

INSERT INTO t_car(plate_number, time, site_name) VALUE ('鄂A88Z0Y', '2016-01-04 00:00:00.00','王二淀');
INSERT INTO t_car(plate_number, time, site_name) VALUE ('鄂A88936', '2016-01-03 00:00:00.00','王二淀');
INSERT INTO t_car(plate_number, time, site_name) VALUE ('鄂A88867', '2016-01-05 00:00:00.00','黄花店');

DROP TABLE IF EXISTS t_car2phone;
CREATE TABLE t_car2phone (
  id int PRIMARY KEY AUTO_INCREMENT,
  plate_number VARCHAR(45),
  phone_number LONG,
  probability FLOAT
);

INSERT INTO t_car2phone(plate_number, phone_number, probability) VALUE ('鄂A88936', '13528766265', '0.9');
INSERT INTO t_car2phone(plate_number, phone_number, probability) VALUE ('鄂A88936', '13528766269', '0.1');
INSERT INTO t_car2phone(plate_number, phone_number, probability) VALUE ('鄂A88Z0Y', '13528766264', '0.8');
INSERT INTO t_car2phone(plate_number, phone_number, probability) VALUE ('鄂A88Z0Y', '13528766234', '0.2');
INSERT INTO t_car2phone(plate_number, phone_number, probability) VALUE ('鄂A88867', '13528766263', '0.5');
INSERT INTO t_car2phone(plate_number, phone_number, probability) VALUE ('鄂A88867', '13528766345', '0.5');



