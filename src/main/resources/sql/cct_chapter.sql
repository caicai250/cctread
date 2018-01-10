/*
Navicat MySQL Data Transfer

Source Server         : cctread
Source Server Version : 50625
Source Host           : localhost:3306
Source Database       : cctread

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2018-01-08 09:17:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cct_chapter
-- ----------------------------
DROP TABLE IF EXISTS `cct_chapter`;
CREATE TABLE `cct_chapter` (
  `chapterid` int(11) NOT NULL AUTO_INCREMENT COMMENT '章节id',
  `novelid` int(11) NOT NULL COMMENT '书籍id',
  `chaptername` varchar(255) NOT NULL COMMENT '章节名称',
  `synopsis` varchar(1000) DEFAULT NULL COMMENT '章节简介',
  `updatedate` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`chapterid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for cct_collection
-- ----------------------------
DROP TABLE IF EXISTS `cct_collection`;
CREATE TABLE `cct_collection` (
  `collectionid` int(11) NOT NULL AUTO_INCREMENT COMMENT '收藏id',
  `userid` varchar(32) NOT NULL COMMENT '用户id',
  `novalid` int(11) NOT NULL COMMENT '书籍id',
  `conllectiondate` datetime DEFAULT NULL COMMENT '收藏时间',
  PRIMARY KEY (`collectionid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for cct_novel
-- ----------------------------
DROP TABLE IF EXISTS `cct_novel`;
CREATE TABLE `cct_novel` (
  `novelid` int(11) NOT NULL AUTO_INCREMENT COMMENT '书籍id',
  `title` varchar(255) NOT NULL COMMENT '书名',
  `noveltype` char(3) NOT NULL COMMENT '书籍分类',
  `author` varchar(255) DEFAULT NULL COMMENT '作者',
  `novelstate` char(3) DEFAULT NULL COMMENT '状态',
  `startdate` date DEFAULT NULL COMMENT '开始时间',
  `updatedate` date DEFAULT NULL COMMENT '最近更新时间',
  `nocalcover` blob COMMENT '小说封面',
  `ischarge` char(3) NOT NULL COMMENT '是否收费',
  PRIMARY KEY (`novelid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for cct_user
-- ----------------------------
DROP TABLE IF EXISTS `cct_user`;
CREATE TABLE `cct_user` (
  `userid` varchar(32) NOT NULL COMMENT '用户id',
  `username` varchar(64) NOT NULL COMMENT '用户名',
  `loginname` varchar(32) NOT NULL COMMENT '登陆名',
  `password` varchar(32) NOT NULL COMMENT '登陆密码',
  `phone` int(11) DEFAULT NULL COMMENT '手机号码',
  `e-mail` varchar(255) NOT NULL COMMENT '邮箱',
  `qq` int(32) DEFAULT NULL COMMENT 'qq',
  `vipgrade` int(16) DEFAULT NULL COMMENT '会员等级：为空就不是会员',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for cct_userlog
-- ----------------------------
DROP TABLE IF EXISTS `cct_userlog`;
CREATE TABLE `cct_userlog` (
  `userlogid` int(11) NOT NULL COMMENT '用户日志id',
  `userid` varchar(255) NOT NULL COMMENT '用户id',
  `novelid` int(11) NOT NULL COMMENT '书籍id',
  `bookmark` varchar(255) DEFAULT NULL COMMENT '书签位置',
  `Remarks` varchar(1000) DEFAULT NULL COMMENT '备注'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for code
-- ----------------------------
DROP TABLE IF EXISTS `code`;
CREATE TABLE `code` (
  `codeid` int(11) NOT NULL AUTO_INCREMENT COMMENT '代码id',
  `codetype` varchar(255) NOT NULL COMMENT '代码类别',
  `codeproice` varchar(255) NOT NULL COMMENT '代码值',
  `codename` varchar(255) NOT NULL COMMENT '代码名称',
  `isvalid` char(3) NOT NULL COMMENT '是否有效',
  PRIMARY KEY (`codeid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for sysconfig
-- ----------------------------
DROP TABLE IF EXISTS `sysconfig`;
CREATE TABLE `sysconfig` (
  `parameter` varchar(50) NOT NULL DEFAULT '' COMMENT '参数类别代码',
  `parametername` varchar(255) NOT NULL COMMENT '参数类别名称',
  `parametervalue` varchar(500) NOT NULL COMMENT '参数值',
  `parametervalueexplain` varchar(255) NOT NULL COMMENT '参数值域说明'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
