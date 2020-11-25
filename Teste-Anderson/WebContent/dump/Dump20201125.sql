CREATE DATABASE  IF NOT EXISTS `testecitel` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `testecitel`;
-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: testecitel
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dados`
--

DROP TABLE IF EXISTS `dados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dados` (
  `iddados` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `rg` varchar(45) DEFAULT NULL,
  `data_nasc` varchar(45) DEFAULT NULL,
  `sexo` varchar(45) DEFAULT NULL,
  `mae` varchar(200) DEFAULT NULL,
  `pai` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `cep` varchar(45) DEFAULT NULL,
  `endereco` varchar(200) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `estado` varchar(100) DEFAULT NULL,
  `telefone_fixo` varchar(45) DEFAULT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `altura` float(11,2) DEFAULT NULL,
  `peso` float(11,2) DEFAULT NULL,
  `tipo_sanguineo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`iddados`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dados`
--

LOCK TABLES `dados` WRITE;
/*!40000 ALTER TABLE `dados` DISABLE KEYS */;
/*!40000 ALTER TABLE `dados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado`
--

DROP TABLE IF EXISTS `estado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estado` (
  `idestado` int(11) NOT NULL AUTO_INCREMENT,
  `ac` int(11) DEFAULT NULL,
  `al` int(11) DEFAULT NULL,
  `ap` int(11) DEFAULT NULL,
  `am` int(11) DEFAULT NULL,
  `ba` int(11) DEFAULT NULL,
  `ce` int(11) DEFAULT NULL,
  `es` int(11) DEFAULT NULL,
  `go` int(11) DEFAULT NULL,
  `ma` int(11) DEFAULT NULL,
  `mt` int(11) DEFAULT NULL,
  `ms` int(11) DEFAULT NULL,
  `mg` int(11) DEFAULT NULL,
  `pa` int(11) DEFAULT NULL,
  `pb` int(11) DEFAULT NULL,
  `pr` int(11) DEFAULT NULL,
  `pe` int(11) DEFAULT NULL,
  `pi` int(11) DEFAULT NULL,
  `rj` int(11) DEFAULT NULL,
  `rn` int(11) DEFAULT NULL,
  `rs` int(11) DEFAULT NULL,
  `ro` int(11) DEFAULT NULL,
  `rr` int(11) DEFAULT NULL,
  `sc` int(11) DEFAULT NULL,
  `sp` int(11) DEFAULT NULL,
  `se` int(11) DEFAULT NULL,
  `df` int(11) DEFAULT NULL,
  `too` int(11) DEFAULT NULL,
  PRIMARY KEY (`idestado`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado`
--

LOCK TABLES `estado` WRITE;
/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
INSERT INTO `estado` VALUES (4,1,2,0,1,1,0,0,0,1,0,0,2,1,0,0,3,0,20,1,0,2,4,3,0,6,119,1),(5,1,2,0,1,1,0,0,0,1,0,0,2,1,0,0,3,0,20,1,0,2,4,3,0,6,119,1),(6,1,2,0,1,1,0,0,0,1,0,0,2,1,0,0,3,0,20,1,0,2,4,3,0,6,119,1),(7,1,2,0,1,1,0,0,0,1,0,0,2,1,0,0,3,0,20,1,0,2,4,3,0,6,119,1),(8,1,2,0,1,1,0,0,0,1,0,0,2,1,0,0,3,0,20,1,0,2,4,3,0,6,119,1),(9,1,2,0,1,1,0,0,0,1,0,0,2,1,0,0,3,0,20,1,0,2,4,3,0,6,119,1);
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resultado`
--

DROP TABLE IF EXISTS `resultado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `resultado` (
  `idresultado` int(11) NOT NULL AUTO_INCREMENT,
  `mediaimc10` float(11,2) DEFAULT NULL,
  `mediaimc20` float(11,2) DEFAULT NULL,
  `mediaimc30` float(11,2) DEFAULT NULL,
  `mediaimcmais` float(11,2) DEFAULT NULL,
  `idadeamais` int(11) DEFAULT NULL,
  `idadeamenos` int(11) DEFAULT NULL,
  `idadebmais` int(11) DEFAULT NULL,
  `idadebmenos` int(11) DEFAULT NULL,
  `idadeabmais` int(11) DEFAULT NULL,
  `idadeabmenos` int(11) DEFAULT NULL,
  `idadeomais` int(11) DEFAULT NULL,
  `idadeomenos` int(11) DEFAULT NULL,
  `ndoadoramais` int(11) DEFAULT NULL,
  `ndoadoramenos` int(11) DEFAULT NULL,
  `ndoadorbmais` int(11) DEFAULT NULL,
  `ndoadorbmenos` int(11) DEFAULT NULL,
  `ndoadorabmais` int(11) DEFAULT NULL,
  `ndoadorabmenos` int(11) DEFAULT NULL,
  `ndoadoromais` int(11) DEFAULT NULL,
  `ndoadoromenos` int(11) DEFAULT NULL,
  `estado_idestado` int(11) NOT NULL,
  PRIMARY KEY (`idresultado`),
  KEY `fk_resultado_estado1_idx` (`estado_idestado`),
  CONSTRAINT `fk_resultado_estado1` FOREIGN KEY (`estado_idestado`) REFERENCES `estado` (`idestado`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resultado`
--

LOCK TABLES `resultado` WRITE;
/*!40000 ALTER TABLE `resultado` DISABLE KEYS */;
INSERT INTO `resultado` VALUES (6,16.67,38.15,19.70,18.44,37,27,24,35,57,36,44,32,5,5,2,113,4,4,21,4,4),(7,16.67,38.15,19.70,18.44,37,27,24,35,57,36,44,32,5,5,2,113,4,4,21,4,5),(8,16.67,38.15,19.70,18.44,37,27,24,35,57,36,44,32,5,5,2,113,4,4,21,4,6),(9,16.67,38.15,19.70,18.44,37,27,24,35,57,36,44,32,5,5,2,113,4,4,21,4,7),(10,16.67,38.15,19.70,18.44,37,27,24,35,57,36,44,32,5,5,2,113,4,4,21,4,8),(11,16.67,38.15,19.70,18.44,37,27,24,35,57,36,44,32,5,5,2,113,4,4,21,4,9);
/*!40000 ALTER TABLE `resultado` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-25 10:46:25
