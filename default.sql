create user 'test'@'%' identified by '123456';
create database ssm DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
grant all privileges on `ssm`.* to 'test'@'%' identified by '123456';
flush privileges;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '1',
  `nickname` varchar(200) DEFAULT NULL,
  `password` varchar(200) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `username` varchar(200) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `org_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('10003', '2017-10-30 11:52:38', '1', '超级用户', '123456', '2018-12-05 16:52:19', 'admin', '1', '1');
INSERT INTO `sys_user` VALUES ('10004', '2017-10-30 16:13:02', '1', '莎士比亚', '123456', '2019-01-02 14:47:51', 'user', '2', '7');
INSERT INTO `sys_user` VALUES ('10005', '2017-11-15 14:02:56', '1', 'abba', '123456', '2019-01-02 15:42:48', 'aaa', '1', '12');
INSERT INTO `sys_user` VALUES ('10007', '2017-11-22 16:29:41', '1', '就看看列表', '123456', '2019-01-02 15:42:56', 'test', '3', '1');
INSERT INTO `sys_user` VALUES ('10009', '2018-12-05 16:17:13', '2', '李xx', '123123', '2018-12-05 16:50:12', 'lij', '1', null);
INSERT INTO `sys_user` VALUES ('10010', '2018-12-05 16:08:17', '1', '李倞', '321321', '2019-01-02 15:43:04', 'lijing', '1', '3');
INSERT INTO `sys_user` VALUES ('10011', '2018-12-05 16:50:54', '1', 'test1', '123', '2019-01-02 15:43:30', 'test1', '1', '3');
INSERT INTO `sys_user` VALUES ('10012', '2018-12-05 16:51:06', '1', 'test2', '123', '2019-01-02 15:43:47', 'test2', '1', '3');
INSERT INTO `sys_user` VALUES ('10013', '2018-12-05 16:51:22', '1', 'test3', '123', '2019-01-02 15:43:35', 'test3', '1', '12');
INSERT INTO `sys_user` VALUES ('10014', '2018-12-05 16:51:42', '1', 'test4', '123', '2019-01-02 15:43:40', 'test4', '1', '4');
INSERT INTO `sys_user` VALUES ('10015', '2018-12-05 16:51:52', '1', 'test5', '123', '2019-01-02 15:43:54', 'test5', '1', '11');
INSERT INTO `sys_user` VALUES ('10016', '2018-12-05 16:52:01', '1', 'test6', '123', '2019-01-02 15:59:49', 'test6', '1', '4');
INSERT INTO `sys_user` VALUES ('10018', '2018-12-21 16:16:37', '2', 'lijing22', '123123', '2018-12-21 16:18:07', 'lijing22', '1', null);
INSERT INTO `sys_user` VALUES ('10019', '2018-12-25 10:23:02', '1', 'lkk', '123123', '2019-01-02 16:00:09', 'lkk', '2', '7');
INSERT INTO `sys_user` VALUES ('10020', '2018-12-25 10:24:54', '1', 'lkk2', '123', '2019-01-02 16:00:15', 'lkk2', '2', '7');
INSERT INTO `sys_user` VALUES ('10021', '2019-01-02 14:42:09', '1', '新人', '123123', '2019-01-02 14:42:09', '新人', '1', '12');
INSERT INTO `sys_user` VALUES ('10022', '2019-01-02 17:16:53', '1', '测试', '123123', '2019-01-02 17:16:53', '测试', null, null);


-- ----------------------------
-- Table structure for sys_code
-- ----------------------------
DROP TABLE IF EXISTS `sys_code`;
CREATE TABLE `sys_code` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code_key` varchar(255) DEFAULT NULL,
  `code_name` varchar(255) DEFAULT NULL,
  `code_type` varchar(255) DEFAULT NULL,
  `code_value` varchar(255) DEFAULT NULL,
  `enabled` tinyint DEFAULT NULL,
  `order_number` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_code
-- ----------------------------
INSERT INTO `sys_code` VALUES ('10000', 'S1', '待付款', 'OrderStatus', '1', '1', '1', null, null);
INSERT INTO `sys_code` VALUES ('10001', 'S2', '待发货', 'OrderStatus', '2', '1', '2', null, null);
INSERT INTO `sys_code` VALUES ('10002', 'S3', '待收货', 'OrderStatus', '3', '1', '3', null, null);
INSERT INTO `sys_code` VALUES ('10003', 'S4', '已收货', 'OrderStatus', '4', '1', '4', null, null);
INSERT INTO `sys_code` VALUES ('10004', 'S5', '退款', 'OrderStatus', '5', '1', '5', null, null);
INSERT INTO `sys_code` VALUES ('10005', 'S6', '退货', 'OrderStatus', '6', '1', '6', null, null);
INSERT INTO `sys_code` VALUES ('10006', 'S1', '男', 'CustomerSex', '1', '1', '1', null, null);
INSERT INTO `sys_code` VALUES ('10007', 'S2', '女', 'CustomerSex', '2', '1', '2', null, null);
INSERT INTO `sys_code` VALUES ('10008', 'S3', '不明', 'CustomerSex', '3', '1', '3', null, null);
INSERT INTO `sys_code` VALUES ('10009', 'S1', '是', 'DirectlyUnder', '1', '1', '1', null, null);
INSERT INTO `sys_code` VALUES ('10010', 'S2', '否', 'DirectlyUnder', '0', '1', '1', null, null);
INSERT INTO `sys_code` VALUES ('10011', 'S1', '成本', 'DemoMajor', '1', '1', '1', null, null);
INSERT INTO `sys_code` VALUES ('10012', 'S2', '收入', 'DemoMajor', '2', '1', '1', null, null);