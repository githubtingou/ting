/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : testboot

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2019-09-28 17:38:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin_menu
-- ----------------------------
DROP TABLE IF EXISTS `admin_menu`;
CREATE TABLE `admin_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parent_id` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '父类id',
  `tree_code` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '排序编号',
  `menu_name` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '名称',
  `menu_href` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '链接',
  `menu_target` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '目标',
  `menu_icon` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '图标',
  `permission` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '权限标识',
  `is_show` char(1) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '是否显示（1显示 0隐藏）',
  `del_flag` char(1) COLLATE utf8mb4_unicode_ci DEFAULT '0' COMMENT '状态（0正常 1删除 2停用）',
  `add_user` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '创建人',
  `add_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_user` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人',
  `update_name` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `remarks` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='系统菜单表';

-- ----------------------------
-- Records of admin_menu
-- ----------------------------

-- ----------------------------
-- Table structure for admin_user
-- ----------------------------
DROP TABLE IF EXISTS `admin_user`;
CREATE TABLE `admin_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `login_name` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '登录名',
  `login_img` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '头像',
  `real_name` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户名',
  `password` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '密码',
  `email` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '邮箱',
  `sex` char(1) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '性别',
  `mobile` varchar(13) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `sign` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '个性签名',
  `age` int(3) DEFAULT NULL COMMENT '年龄',
  `add_user` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '创建人',
  `add_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_user` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `freeze_cause` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '冻结原因',
  `freeze_date` datetime DEFAULT NULL COMMENT '冻结时间',
  `del_flag` char(1) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '状态（0正常 1删除 2停用 3冻结）',
  `login_flag` char(1) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '登录状态',
  `login_ip` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '最后登录ip',
  `login_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '最后登录时间',
  `remarks` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='系统用户表';

-- ----------------------------
-- Records of admin_user
-- ---------------------------- cv 

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `url` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '请求路径',
  `method` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '请求方式',
  `req_IP` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '请求方式',
  `class_method` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '请求路径的项目包地址',
  `res_data` text COLLATE utf8mb4_unicode_ci COMMENT '入参',
  `result_data` text COLLATE utf8mb4_unicode_ci COMMENT '返参',
  `time` int(10) DEFAULT NULL,
  `add_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `del_flag` char(2) COLLATE utf8mb4_unicode_ci DEFAULT '0' COMMENT '删除标记 0:正常 1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='系统日志表';

-- ----------------------------
-- Records of sys_log
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(64) NOT NULL DEFAULT '' COMMENT '名称',
  `english_name` varchar(64) DEFAULT '' COMMENT '英文名称',
  `role_type` varchar(64) DEFAULT '' COMMENT '类型',
  `is_enable` char(2) DEFAULT '0' COMMENT '是否启用,0启动；1不启用',
  `add_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `add_user` varchar(64) DEFAULT NULL COMMENT '添加人',
  `update_user` varchar(64) DEFAULT NULL COMMENT '更新人',
  `del_flag` char(2) DEFAULT '0' COMMENT '删除标记 0不删除 ；1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COMMENT='系统权限表';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', 'ROLE_ADMIN', null, null, null, null, null, null, null, null);
INSERT INTO `sys_role` VALUES ('2', 'ROLE_USER', null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `sys_role_id` int(11) DEFAULT NULL COMMENT '权限id',
  `admin_menu_id` int(11) DEFAULT NULL COMMENT '菜单id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='系统权限和菜单关系表';

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_user`;
CREATE TABLE `sys_role_user` (
  `admin_user_id` varchar(11) DEFAULT '' COMMENT '用户id',
  `sys_role_id` varchar(11) DEFAULT '' COMMENT '权限id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户和权限关系表';

-- ----------------------------
-- Records of sys_role_user
-- ----------------------------
INSERT INTO `sys_role_user` VALUES ('1', '1');
INSERT INTO `sys_role_user` VALUES ('2', '2');
