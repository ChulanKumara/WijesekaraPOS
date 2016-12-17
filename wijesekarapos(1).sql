-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 13, 2016 at 06:31 PM
-- Server version: 5.6.17-log
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `wijesekarapos`
--

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE IF NOT EXISTS `customers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `contact` varchar(50) NOT NULL,
  `address` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`id`, `name`, `contact`, `address`, `email`) VALUES
(1, 'W.M.P. Gunasinghe', '0712456476', '1A Igurukade, Colombo', 'gunasinghe@yahoo.com'),
(2, 'D.S.A.Ruwan', '0112456845', '33, Pamunuwila Road Kelaniya', 'ruwan@gmail.com'),
(3, 'Darshana', '0778234294', '25/A Kurunagala', 'darshana@live.com');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE IF NOT EXISTS `products` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `barcode` varchar(15) NOT NULL,
  `itemnum` varchar(15) NOT NULL,
  `descr` varchar(255) NOT NULL,
  `price` float NOT NULL,
  `discount` int(2) NOT NULL,
  `supplier_id` int(11) NOT NULL,
  `available_items` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `barcode` (`barcode`),
  UNIQUE KEY `itemnum` (`itemnum`),
  UNIQUE KEY `barcode_2` (`barcode`),
  KEY `products_ibfk_1` (`supplier_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `barcode`, `itemnum`, `descr`, `price`, `discount`, `supplier_id`, `available_items`) VALUES
(2, '764983582', 'COKE123', 'Cocacola buddy', 35, 0, 1, 3),
(4, '40059000', '82241', 'Nivea Men Invisible', 850, 10, 2, 1),
(5, '80789017', 'CP145752', 'Tissue Papers', 100, 5, 3, 2),
(6, '4792210100569', 'ATLASFL027', 'Atlas 200Pg Single Rule', 85, 0, 1, 48),
(7, '76498546125', 'CRMC342', 'Cream Cracker', 100, 0, 1, 8);

-- --------------------------------------------------------

--
-- Table structure for table `salesman`
--

CREATE TABLE IF NOT EXISTS `salesman` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `display_name` varchar(50) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `display_name` (`display_name`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `salesman`
--

INSERT INTO `salesman` (`id`, `display_name`) VALUES
(2, 'Gayani'),
(3, 'Madshika'),
(4, 'Sahan'),
(1, 'Supun');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE IF NOT EXISTS `supplier` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `contact` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id`, `name`, `contact`, `address`, `email`) VALUES
(1, 'JK Suppliers', '071-1212121', 'Depanama Pannipitiya', ''),
(2, 'Zenio', '0772124552', 'no 20 High level road nugegoda', 'zenio@gmail.com'),
(3, 'DJI Products', '0112574564', 'No.12/A Dalugama Road Kelaniya', 'djiinfo@djiproducts.com');

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE IF NOT EXISTS `transactions` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) NOT NULL,
  `pid` int(11) DEFAULT NULL,
  `price` float NOT NULL,
  `discount` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `total` float NOT NULL,
  `smid` int(11) DEFAULT NULL,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`tid`),
  KEY `pid` (`pid`),
  KEY `sid` (`smid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=34 ;

--
-- Dumping data for table `transactions`
--

INSERT INTO `transactions` (`tid`, `order_id`, `pid`, `price`, `discount`, `quantity`, `total`, `smid`, `time`) VALUES
(1, 0, 2, 0, 0, 0, 0, 2, '2016-11-15 12:13:04'),
(5, 1, 4, 850, 10, 1, 765, 2, '2016-11-17 11:08:52'),
(6, 2, 4, 850, 10, 1, 765, 2, '2016-11-17 11:09:55'),
(7, 3, 4, 850, 10, 1, 765, 2, '2016-11-17 11:12:28'),
(8, 3, 2, 35, 0, 3, 105, 2, '2016-11-17 11:12:28'),
(9, 3, 5, 100, 5, 10, 950, 2, '2016-11-17 11:12:28'),
(10, 4, 4, 850, 10, 1, 765, 2, '2016-11-17 12:41:17'),
(11, 5, 4, 850, 10, 1, 765, 2, '2016-11-17 12:41:20'),
(12, 6, 4, 850, 10, 1, 765, 2, '2016-11-17 12:41:21'),
(13, 7, 4, 850, 10, 1, 765, 1, '2016-12-12 11:03:01'),
(14, 8, 5, 100, 5, 1, 95, 2, '2016-12-12 17:36:35'),
(15, 9, 5, 100, 5, 1, 95, 2, '2016-12-12 17:39:12'),
(16, 10, 5, 100, 5, 1, 95, 2, '2016-12-13 06:26:55'),
(17, 11, 5, 100, 5, 1, 95, 2, '2016-12-13 06:50:14'),
(18, 12, 5, 100, 5, 1, 95, 2, '2016-12-13 06:55:46'),
(19, 13, 5, 100, 5, 1, 95, 2, '2016-12-13 06:59:22'),
(20, 14, 5, 100, 5, 1, 95, 2, '2016-12-13 07:12:00'),
(21, 15, 5, 100, 5, 1, 95, 2, '2016-12-13 07:31:40'),
(22, 16, 5, 100, 5, 1, 95, 2, '2016-12-13 07:40:36'),
(23, 17, 5, 100, 5, 1, 95, 2, '2016-12-13 07:45:54'),
(24, 18, 2, 35, 0, 9, 315, 2, '2016-12-13 08:01:31'),
(25, 19, 2, 35, 0, 1, 35, 2, '2016-12-13 08:08:07'),
(26, 20, 7, 100, 0, 1, 100, 2, '2016-12-13 10:04:17'),
(27, 20, 6, 85, 0, 1, 85, 2, '2016-12-13 10:04:17'),
(28, 20, 4, 850, 10, 1, 765, 2, '2016-12-13 10:04:18'),
(29, 21, 7, 100, 0, 1, 100, 2, '2016-12-13 11:58:05'),
(30, 21, 6, 85, 0, 1, 85, 2, '2016-12-13 11:58:05'),
(31, 21, 5, 100, 5, 1, 95, 2, '2016-12-13 11:58:05'),
(32, 21, 2, 35, 0, 1, 35, 2, '2016-12-13 11:58:05'),
(33, 21, 4, 850, 10, 1, 765, 2, '2016-12-13 11:58:05');

-- --------------------------------------------------------

--
-- Table structure for table `wpos_users`
--

CREATE TABLE IF NOT EXISTS `wpos_users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `password` varchar(255) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `regdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `wpos_users`
--

INSERT INTO `wpos_users` (`id`, `username`, `password`, `regdate`) VALUES
(1, 'admin', '5f4dcc3b5aa765d61d8327deb882cf99', '2016-11-06 05:57:32'),
(2, 'salesman', 'e2fc714c4727ee9395f324cd2e7f331f', '2016-11-06 06:16:23');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `products`
--
ALTER TABLE `products`
  ADD CONSTRAINT `products_ibfk_1` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `transactions`
--
ALTER TABLE `transactions`
  ADD CONSTRAINT `transactions_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `products` (`id`),
  ADD CONSTRAINT `transactions_ibfk_2` FOREIGN KEY (`smid`) REFERENCES `salesman` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
