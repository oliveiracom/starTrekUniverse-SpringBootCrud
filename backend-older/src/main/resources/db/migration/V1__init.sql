CREATE TABLE people (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  peopleName varchar(100) NOT NULL,
  peopleHome varchar(50) NOT NULL,
  peoplePositionId int(1) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;