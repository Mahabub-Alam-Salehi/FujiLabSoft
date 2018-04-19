-- phpMyAdmin SQL Dump
-- version 3.1.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 23, 2015 at 10:20 AM
-- Server version: 5.1.30
-- PHP Version: 5.2.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: 'fujilab'
--

-- --------------------------------------------------------

--
-- Table structure for table 'branch_info'
--

DROP TABLE IF EXISTS branch_info;
CREATE TABLE branch_info (
  branch_code int(20) NOT NULL AUTO_INCREMENT,
  branch_name text NOT NULL,
  address text NOT NULL,
  phone int(20) NOT NULL,
  fax int(20) NOT NULL,
  email varchar(25) NOT NULL,
  division text NOT NULL,
  district text NOT NULL,
  PRIMARY KEY (branch_code)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8;

--
-- Dumping data for table 'branch_info'
--

INSERT INTO branch_info (branch_code, branch_name, address, phone, fax, email, division, district) VALUES
(101, 'fafa', 'afa', 214, 21, 'aaaa', 'afafa', 'afaa'),
(102, 'fafaa', 'faafa', 125, 1212, 'aaa', 'aafaaaaaa', 'aaaaaaaaaa'),
(125, 'afafaa', 'afafa', 1235, 2154, 'fafafa', 'afaa', 'afafaaf'),
(103, 'fafA', 'AFAA', 125, 6542, 'AFA', 'FAFA', 'FAFAFA'),
(104, 'fafafa', 'fafaa', 121, 215, 'bafafha', 'faff', 'afafAFA'),
(105, 'afafafa', 'fafafa', 111, 1212, 'fafafa', 'ffaaa', 'fafaafaa'),
(501, 'gsgag', 'gsgsg', 1021, 111, 'gsgsg', 'gsg', 'gsgsg'),
(306, 'Elephent road', 'elephent road', 1927014298, 12154, 'aadfafaf', 'dhaka', 'dhaka');

-- --------------------------------------------------------

--
-- Table structure for table 'company_info'
--

DROP TABLE IF EXISTS company_info;
CREATE TABLE company_info (
  company_id int(25) NOT NULL AUTO_INCREMENT,
  company_name text NOT NULL,
  short_name text NOT NULL,
  address text NOT NULL,
  phone varchar(20) NOT NULL,
  fax varchar(20) NOT NULL,
  email_address text NOT NULL,
  url text NOT NULL,
  PRIMARY KEY (company_id)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1;

--
-- Dumping data for table 'company_info'
--

INSERT INTO company_info (company_id, company_name, short_name, address, phone, fax, email_address, url) VALUES
(1, 'z soft solution', 'zss', 'malibag', 'www.zsoft.net', '01215', '02154', 'abc@gmail.clom'),
(103, 'Fuji Lab', 'F', 'afaf', 'aaaaaaaaaaaaaa', '0124', '1254', 'afafafaf'),
(120, 'fafafa', 'fafa', 'fafafafa', 'fafafaaf', '125', '1245', 'fasfafa'),
(144, 'fafaf', 'fafa', 'ggasagag', 'hghhgh', '0122', '1022', 'gsgsghsdgh');

-- --------------------------------------------------------

--
-- Table structure for table 'current_stock'
--

DROP TABLE IF EXISTS current_stock;
CREATE TABLE current_stock (
  product_code int(25) NOT NULL DEFAULT '0',
  product_name text NOT NULL,
  branch_code int(25) NOT NULL,
  address text NOT NULL,
  stock_quantity int(25) NOT NULL,
  created_by text NOT NULL,
  creation_date date NOT NULL,
  updated_by text NOT NULL,
  update_date date NOT NULL,
  PRIMARY KEY (product_code)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table 'current_stock'
--


-- --------------------------------------------------------

--
-- Table structure for table 'daily_expense_info'
--

DROP TABLE IF EXISTS daily_expense_info;
CREATE TABLE daily_expense_info (
  expense_code int(25) NOT NULL AUTO_INCREMENT,
  branch_code int(25) NOT NULL,
  expense_name text NOT NULL,
  expense_date date NOT NULL,
  amount int(25) NOT NULL,
  address text NOT NULL,
  ref_no int(20) NOT NULL,
  PRIMARY KEY (expense_code)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1;

--
-- Dumping data for table 'daily_expense_info'
--

INSERT INTO daily_expense_info (expense_code, branch_code, expense_name, expense_date, amount, address, ref_no) VALUES
(120, 122, 'aaaaaaaaafa', '2012-12-12', 12548, 'afafaaaaaaaa', 120),
(102, 112, 'aafaf', '2012-05-12', 12548, 'afafaf', 120),
(123, 201, 'afafafaf', '2010-02-15', 3265, 'afafffffffff', 102),
(12, 1222, 'fafafafa', '2010-05-15', 1254, 'fafafaf', 101);

-- --------------------------------------------------------

--
-- Table structure for table 'group_info'
--

DROP TABLE IF EXISTS group_info;
CREATE TABLE group_info (
  group_id int(25) NOT NULL AUTO_INCREMENT,
  group_name text NOT NULL,
  branch_name text NOT NULL,
  product_name text NOT NULL,
  quantity int(25) NOT NULL,
  PRIMARY KEY (group_id)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table 'group_info'
--


-- --------------------------------------------------------

--
-- Table structure for table 'product_info'
--

DROP TABLE IF EXISTS product_info;
CREATE TABLE product_info (
  p_id int(25) NOT NULL AUTO_INCREMENT,
  product_code varchar(25) NOT NULL,
  group_code varchar(25) NOT NULL,
  challan_no varchar(25) NOT NULL,
  product_name text NOT NULL,
  description text NOT NULL,
  `date` date NOT NULL,
  product_price int(50) NOT NULL,
  unit_price int(50) NOT NULL,
  quantity int(40) NOT NULL,
  set_price int(50) NOT NULL,
  supplier_address text NOT NULL,
  PRIMARY KEY (p_id)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8;

--
-- Dumping data for table 'product_info'
--

INSERT INTO product_info (p_id, product_code, group_code, challan_no, product_name, description, date, product_price, unit_price, quantity, set_price, supplier_address) VALUES
(102, '1254', '1245', '215', 'fajlkaf', 'afaa', '2012-11-14', 1245, 124, 25, 1254, 'fafafafa'),
(10, '122', '121', '1024', 'afafaaa', 'aafaf', '2015-10-15', 125, 548, 21, 32, 'afafafffaf'),
(12, '12', '12', '12102`', 'hakjfhka', 'ahkaffh', '2030-12-15', 1254, 124, 362, 254, 'aaaaaaaaaaaaaaaa'),
(15, '45', '22', '221', 'sshshshs', 'hshs', '2015-06-15', 125, 124, 222, 555, 'gagggsgaag'),
(201, '1211', '101', '201', 'gsgg', 'gsgsg', '2012-12-16', 454, 54545, 2, 56565, 'ggss'),
(259, '125', '1214', '121', 'GGSAGSG', 'GSGSGS', '2020-08-15', 12, 1254, 12, 1254, 'FAFAFAF'),
(858, '215', '2154', '124', 'FAFA', 'AFAFA', '2020-08-15', 1254, 2541, 125, 5487, 'FAFAFA');

-- --------------------------------------------------------

--
-- Table structure for table 'prod_issue_to_branch_info'
--

DROP TABLE IF EXISTS prod_issue_to_branch_info;
CREATE TABLE prod_issue_to_branch_info (
  issue_no int(25) NOT NULL AUTO_INCREMENT,
  issue_date date NOT NULL,
  issue_from varchar(25) NOT NULL,
  issue_from_add text NOT NULL,
  issue_to varchar(25) NOT NULL,
  issue_to_address text NOT NULL,
  product_code int(20) NOT NULL,
  product_name varchar(50) NOT NULL,
  unit_price int(20) NOT NULL,
  stock_quantity int(20) NOT NULL,
  issue_quantity int(20) NOT NULL,
  PRIMARY KEY (issue_no)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8;

--
-- Dumping data for table 'prod_issue_to_branch_info'
--

INSERT INTO prod_issue_to_branch_info (issue_no, issue_date, issue_from, issue_from_add, issue_to, issue_to_address, product_code, product_name, unit_price, stock_quantity, issue_quantity) VALUES
(102, '2012-02-15', 'fafa', 'fafa', 'aa', 'afafa', 201, 'fafaf', 125, 5, 2542),
(100, '2012-05-15', 'fafa', 'fafa', 'fafa', 'afaf', 102, 'afaf', 362, 210, 102);

-- --------------------------------------------------------

--
-- Table structure for table 'sales_info'
--

DROP TABLE IF EXISTS sales_info;
CREATE TABLE sales_info (
  p_id int(20) NOT NULL,
  product_name text NOT NULL,
  branch_code int(20) NOT NULL,
  sales_date date NOT NULL,
  stock_quantity int(20) NOT NULL,
  unit_price int(20) NOT NULL,
  amount int(20) NOT NULL,
  net_amount int(25) NOT NULL,
  discount int(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table 'sales_info'
--

INSERT INTO sales_info (p_id, product_name, branch_code, sales_date, stock_quantity, unit_price, amount, net_amount, discount) VALUES
(102, 'fafafa', 102, '2012-10-12', 1111, 444444, 41455, 1245, 10);

-- --------------------------------------------------------

--
-- Table structure for table 'user_info'
--

DROP TABLE IF EXISTS user_info;
CREATE TABLE user_info (
  u_id int(25) NOT NULL AUTO_INCREMENT,
  u_name text NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (u_id)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8;

--
-- Dumping data for table 'user_info'
--

INSERT INTO user_info (u_id, u_name, password) VALUES
(1, 'root', '123');
