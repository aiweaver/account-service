-- accounts
DROP TABLE IF EXISTS `accounts`;
CREATE TABLE `accounts` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) ,
  PRIMARY KEY (`username`)
);

-- profiles
DROP TABLE IF EXISTS `profiles`;
CREATE TABLE `profiles` (
  `id` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `name` varchar(255) ,
  PRIMARY KEY (`id`,`username`)
);
