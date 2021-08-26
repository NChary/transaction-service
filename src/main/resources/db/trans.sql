-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.17 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for transaction
CREATE DATABASE IF NOT EXISTS `transaction` /*!40100 DEFAULT CHARACTER SET armscii8 COLLATE armscii8_bin */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `transaction`;

-- Dumping structure for table transaction.transaction_details
CREATE TABLE IF NOT EXISTS `transaction_details` (
  `tid` int(11) DEFAULT NULL,
  `account_no` int(11) DEFAULT NULL,
  `trn_type` varchar(50) COLLATE armscii8_bin DEFAULT NULL,
  `actual_balance` decimal(20,6) DEFAULT NULL,
  `cred_amount` decimal(20,6) DEFAULT NULL,
  `debt_amount` decimal(20,6) DEFAULT NULL,
  `balance` decimal(20,6) DEFAULT NULL,
  KEY `tid` (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Dumping data for table transaction.transaction_details: ~1 rows (approximately)
/*!40000 ALTER TABLE `transaction_details` DISABLE KEYS */;
INSERT INTO `transaction_details` (`tid`, `account_no`, `trn_type`, `actual_balance`, `cred_amount`, `debt_amount`, `balance`) VALUES
	(1, 54644, 'DT', 3223.360000, 325.360000, 63.360000, 3263.360000);
/*!40000 ALTER TABLE `transaction_details` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
