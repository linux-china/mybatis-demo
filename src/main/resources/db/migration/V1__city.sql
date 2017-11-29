DROP TABLE IF EXISTS city;
CREATE TABLE city (
  id         INT PRIMARY KEY AUTO_INCREMENT,
  name       VARCHAR(64),
  state      VARCHAR(32),
  country    VARCHAR(8),
  created_at DATETIME
) DEFAULT CHARSET =  utf8;
