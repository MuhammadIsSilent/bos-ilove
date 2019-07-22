/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : ljzadmin

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-06-14 22:40:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bos_permission
-- ----------------------------
DROP TABLE IF EXISTS `bos_permission`;
CREATE TABLE `bos_permission` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Type` int(1) NOT NULL COMMENT '类型',
  `Name` varchar(50) DEFAULT NULL COMMENT '名称',
  `Titile` varchar(50) DEFAULT NULL COMMENT '标题',
  `Flag` tinyint(255) DEFAULT NULL,
  `CraeteTime` datetime DEFAULT NULL,
  `UpdateTime` datetime DEFAULT NULL,
  `Creater` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限';

-- ----------------------------
-- Table structure for bos_role
-- ----------------------------
DROP TABLE IF EXISTS `bos_role`;
CREATE TABLE `bos_role` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Type` varchar(255) NOT NULL COMMENT '权限类型',
  `Name` varchar(255) DEFAULT NULL,
  `Title` varchar(255) DEFAULT NULL,
  `Flag` tinyint(1) DEFAULT NULL,
  `describe` varchar(255) DEFAULT NULL,
  `CreateTime` datetime DEFAULT NULL,
  `UpdateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色';

-- ----------------------------
-- Table structure for bos_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `bos_role_permission`;
CREATE TABLE `bos_role_permission` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `RoleId` int(11) NOT NULL,
  `PermissionId` int(11) NOT NULL,
  `Flag` tinyint(1) DEFAULT NULL,
  `CreateTime` datetime DEFAULT NULL,
  `UpdateTime` datetime DEFAULT NULL,
  `Creater` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限';

-- ----------------------------
-- Table structure for bos_user
-- ----------------------------
DROP TABLE IF EXISTS `bos_user`;
CREATE TABLE `bos_user` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `UserName` varchar(255) DEFAULT NULL,
  `NickName` varchar(255) DEFAULT NULL,
  `Salt` varchar(255) DEFAULT NULL,
  `PassWord` varchar(255) DEFAULT NULL,
  `Sex` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Flag` tinyint(1) DEFAULT NULL,
  `CreateTime` datetime DEFAULT NULL,
  `UpdateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员';

-- ----------------------------
-- Table structure for bos_user_info
-- ----------------------------
DROP TABLE IF EXISTS `bos_user_info`;
CREATE TABLE `bos_user_info` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `UserId` int(11) DEFAULT NULL,
  `Flag` tinyint(1) DEFAULT NULL,
  `Birthday` datetime DEFAULT NULL COMMENT '出生日期',
  `Addreass` varchar(255) DEFAULT NULL COMMENT '地址',
  `CreateTime` datetime DEFAULT NULL,
  `UpdateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户详细信息';

-- ----------------------------
-- Table structure for bos_user_permission
-- ----------------------------
DROP TABLE IF EXISTS `bos_user_permission`;
CREATE TABLE `bos_user_permission` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `UserId` int(11) NOT NULL,
  `RoleId` int(11) NOT NULL,
  `Flag` tinyint(1) DEFAULT NULL,
  `CreateTime` datetime DEFAULT NULL,
  `UpdateTime` datetime DEFAULT NULL,
  `Creater` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户权限关联';

-- ----------------------------
-- Table structure for bos_user_role
-- ----------------------------
DROP TABLE IF EXISTS `bos_user_role`;
CREATE TABLE `bos_user_role` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `UserId` int(11) NOT NULL,
  `RoleId` int(11) NOT NULL,
  `CreateTime` datetime DEFAULT NULL,
  `UpdateTime` datetime DEFAULT NULL,
  `Flag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色';
