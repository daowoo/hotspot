drop table if exists t_station;

create table t_station (
  id int primary key auto_increment,
  name varchar(45),
  district varchar(45),
  city varchar(45),
  longitude DECIMAL(10, 7),
  latitude  DECIMAL(10, 7)
);

insert into t_station (name, district, city, latitude, longitude) values ('王二淀', '武清区', '天津', '39.160', '116.900');
insert into t_station (name, district, city, latitude, longitude) values ('黄花店', '武清区', '天津', '39.370', '116.906');

DROP TABLE IF EXISTS t_hotspot;
CREATE TABLE t_hotspot (
  id int PRIMARY KEY AUTO_INCREMENT,
  IMSI LONG,
  location VARCHAR(45),
  module_name VARCHAR(45),
  referred_number int,
  city VARCHAR(45),
  communication_type VARCHAR(45),
  collect_time DATETIME
);

INSERT INTO t_hotspot(IMSI,location,module_name,referred_number,city,communication_type,collect_time) VALUES ( '460027022534052', '王二淀', 'wangerdian-TDD','1870225','天津','中国移动TD-LTE', '2016-01-02 00:00:00.00');
INSERT INTO t_hotspot(IMSI,location,module_name,referred_number,city,communication_type,collect_time) VALUES ( '460027022534052', '王二淀', 'wangerdian-TDD','1870225','天津','中国移动TD-LTE', '2016-01-03 00:00:00.00');
INSERT INTO t_hotspot(IMSI,location,module_name,referred_number,city,communication_type,collect_time) VALUES ( '460027022534052', '王二淀', 'wangerdian-TDD','1870225','天津','中国移动TD-LTE', '2016-01-04 00:00:00.00');
INSERT INTO t_hotspot(IMSI,location,module_name,referred_number,city,communication_type,collect_time) VALUES ( '460027022534052', '王二淀', 'wangerdian-TDD','1870225','天津','中国移动TD-LTE', '2016-01-05 00:00:00.00');
INSERT INTO t_hotspot(IMSI,location,module_name,referred_number,city,communication_type,collect_time) VALUES ( '460027022534052', '王二淀', 'wangerdian-TDD','1870225','天津','中国移动TD-LTE', '2016-01-06 00:00:00.00');