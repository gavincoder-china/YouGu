/*
 Navicat Premium Data Transfer

 Source Server         : docker
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:32769
 Source Schema         : TMall

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 03/09/2019 15:27:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` int(11) DEFAULT NULL COMMENT 'user_id 对应用户表id',
  `product_id` int(11) DEFAULT NULL COMMENT 'product_id 对应商品表id',
  `quantity` int(11) DEFAULT NULL COMMENT 'quantity 商品数量',
  `checked` int(11) DEFAULT NULL COMMENT 'checked 选择状态,0:未选择,1:选择',
  `create_time` datetime DEFAULT NULL COMMENT 'create_time',
  `update_time` datetime DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='cart 购物车表';

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id 类型划分',
  `name` varchar(32) DEFAULT NULL COMMENT 'name 类别名',
  `parent_id` int(11) DEFAULT NULL COMMENT 'parent_id 大类划分,如果本身是大类,写0;如果是子类,写大类的id',
  `sort_order` int(11) DEFAULT NULL COMMENT 'sort_order 同类中排序前后规则',
  `create_time` datetime DEFAULT NULL COMMENT 'create_time',
  `update_time` datetime DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='category 商品分类';

-- ----------------------------
-- Table structure for color
-- ----------------------------
DROP TABLE IF EXISTS `color`;
CREATE TABLE `color` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) DEFAULT NULL,
  `color_name` varchar(255) DEFAULT NULL COMMENT '颜色类型名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` int(11) DEFAULT NULL COMMENT 'user_id 对应用户表id',
  `product_id` int(11) DEFAULT NULL COMMENT 'product_id 对应商品表id',
  `comment` text COMMENT 'comment 评论',
  `create_time` datetime DEFAULT NULL COMMENT 'create_time',
  `update_time` datetime DEFAULT NULL COMMENT 'update_time',
  `level` int(11) DEFAULT NULL COMMENT 'level 评价等级1-5',
  `modify_times` int(11) DEFAULT NULL COMMENT 'modify_times 修改次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='comment 评论表';

-- ----------------------------
-- Table structure for favourite
-- ----------------------------
DROP TABLE IF EXISTS `favourite`;
CREATE TABLE `favourite` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` int(11) DEFAULT NULL COMMENT 'user_id 对应用户表id',
  `product_id` int(11) DEFAULT NULL COMMENT 'product_id 对应商品表',
  `status` int(11) DEFAULT '1' COMMENT 'status 收藏状态,0:取消收藏,1:收藏',
  `create_time` datetime DEFAULT NULL COMMENT 'create_time',
  `delete_time` datetime DEFAULT NULL COMMENT 'delete_time',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='favourite 收藏商品表';

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `order_no` bigint(20) DEFAULT NULL COMMENT 'order_no 订单流水号',
  `user_id` int(11) DEFAULT NULL COMMENT 'user_id 对应用户表的id',
  `shipping_id` int(11) DEFAULT NULL COMMENT 'shipping_id 对应地址表id',
  `payment` decimal(32,8) DEFAULT NULL COMMENT 'payment 支付金额',
  `payment_type` int(11) DEFAULT NULL COMMENT 'payment_type 支付平台类型,1:支付宝,2:微信,3:..',
  `postage` decimal(32,8) DEFAULT NULL COMMENT 'postage 邮费',
  `status` int(11) DEFAULT NULL COMMENT 'status 订单状态,0:已取消,1:未支付,2:已支付',
  `payment_time` datetime DEFAULT NULL COMMENT 'payment_time 订单支付时间',
  `create_time` datetime DEFAULT NULL COMMENT 'create_time 订单创建时间',
  `send_time` datetime DEFAULT NULL COMMENT 'send_time 发货时间',
  `receive_time` datetime DEFAULT NULL COMMENT 'receive_time 收货时间',
  `update_time` datetime DEFAULT NULL COMMENT 'update_time 订单内容修改时间',
  `close_time` datetime DEFAULT NULL COMMENT 'close_time 订单取消时间',
  `end_time` datetime DEFAULT NULL COMMENT 'end_time 交易完成时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='order';

-- ----------------------------
-- Table structure for orderitem
-- ----------------------------
DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` int(11) DEFAULT NULL COMMENT 'user_id 对应用户表id',
  `order_id` int(11) DEFAULT NULL COMMENT 'order_id 对应订单表id',
  `product_id` int(11) DEFAULT NULL COMMENT 'product_id 对应商品表id',
  `product_image` varchar(128) DEFAULT NULL COMMENT 'product_image 对应商品主图链接',
  `quantity` int(11) DEFAULT NULL COMMENT 'quantity 商品数量',
  `total_price` decimal(32,8) DEFAULT NULL COMMENT 'total_price 总金额',
  `current_price` decimal(32,8) DEFAULT NULL COMMENT 'current_price 折扣后商品单价',
  `cteate_time` datetime DEFAULT NULL COMMENT 'cteate_time 订单创建时间',
  `update_time` datetime DEFAULT NULL COMMENT 'update_time 订单更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='orderitem';

-- ----------------------------
-- Table structure for pay_info
-- ----------------------------
DROP TABLE IF EXISTS `pay_info`;
CREATE TABLE `pay_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` int(11) DEFAULT NULL COMMENT 'user_id 对应用户表id',
  `order_id` int(11) DEFAULT NULL COMMENT 'order_id 对应订单表id',
  `order_no` int(11) DEFAULT NULL COMMENT 'order_no 对应订单表订单号',
  `pay_no` int(11) DEFAULT NULL COMMENT 'pay_no 支付流水号',
  `pay_platform` int(11) DEFAULT NULL COMMENT 'pay_platform 支付平台类型,1:支付宝,2:微信,3:..',
  `pay_status` int(11) DEFAULT NULL COMMENT 'pay_status 支付状态,1:支付成功,2:未支付,3:支付失败',
  `create_time` datetime DEFAULT NULL COMMENT 'create_time',
  `update_time` datetime DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='pay_info 支付信息';

-- ----------------------------
-- Table structure for picture
-- ----------------------------
DROP TABLE IF EXISTS `picture`;
CREATE TABLE `picture` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `url` varchar(255) DEFAULT NULL,
  `product_id` int(255) DEFAULT NULL COMMENT '对应商品id',
  `level` int(5) DEFAULT NULL COMMENT '图片等级,1是主图,2是副图',
  `color_id` int(5) DEFAULT NULL COMMENT '商品的类别,颜色',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `category` int(11) DEFAULT NULL COMMENT 'category_id 对应商品分类表id',
  `name` varchar(32) DEFAULT NULL COMMENT 'name 商品名称',
  `subtitle` varchar(32) DEFAULT NULL COMMENT 'subtitle 商品副标题',
  `main_image` varchar(128) DEFAULT NULL COMMENT 'main_image 商品主图地址',
  `datail` text COMMENT 'datail 商品介绍',
  `price` decimal(32,8) DEFAULT NULL COMMENT 'price 商品单价,保留两位小数',
  `stock` bigint(20) DEFAULT NULL COMMENT 'stock 库存数量',
  `status` int(11) DEFAULT NULL COMMENT 'status 商品状态,1:在售,2:下架,3:删除',
  `create_time` datetime DEFAULT NULL COMMENT 'create_time',
  `update_time` datetime DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='product 商品表';

-- ----------------------------
-- Table structure for shipping
-- ----------------------------
DROP TABLE IF EXISTS `shipping`;
CREATE TABLE `shipping` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` int(11) DEFAULT NULL COMMENT 'user_id 对应用户表id',
  `receiver_name` varchar(32) DEFAULT NULL COMMENT 'receiver_name 收货人姓名',
  `receiver_phone` varchar(11) DEFAULT NULL COMMENT 'receiver_phone 收货人电话',
  `receiver_province` varchar(32) DEFAULT NULL COMMENT 'receiver_province 收货人省份',
  `receiver_city` varchar(32) DEFAULT NULL COMMENT 'receiver_city 收货人城市',
  `receiver_district` varchar(32) DEFAULT NULL COMMENT 'receiver_district 收货人区县',
  `receiver_address` varchar(32) DEFAULT NULL COMMENT 'receiver_address 收货人详细地址',
  `receiver_zip` varchar(32) DEFAULT NULL COMMENT 'receiver_zip 收货地址邮编',
  `status` int(11) DEFAULT NULL COMMENT 'status 地址状态0:删除,1:使用',
  `create_time` datetime DEFAULT NULL COMMENT 'create_time',
  `update_time` datetime DEFAULT NULL COMMENT 'update_time',
  `delete_time` datetime DEFAULT NULL COMMENT 'delete_time',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='shipping 收货地址表';

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(32) DEFAULT NULL COMMENT 'uername',
  `password` varchar(32) DEFAULT NULL COMMENT 'password',
  `phone` varchar(11) DEFAULT NULL COMMENT 'phone',
  `email` varchar(128) DEFAULT NULL COMMENT 'email',
  `register_time` datetime DEFAULT NULL COMMENT 'create_time 注册时间',
  `update_time` datetime DEFAULT NULL COMMENT 'update_time 最后登录时间',
  `login_times` varchar(32) DEFAULT NULL COMMENT 'login_times 登陆次数',
  `question` text COMMENT 'question 找回密码密保问题',
  `answer` text COMMENT 'answer 找回密码密保答案',
  `image` varchar(128) DEFAULT NULL COMMENT 'image 头像图片的地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='user';

SET FOREIGN_KEY_CHECKS = 1;
