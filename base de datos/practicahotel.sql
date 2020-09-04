CREATE DATABASE  IF NOT EXISTS `practicahotel` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `practicahotel`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: practicahotel
-- ------------------------------------------------------
-- Server version	5.5.62

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clienteshospedados`
--

DROP TABLE IF EXISTS `clienteshospedados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clienteshospedados` (
  `idClientesHospedados` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `Tel` varchar(45) NOT NULL,
  `Habitacion` varchar(45) NOT NULL,
  `Thabitacion` varchar(45) NOT NULL,
  `Freserva` varchar(45) NOT NULL,
  `Fingreso` varchar(45) NOT NULL,
  `Fsalida` varchar(45) NOT NULL,
  `Hospedaje` varchar(45) NOT NULL,
  `Deuda` varchar(45) NOT NULL,
  `estadoReserva` varchar(45) NOT NULL,
  PRIMARY KEY (`idClientesHospedados`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `habitacionesdisponibles`
--

DROP TABLE IF EXISTS `habitacionesdisponibles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `habitacionesdisponibles` (
  `idhabitacionesdisponibles` int(11) NOT NULL AUTO_INCREMENT,
  `TipoHabitaciones` varchar(45) NOT NULL,
  `Disponibilidad` varchar(45) NOT NULL,
  PRIMARY KEY (`idhabitacionesdisponibles`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `registrousuario`
--

DROP TABLE IF EXISTS `registrousuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registrousuario` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(100) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  `Correo` varchar(100) DEFAULT NULL,
  `Camas` varchar(25) DEFAULT NULL,
  `TipoCama` varchar(45) DEFAULT NULL,
  `Baños` varchar(45) DEFAULT NULL,
  `HabitacionesExtra` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tiposhabitaciones`
--

DROP TABLE IF EXISTS `tiposhabitaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tiposhabitaciones` (
  `idtiposhabitaciones` int(11) NOT NULL AUTO_INCREMENT,
  `NombreHabitacion` varchar(100) DEFAULT NULL,
  `Baños` varchar(45) DEFAULT NULL,
  `Camas` varchar(45) DEFAULT NULL,
  `CamaPrincipal` varchar(45) DEFAULT NULL,
  `HabitacionesExtra` varchar(45) DEFAULT NULL,
  `Descripción` text,
  `Foto` longblob,
  PRIMARY KEY (`idtiposhabitaciones`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-04 11:54:04
