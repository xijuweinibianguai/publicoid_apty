/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : oid_mgt

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-12-03 22:58:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `learnfile`
-- ----------------------------
DROP TABLE IF EXISTS `learnfile`;
CREATE TABLE `learnfile` (
  `fileid` int(11) NOT NULL AUTO_INCREMENT COMMENT '文件id',
  `filename` varchar(255) DEFAULT NULL COMMENT '文件名',
  `fileurl` varchar(255) DEFAULT NULL COMMENT '文件上传地址',
  `uplodetime` varchar(255) DEFAULT NULL COMMENT '文件上传时间',
  PRIMARY KEY (`fileid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of learnfile
-- ----------------------------

-- ----------------------------
-- Table structure for `oid_manufinfo`
-- ----------------------------
DROP TABLE IF EXISTS `oid_manufinfo`;
CREATE TABLE `oid_manufinfo` (
  `manuf_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '厂商编号(主键)',
  `manuf_name` varchar(30) NOT NULL COMMENT '公司全名',
  `manuf_addrs` varchar(40) NOT NULL COMMENT '厂商地址',
  `manuf_serverip` varchar(32) NOT NULL,
  `manuf_linkman` varchar(15) NOT NULL COMMENT '联系人',
  `manuf_tel` varchar(15) NOT NULL COMMENT '联系电话',
  `manuf_email` varchar(40) NOT NULL COMMENT '厂商ip地址',
  PRIMARY KEY (`manuf_id`),
  UNIQUE KEY `manuf_name` (`manuf_name`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of oid_manufinfo
-- ----------------------------
INSERT INTO `oid_manufinfo` VALUES ('1', '哈哈哈科技有限公司', '重庆市南山街道崇文路2号', 'fe80::f942:61d9:4590:c886', '哈哈哈', '17723088194', 'ruizhibei@qq.com');
INSERT INTO `oid_manufinfo` VALUES ('5', '天宇设备制造有限公司', '宜宾市翠屏区', '2001:da8:c807:100f::2', '张聪', '13565437896', '11@qq.com');
INSERT INTO `oid_manufinfo` VALUES ('13', '小梅有限公司', '宜宾市翠屏区', 'fe80::f942:61d9:4590:c886', '小雨', '13890760037', '1260120438@qq.com');

-- ----------------------------
-- Table structure for `oid_nodeinfo`
-- ----------------------------
DROP TABLE IF EXISTS `oid_nodeinfo`;
CREATE TABLE `oid_nodeinfo` (
  `node_oid` varchar(50) NOT NULL,
  `manuf_id` bigint(32) NOT NULL,
  `usr_id` bigint(32) DEFAULT NULL,
  PRIMARY KEY (`node_oid`),
  KEY `FKp888m8fkv75rh78a4sjfxry9l` (`manuf_id`),
  KEY `FKl1kss8rwwy8t98hk584byl1w5` (`usr_id`),
  CONSTRAINT `FKl1kss8rwwy8t98hk584byl1w5` FOREIGN KEY (`usr_id`) REFERENCES `oid_usrinfo` (`usr_id`),
  CONSTRAINT `FKp888m8fkv75rh78a4sjfxry9l` FOREIGN KEY (`manuf_id`) REFERENCES `oid_manufinfo` (`manuf_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of oid_nodeinfo
-- ----------------------------
INSERT INTO `oid_nodeinfo` VALUES ('2.16.156.101818.1.1.1', '1', '1');
INSERT INTO `oid_nodeinfo` VALUES ('2.16.156.101818.1.1.2', '1', '2');
INSERT INTO `oid_nodeinfo` VALUES ('2.16.156.101818.1.5.1', '5', '2');
INSERT INTO `oid_nodeinfo` VALUES ('2.16.156.101818.1.5.2', '5', '2');
INSERT INTO `oid_nodeinfo` VALUES ('2.16.156.101818.1.5.3', '5', '2');
INSERT INTO `oid_nodeinfo` VALUES ('2.16.156.101818.13.8.1', '13', null);

-- ----------------------------
-- Table structure for `oid_usrinfo`
-- ----------------------------
DROP TABLE IF EXISTS `oid_usrinfo`;
CREATE TABLE `oid_usrinfo` (
  `usr_id` bigint(32) NOT NULL AUTO_INCREMENT,
  `usr_name` varchar(30) NOT NULL,
  `usr_addrs` varchar(40) NOT NULL,
  `usr_serverip` varchar(32) NOT NULL,
  `usr_linkman` varchar(15) NOT NULL,
  `usr_tel` varchar(15) NOT NULL,
  `usr_email` varchar(40) NOT NULL,
  PRIMARY KEY (`usr_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of oid_usrinfo
-- ----------------------------
INSERT INTO `oid_usrinfo` VALUES ('1', '王大六科技有限公司', '重庆市', 'fe80::f942:61d9:4680:fc23', '王大大', '12839274845', 'hdhf@adj.com');
INSERT INTO `oid_usrinfo` VALUES ('2', '海天科技有限公司', '重庆市', 'fe80::f942:61d9:4680:fc24', '王溜溜', '12215866954', 'ggdfn@qq.com');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `rid` int(32) NOT NULL,
  `role_name` varchar(32) NOT NULL,
  `role_desc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '系统管理员', '拥有一切特权');
INSERT INTO `role` VALUES ('2', '普通用户', '提交申请');

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_code` varchar(32) NOT NULL COMMENT '用户账号',
  `role` varchar(32) NOT NULL,
  `user_name` varchar(64) NOT NULL COMMENT '用户名称',
  `user_password` varchar(32) NOT NULL COMMENT '用户密码',
  `user_state` char(1) NOT NULL COMMENT '1:正常,0:暂停',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('5', 'wyj2012', '系统管理员', '小军', '12345', '1');
INSERT INTO `sys_user` VALUES ('6', 'wyj2013', '普通用户', '小红', '12345', '1');
INSERT INTO `sys_user` VALUES ('7', 'wyj2014', '普通用户', '小明', '12345', '1');
INSERT INTO `sys_user` VALUES ('8', 'wyj2015', '系统管理员', '小红', '12345', '1');
