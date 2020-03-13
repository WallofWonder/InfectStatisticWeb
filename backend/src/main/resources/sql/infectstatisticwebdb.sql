/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : infectstatisticwebdb

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 13/03/2020 21:42:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` datetime(0) NULL DEFAULT NULL COMMENT '更新日期',
  `provinceShortName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所在省名称',
  `cityName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市名称',
  `currentConfirmedCount` int(11) NULL DEFAULT NULL COMMENT '现存确诊',
  `confirmedCount` int(11) NULL DEFAULT NULL COMMENT '累计确诊',
  `suspectedCount` int(11) NULL DEFAULT NULL COMMENT '疑似',
  `curedCount` int(11) NULL DEFAULT NULL COMMENT '治愈',
  `deadCount` int(11) NULL DEFAULT NULL COMMENT '死亡',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 425 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for nation
-- ----------------------------
DROP TABLE IF EXISTS `nation`;
CREATE TABLE `nation`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `modifyTime` bigint(20) NULL DEFAULT 0 COMMENT '更新时间戳',
  `currentConfirmedCount` int(11) NULL DEFAULT NULL COMMENT '现有确诊',
  `confirmedCount` int(11) NULL DEFAULT NULL COMMENT '累计确诊',
  `suspectedCount` int(11) NULL DEFAULT NULL COMMENT '疑似病例',
  `curedCount` int(11) NULL DEFAULT NULL COMMENT '治愈',
  `deadCount` int(11) NULL DEFAULT NULL COMMENT '死亡',
  `seriousCount` int(11) NULL DEFAULT NULL COMMENT '现有重症',
  `suspectedIncr` int(11) NULL DEFAULT NULL COMMENT '疑似新增',
  `currentConfirmedIncr` int(11) NULL DEFAULT NULL COMMENT '现有确诊新增',
  `confirmedIncr` int(11) NULL DEFAULT NULL COMMENT '累计确诊新增',
  `curedIncr` int(11) NULL DEFAULT NULL COMMENT '治愈新增',
  `deadIncr` int(11) NULL DEFAULT NULL COMMENT '死亡新增',
  `seriousIncr` int(11) NULL DEFAULT NULL COMMENT '重症新增',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for province
-- ----------------------------
DROP TABLE IF EXISTS `province`;
CREATE TABLE `province`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date NULL DEFAULT NULL COMMENT '日期',
  `provinceShortName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `currentConfirmedCount` int(11) NULL DEFAULT NULL COMMENT '现存确诊',
  `confirmedCount` int(11) NULL DEFAULT NULL COMMENT '累计确诊',
  `suspectedCount` int(11) NULL DEFAULT NULL COMMENT '疑似',
  `curedCount` int(11) NULL DEFAULT NULL COMMENT '治愈',
  `deadCount` int(11) NULL DEFAULT NULL COMMENT '死亡',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 715 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
