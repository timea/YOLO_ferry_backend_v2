# ************************************************************
# Sequel Pro SQL dump
# Version 4499
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.5.38)
# Database: ferry
# Generation Time: 2016-01-09 10:49:42 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table Customers
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Customers`;

CREATE TABLE `Customers` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL DEFAULT '',
  `last_name` varchar(50) NOT NULL DEFAULT '',
  `type` enum('hasAccount','resident','anonym') DEFAULT 'anonym',
  `street` varchar(80) DEFAULT NULL,
  `zip` varchar(20) DEFAULT NULL,
  `floor` varchar(11) DEFAULT NULL,
  `door` varchar(11) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  `amount_of_free_rides` int(11) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `Customers` WRITE;
/*!40000 ALTER TABLE `Customers` DISABLE KEYS */;

INSERT INTO `Customers` (`customer_id`, `first_name`, `last_name`, `type`, `street`, `zip`, `floor`, `door`, `country`, `amount_of_free_rides`, `username`, `password`)
VALUES
	(1,'Timea','Kiss','anonym',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
	(2,'Kasper','Tidemann','anonym',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
	(3,'dan','iel','anonym',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
	(4,'Dani','Sin','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
	(5,'Danielo','V','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
	(6,'Dain','V','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
	(7,'D','V','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
	(8,'Dani','Hello',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
	(9,'D','Vino',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*!40000 ALTER TABLE `Customers` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table Discounts
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Discounts`;

CREATE TABLE `Discounts` (
  `discount_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '',
  `percent` int(3) DEFAULT NULL,
  PRIMARY KEY (`discount_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table Ferries
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Ferries`;

CREATE TABLE `Ferries` (
  `ferry_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '',
  `max_people` int(11) NOT NULL,
  `max_car` int(11) NOT NULL,
  `max_lorry` int(11) NOT NULL,
  `max_machinery` int(11) NOT NULL,
  `movable_deck` tinyint(1) NOT NULL,
  `out_of_service` tinyint(1) DEFAULT NULL,
  `note` varchar(200) DEFAULT NULL,
  `owner` int(11) DEFAULT NULL,
  PRIMARY KEY (`ferry_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table Harbors
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Harbors`;

CREATE TABLE `Harbors` (
  `harbor_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`harbor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `Harbors` WRITE;
/*!40000 ALTER TABLE `Harbors` DISABLE KEYS */;

INSERT INTO `Harbors` (`harbor_id`, `name`)
VALUES
	(1,'København'),
	(2,'Oslo'),
	(3,'Fyn');

/*!40000 ALTER TABLE `Harbors` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table Order_vehicles
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Order_vehicles`;

CREATE TABLE `Order_vehicles` (
  `order_vehicles_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `order_id` int(11) DEFAULT NULL,
  `vehicle_type_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_vehicles_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table Orders
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Orders`;

CREATE TABLE `Orders` (
  `order_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) DEFAULT NULL,
  `route_id` int(11) DEFAULT NULL,
  `departure_date_time` datetime DEFAULT NULL,
  `arrival_date_time` datetime DEFAULT NULL,
  `nr_of_oassengers` int(11) DEFAULT NULL,
  `order_vehicles_id` int(11) DEFAULT NULL,
  `discount_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table Owners
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Owners`;

CREATE TABLE `Owners` (
  `owner_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` int(11) DEFAULT NULL,
  PRIMARY KEY (`owner_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table Restrictions
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Restrictions`;

CREATE TABLE `Restrictions` (
  `restriction_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`restriction_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table Routes
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Routes`;

CREATE TABLE `Routes` (
  `route_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `departure_harbor_id` int(11) DEFAULT NULL,
  `arrival_harbor_id` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `ferry_id` int(11) DEFAULT NULL,
  `restriction_id` int(11) DEFAULT NULL,
  `schedule_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`route_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table Schedules
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Schedules`;

CREATE TABLE `Schedules` (
  `schedule_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `departure_time` datetime NOT NULL,
  `arrival_time` datetime NOT NULL,
  PRIMARY KEY (`schedule_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table SEQUENCE
# ------------------------------------------------------------

DROP TABLE IF EXISTS `SEQUENCE`;

CREATE TABLE `SEQUENCE` (
  `SEQ_NAME` varchar(50) NOT NULL,
  `SEQ_COUNT` decimal(38,0) DEFAULT NULL,
  PRIMARY KEY (`SEQ_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `SEQUENCE` WRITE;
/*!40000 ALTER TABLE `SEQUENCE` DISABLE KEYS */;

INSERT INTO `SEQUENCE` (`SEQ_NAME`, `SEQ_COUNT`)
VALUES
	('SEQ_GEN',50);

/*!40000 ALTER TABLE `SEQUENCE` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table Vehicle_types
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Vehicle_types`;

CREATE TABLE `Vehicle_types` (
  `vehicle_type_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '',
  `size` int(11) NOT NULL,
  PRIMARY KEY (`vehicle_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `Vehicle_types` WRITE;
/*!40000 ALTER TABLE `Vehicle_types` DISABLE KEYS */;

INSERT INTO `Vehicle_types` (`vehicle_type_id`, `name`, `size`)
VALUES
	(1,'car',1),
	(2,'lorry',2),
	(3,'machinery',4);

/*!40000 ALTER TABLE `Vehicle_types` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
