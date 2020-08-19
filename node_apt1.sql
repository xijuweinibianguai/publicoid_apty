/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : node_apt1

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-12-03 22:50:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `node_apt1`
-- ----------------------------
DROP TABLE IF EXISTS `node_apt1`;
CREATE TABLE `node_apt1` (
  `node_oid` varchar(40) NOT NULL,
  `desc_type` varchar(4) NOT NULL,
  `desc_version` varchar(4) NOT NULL,
  `desc_chanum` varchar(8) NOT NULL,
  `desc_powertype` varchar(16) NOT NULL,
  `desc_outshell` varchar(8) NOT NULL,
  `desc_wireless` varchar(8) NOT NULL,
  `desc_explos` varchar(4) NOT NULL,
  `node_coding` varchar(60) NOT NULL,
  `node_order` int(30) NOT NULL,
  `birth_date` varchar(255) NOT NULL,
  `manuf_date` varchar(255) NOT NULL,
  PRIMARY KEY (`node_oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of node_apt1
-- ----------------------------
INSERT INTO `node_apt1` VALUES ('2.16.156.101818.1.1.1', '0000', '0001', '00101100', '0101011101101000', '00010001', '11001010', '0010', '0000 0001 00101100 0101011101101000 00010001 11001010 0010', '1', '2019-03-01', '2019-04-01');
INSERT INTO `node_apt1` VALUES ('2.16.156.101818.1.1.2', '0000', '0001', '00101100', '0101011101101000', '00010001', '11001010', '0010', '0000 0001 00101100 010', '3', '2019-08-22', '2019-08-26');
INSERT INTO `node_apt1` VALUES ('2.16.156.101818.1.5.1', '0000', '0001', '11000011', '1100101110100010', '00100010', '00010100', '0011', '0000 0001 11000011 1100101110100010 00100010 00010100 0011', '2', '2019-03-10', '2019-04-19');

-- ----------------------------
-- Table structure for `oid_userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `oid_userinfo`;
CREATE TABLE `oid_userinfo` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  `user_addrs` varchar(255) DEFAULT NULL,
  `user_linkman` varchar(255) DEFAULT NULL,
  `user_tel` varchar(255) DEFAULT NULL,
  `user_ip` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of oid_userinfo
-- ----------------------------
INSERT INTO `oid_userinfo` VALUES ('1', 'zxm', '123', null, null, null, null);
