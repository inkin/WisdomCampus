/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : wisdomcampus

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2016-12-22 17:28:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `admin_name` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `adminPermission_code` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `admin_tell` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `adminRole_no` varchar(20) COLLATE utf8_unicode_ci DEFAULT '',
  `group_id` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='adminPermission_code:权限\r\nadminRole_no：学工号';

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `c_no` varchar(10) NOT NULL,
  `c_name` varchar(10) DEFAULT NULL,
  `c_member` int(10) DEFAULT NULL,
  `c_grade` varchar(10) DEFAULT NULL,
  `institute_no` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`c_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES ('01', '软件一班', '55', '2013', '0101');
INSERT INTO `class` VALUES ('02', '软件二班', '60', '2013', '0101');
INSERT INTO `class` VALUES ('03', '网络一班', '58', '2013', '0102');
INSERT INTO `class` VALUES ('04', '网络二班', '56', '2013', '0102');
INSERT INTO `class` VALUES ('05', '物联网一班', '65', '2013', '0103');
INSERT INTO `class` VALUES ('06', '科学与技术一班', '63', '2013', '0104');

-- ----------------------------
-- Table structure for core
-- ----------------------------
DROP TABLE IF EXISTS `core`;
CREATE TABLE `core` (
  `core_id` varchar(10) NOT NULL,
  `course_name` varchar(15) DEFAULT NULL,
  `core` double(10,0) DEFAULT NULL,
  `student_no` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`core_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of core
-- ----------------------------

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `cs_no` varchar(10) NOT NULL,
  `cs_name` varchar(15) DEFAULT NULL,
  `cs_term` smallint(6) DEFAULT NULL,
  `teacher_no` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cs_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------

-- ----------------------------
-- Table structure for group
-- ----------------------------
DROP TABLE IF EXISTS `group`;
CREATE TABLE `group` (
  `group_id` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `group_name` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of group
-- ----------------------------

-- ----------------------------
-- Table structure for institute
-- ----------------------------
DROP TABLE IF EXISTS `institute`;
CREATE TABLE `institute` (
  `i_no` varchar(10) NOT NULL,
  `i_name` varchar(20) DEFAULT NULL,
  `i_profession` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`i_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of institute
-- ----------------------------
INSERT INTO `institute` VALUES ('0101', '计算机', '软件工程');
INSERT INTO `institute` VALUES ('0102', '计算机', '网络工程');
INSERT INTO `institute` VALUES ('0103', '计算机', '物联网');
INSERT INTO `institute` VALUES ('0104', '计算机', '科学与技术');

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `n_id` varchar(10) NOT NULL,
  `n_title` varchar(50) DEFAULT NULL,
  `n_author` varchar(10) DEFAULT NULL,
  `n_date` datetime DEFAULT NULL,
  `n_content` varchar(500) DEFAULT NULL,
  `newsType_id` varchar(10) DEFAULT NULL,
  `n_status` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`n_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('01', '肇庆学院招聘会', 'Ocean', '2016-12-13 16:15:28', '有华盛顿法定松岛枫发稿硕大的更改个人傻吊反对党发个非官方个非官方', '2', '发布');
INSERT INTO `news` VALUES ('02', '一辈子暖暖就好', 'Ocean', '2016-12-16 00:00:00', '我永远爱你到老', '1', '就绪');
INSERT INTO `news` VALUES ('03', '教练型训练', 'kerrey', '2016-12-21 10:15:55', '教育是自由发挥', '3', '发布');
INSERT INTO `news` VALUES ('04', '大数据时代', 'Tom', '2016-12-22 10:16:40', '大数据融入现代生活', '3', '就绪');
INSERT INTO `news` VALUES ('05', '天气预报', 'kk', '2016-12-21 10:17:55', '接下来得几天会有强降温', '1', '发布');

-- ----------------------------
-- Table structure for newstype
-- ----------------------------
DROP TABLE IF EXISTS `newstype`;
CREATE TABLE `newstype` (
  `nt_id` varchar(10) NOT NULL,
  `nt_name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`nt_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of newstype
-- ----------------------------
INSERT INTO `newstype` VALUES ('01', '新闻');
INSERT INTO `newstype` VALUES ('02', '招聘会');
INSERT INTO `newstype` VALUES ('03', '学术讲座');

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `p_code` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `p_name` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of permission
-- ----------------------------

-- ----------------------------
-- Table structure for server
-- ----------------------------
DROP TABLE IF EXISTS `server`;
CREATE TABLE `server` (
  `server_id` varchar(10) NOT NULL,
  `server_name` varchar(20) DEFAULT NULL,
  `server_tell` varchar(15) DEFAULT NULL,
  `server_address` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`server_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of server
-- ----------------------------
INSERT INTO `server` VALUES ('01', '保安处', '123456789', '第一田径场');
INSERT INTO `server` VALUES ('02', '咨询处', '258963147', '福慧图书馆');
INSERT INTO `server` VALUES ('04', '门卫处', '4488888611', '学校南门');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `s_no` varchar(20) NOT NULL,
  `s_name` varchar(10) DEFAULT NULL,
  `s_tell` varchar(15) DEFAULT NULL,
  `s_picture` varchar(255) DEFAULT NULL,
  `s_mail` varchar(20) DEFAULT NULL,
  `s_expression` varchar(255) DEFAULT NULL,
  `class_no` varchar(10) DEFAULT NULL,
  `s_sex` varchar(2) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`s_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('201301010101', '小明', '13800138000', '大头照', '23243234@qq.com', '小明是一个爱好学习的好学生', '01', '男', '201301010101');
INSERT INTO `student` VALUES ('201301010102', '龙猪', '9990909090', '哟喂', '232455@qq.com', '拉倒，出来看看是否有人', '01', '男', '201301010102');
INSERT INTO `student` VALUES ('201301020101', '龙卷风', '1090909090', '小头照', '234243@163.com', '不怕神一样的对手，就怕对面是条狗', '03', '男', '201301020101');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `t_no` varchar(10) NOT NULL,
  `t_name` varchar(10) DEFAULT NULL,
  `t_degree` varchar(50) DEFAULT NULL,
  `t_tell` varchar(15) DEFAULT NULL,
  `t_mail` varchar(20) DEFAULT NULL,
  `t_picture` varchar(255) DEFAULT NULL,
  `t_expression` varchar(255) DEFAULT NULL,
  `institute_no` varchar(10) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`t_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
