## <center>目录</center>
 - ### 1. 模块清单
- [<h4 id="module-mall-from">1.1. 商城</h4>](#module-mall "mall")
	- [<h5 id="module-mall-relation}-from">1.1.1. 关联关系</h5>](#module-mall-relation "关联关系")
	- [<h5 id="module-mall-tableList-from">1.1.2. 表清单</h5>](#module-mall-tableList "表清单")
	- [<h5 id="module-mall-tableColumnList-from">1.1.3. 表列清单</h5>](#module-mall-tableColumnList "表列清单")
		- [<h6 id="module-mall-tableColumnList-user-from">1.1.3.1 user【user】</h6>](#module-mall-tableColumnList-user "user")
		- [<h6 id="module-mall-tableColumnList-order-from">1.1.3.2 order【order】</h6>](#module-mall-tableColumnList-order "order")
		- [<h6 id="module-mall-tableColumnList-order_item-from">1.1.3.3 order\_item【order_item】</h6>](#module-mall-tableColumnList-order_item "order_item")
		- [<h6 id="module-mall-tableColumnList-product-from">1.1.3.4 product【product 商品表】</h6>](#module-mall-tableColumnList-product "product")
		- [<h6 id="module-mall-tableColumnList-pay_info-from">1.1.3.5 pay\_info【pay_info 支付信息】</h6>](#module-mall-tableColumnList-pay_info "pay_info")
		- [<h6 id="module-mall-tableColumnList-shipping-from">1.1.3.6 shipping【shipping 收货地址表】</h6>](#module-mall-tableColumnList-shipping "shipping")
		- [<h6 id="module-mall-tableColumnList-favourite-from">1.1.3.7 favourite【favourite 收藏商品表】</h6>](#module-mall-tableColumnList-favourite "favourite")
		- [<h6 id="module-mall-tableColumnList-comment-from">1.1.3.8 comment【comment 评论表】</h6>](#module-mall-tableColumnList-comment "comment")
		- [<h6 id="module-mall-tableColumnList-category-from">1.1.3.9 category【category 商品分类】</h6>](#module-mall-tableColumnList-category "category")
		- [<h6 id="module-mall-tableColumnList-cart-from">1.1.3.10 cart【cart 购物车表】</h6>](#module-mall-tableColumnList-cart "cart")
		- [<h6 id="module-mall-tableColumnList-color-from">1.1.3.11 color【color】</h6>](#module-mall-tableColumnList-color "color")
		- [<h6 id="module-mall-tableColumnList-picture-from">1.1.3.12 picture【picture】</h6>](#module-mall-tableColumnList-picture "picture")
- [<h4 id="module-DB_REVERSE_MYSQL-from">1.2. 逆向解析\_MYSQL</h4>](#module-DB_REVERSE_MYSQL "DB_REVERSE_MYSQL")
	- [<h5 id="module-DB_REVERSE_MYSQL-relation}-from">1.2.1. 关联关系</h5>](#module-DB_REVERSE_MYSQL-relation "关联关系")
	- [<h5 id="module-DB_REVERSE_MYSQL-tableList-from">1.2.2. 表清单</h5>](#module-DB_REVERSE_MYSQL-tableList "表清单")
	- [<h5 id="module-DB_REVERSE_MYSQL-tableColumnList-from">1.2.3. 表列清单</h5>](#module-DB_REVERSE_MYSQL-tableColumnList "表列清单")
		- [<h6 id="module-DB_REVERSE_MYSQL-tableColumnList-orderitem-from">1.2.3.1 orderitem【orderitem】</h6>](#module-DB_REVERSE_MYSQL-tableColumnList-orderitem "orderitem")
  ---

### 1. 模块清单
 - [<h4 id="module-mall">1.1. 商城</h4>](#module-mall-from)
 - [<h5 id="module-mall-relation">1.1.1 关联关系</h5>](#module-mall-relation-from)
 ---


![mall-关系图](./mall_files/mall.png)

 ---

 - [<h5 id="module-mall-tableList">1.1.2 表清单</h5>](#module-mall-tableList-from)

 ---

| 名称 | 代码 | 备注 |
| ------------ | ------------ | ------------ |
| user | user |  |
| order | order |  |
| order_item | order\_item |  |
| product 商品表 | product |  |
| pay_info 支付信息 | pay\_info |  |
| shipping 收货地址表 | shipping |  |
| favourite 收藏商品表 | favourite |  |
| comment 评论表 | comment |  |
| category 商品分类 | category |  |
| cart 购物车表 | cart |  |
| color | color | 颜色分类 |
| picture | picture | 图片库 |

 ---

 - [<h5 id="module-mall-tableColumnList">1.1.3 表列清单</h5>](#module-mall-tableColumnList-from)

 ---

 - [<h6 id="module-mall-tableColumnList-user">user【user】</h6>](#module-mall-tableColumnList-user-from)

| 代码 | 名称 | 数据类型(MYSQL) | 主键 | 备注 |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| id | id | INT(10) | √ |  |
| username | uername | VARCHAR(32) |  |  |
| password | password | VARCHAR(32) |  |  |
| phone | phone | INT(10) |  |  |
| email | email | VARCHAR(128) |  |  |
| register\_time | create_time 注册时间 | DATETIME |  |  |
| update\_time | update_time 最后登录时间 | DATETIME |  |  |
| login\_times | login_times 登陆次数 | VARCHAR(32) |  |  |
| question | question 找回密码密保问题 | TEXT |  |  |
| answer | answer 找回密码密保答案 | TEXT |  |  |
| image | image 头像图片的地址 | VARCHAR(128) |  |  |

 ---

 - [<h6 id="module-mall-tableColumnList-order">order【order】</h6>](#module-mall-tableColumnList-order-from)

| 代码 | 名称 | 数据类型(MYSQL) | 主键 | 备注 |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| id | id | INT(10) | √ |  |
| order\_no | order_no 订单流水号 | BIGINT(19) |  |  |
| user\_id | user_id 对应用户表的id | INT(10) |  |  |
| shipping\_id | shipping_id 对应地址表id | INT(10) |  |  |
| payment | payment 支付金额 | DECIMAL(32,8) |  |  |
| payment\_type | payment_type 支付平台类型,1:支付宝,2:微信,3:.. | INT(10) |  |  |
| postage | postage 邮费 | DECIMAL(32,8) |  |  |
| status | status 订单状态,0:已取消,1:未支付,2:已支付 | INT(10) |  |  |
| payment\_time | payment_time 订单支付时间 | DATETIME |  |  |
| create\_time | create_time 订单创建时间 | DATETIME |  |  |
| send\_time | send_time 发货时间 | DATETIME |  |  |
| receive\_time | receive_time 收货时间 | DATETIME |  |  |
| update\_time | update_time 订单内容修改时间 | DATETIME |  |  |
| close\_time | close_time 订单取消时间 | DATETIME |  |  |
| end\_time | end_time 交易完成时间 | DATETIME |  |  |

 ---

 - [<h6 id="module-mall-tableColumnList-order_item">order_item【order_item】</h6>](#module-mall-tableColumnList-order_item-from)

| 代码 | 名称 | 数据类型(MYSQL) | 主键 | 备注 |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| id | id | INT | √ |  |
| user\_id | user_id | INT |  | 对应用户表id |
| order\_id | order_id | INT |  | 对应订单表id |
| product\_id | product_id | INT |  | 对应商品表id |
| product\_image | product_image | VARCHAR(128) |  | 对应商品主图链接 |
| quantity | quantity | INT |  | 商品数量 |
| total\_price | total_price | DECIMAL(32,8) |  | 总金额 |
| current\_price | current_price | DECIMAL(32,8) |  | 折扣后商品单价 |
| cteate\_time | cteate_time | DATETIME |  | 订单创建时间 |
| update\_time | update_time | DATETIME |  | 订单更新时间 |

 ---

 - [<h6 id="module-mall-tableColumnList-product">product【product 商品表】</h6>](#module-mall-tableColumnList-product-from)

| 代码 | 名称 | 数据类型(MYSQL) | 主键 | 备注 |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| id | id | INT(10) | √ |  |
| category | category_id 对应商品分类表id | INT(10) |  |  |
| name | name 商品名称 | VARCHAR(32) |  |  |
| subtitle | subtitle 商品副标题 | VARCHAR(32) |  |  |
| main\_image | main_image 商品主图地址 | VARCHAR(128) |  |  |
| datail | datail 商品介绍 | TEXT |  |  |
| price | price 商品单价,保留两位小数 | DECIMAL(32,8) |  |  |
| stock | stock 库存数量 | BIGINT(19) |  |  |
| status | status 商品状态,1:在售,2:下架,3:删除 | INT(10) |  |  |
| create\_time | create_time | DATETIME |  |  |
| update\_time | update_time | DATETIME |  |  |

 ---

 - [<h6 id="module-mall-tableColumnList-pay_info">pay_info【pay_info 支付信息】</h6>](#module-mall-tableColumnList-pay_info-from)

| 代码 | 名称 | 数据类型(MYSQL) | 主键 | 备注 |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| id | id | INT(10) | √ |  |
| user\_id | user_id 对应用户表id | INT(10) |  |  |
| order\_id | order_id 对应订单表id | INT(10) |  |  |
| order\_no | order_no 对应订单表订单号 | INT(10) |  |  |
| pay\_no | pay_no 支付流水号 | INT(10) |  |  |
| pay\_platform | pay_platform 支付平台类型,1:支付宝,2:微信,3:.. | INT(10) |  |  |
| pay\_status | pay_status 支付状态,1:支付成功,2:未支付,3:支付失败 | INT(10) |  |  |
| create\_time | create_time | DATETIME |  |  |
| update\_time | update_time | DATETIME |  |  |

 ---

 - [<h6 id="module-mall-tableColumnList-shipping">shipping【shipping 收货地址表】</h6>](#module-mall-tableColumnList-shipping-from)

| 代码 | 名称 | 数据类型(MYSQL) | 主键 | 备注 |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| id | id | INT(10) | √ |  |
| user\_id | user_id 对应用户表id | INT(10) |  |  |
| receiver\_name | receiver_name 收货人姓名 | VARCHAR(32) |  |  |
| receiver\_phone | receiver_phone 收货人电话 | INT(10) |  |  |
| receiver\_province | receiver_province 收货人省份 | VARCHAR(32) |  |  |
| receiver\_city | receiver_city 收货人城市 | VARCHAR(32) |  |  |
| receiver\_district | receiver_district 收货人区县 | VARCHAR(32) |  |  |
| receiver\_address | receiver_address 收货人详细地址 | VARCHAR(32) |  |  |
| receiver\_zip | receiver_zip 收货地址邮编 | VARCHAR(32) |  |  |
| status | status 地址状态0:删除,1:使用 | INT(10) |  |  |
| create\_time | create_time | DATETIME |  |  |
| update\_time | update_time | DATETIME |  |  |
| delete\_time | delete_time | DATETIME |  |  |

 ---

 - [<h6 id="module-mall-tableColumnList-favourite">favourite【favourite 收藏商品表】</h6>](#module-mall-tableColumnList-favourite-from)

| 代码 | 名称 | 数据类型(MYSQL) | 主键 | 备注 |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| id | id | INT(10) | √ |  |
| user\_id | user_id 对应用户表id | INT(10) |  |  |
| product\_id | product_id 对应商品表 | INT(10) |  |  |
| status | status 收藏状态,0:取消收藏,1:收藏 | INT(10) |  |  |
| create\_time | create_time | DATETIME |  |  |
| delete\_time | delete_time | DATETIME |  |  |

 ---

 - [<h6 id="module-mall-tableColumnList-comment">comment【comment 评论表】</h6>](#module-mall-tableColumnList-comment-from)

| 代码 | 名称 | 数据类型(MYSQL) | 主键 | 备注 |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| id | id | INT(10) | √ |  |
| user\_id | user_id 对应用户表id | INT(10) |  |  |
| product\_id | product_id 对应商品表id | INT(10) |  |  |
| comment | comment 评论 | TEXT |  |  |
| create\_time | create_time | DATETIME |  |  |
| update\_time | update_time | DATETIME |  |  |
| level | level 评价等级1-5 | INT(10) |  |  |
| modify\_times | modify_times 修改次数 | INT(10) |  |  |

 ---

 - [<h6 id="module-mall-tableColumnList-category">category【category 商品分类】</h6>](#module-mall-tableColumnList-category-from)

| 代码 | 名称 | 数据类型(MYSQL) | 主键 | 备注 |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| id | id 类型划分 | INT(10) | √ |  |
| name | name 类别名 | VARCHAR(32) |  |  |
| parent\_id | parent_id 大类划分,如果本身是大类,写0;如果是子类,写大类的id | INT(10) |  |  |
| sort\_order | sort_order 同类中排序前后规则 | INT(10) |  |  |
| create\_time | create_time | DATETIME |  |  |
| update\_time | update_time | DATETIME |  |  |

 ---

 - [<h6 id="module-mall-tableColumnList-cart">cart【cart 购物车表】</h6>](#module-mall-tableColumnList-cart-from)

| 代码 | 名称 | 数据类型(MYSQL) | 主键 | 备注 |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| id | id | INT(10) | √ |  |
| user\_id | user_id 对应用户表id | INT(10) |  |  |
| product\_id | product_id 对应商品表id | INT(10) |  |  |
| quantity | quantity 商品数量 | INT(10) |  |  |
| checked | checked 选择状态,0:未选择,1:选择 | INT(10) |  |  |
| create\_time | create_time | DATETIME |  |  |
| update\_time | update_time | DATETIME |  |  |

 ---

 - [<h6 id="module-mall-tableColumnList-color">color【color】</h6>](#module-mall-tableColumnList-color-from)

| 代码 | 名称 | 数据类型(MYSQL) | 主键 | 备注 |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| id | id | INT | √ |  |
| product\_id | product_id | INT |  |  |
| color\_name | color_name | VARCHAR(128) |  | 颜色分类名称 |

 ---

 - [<h6 id="module-mall-tableColumnList-picture">picture【picture】</h6>](#module-mall-tableColumnList-picture-from)

| 代码 | 名称 | 数据类型(MYSQL) | 主键 | 备注 |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| id | id | INT | √ |  |
| url | url | VARCHAR(128) |  | 图片链接地址 |
| product\_id | product_id | INT |  |  |
| level | level | INT |  | 图片等级,1是主图,2是副图 |
| color\_id | color_id | INT |  | 商品的类别,颜色 |

 ---

 - [<h4 id="module-DB_REVERSE_MYSQL">1.2. 逆向解析_MYSQL</h4>](#module-DB_REVERSE_MYSQL-from)
 - [<h5 id="module-DB_REVERSE_MYSQL-relation">1.2.1 关联关系</h5>](#module-DB_REVERSE_MYSQL-relation-from)
 ---


![DB_REVERSE_MYSQL-关系图](./mall_files/DB_REVERSE_MYSQL.png)

 ---

 - [<h5 id="module-DB_REVERSE_MYSQL-tableList">1.2.2 表清单</h5>](#module-DB_REVERSE_MYSQL-tableList-from)

 ---

| 名称 | 代码 | 备注 |
| ------------ | ------------ | ------------ |
| orderitem | orderitem |  |

 ---

 - [<h5 id="module-DB_REVERSE_MYSQL-tableColumnList">1.2.3 表列清单</h5>](#module-DB_REVERSE_MYSQL-tableColumnList-from)

 ---

 - [<h6 id="module-DB_REVERSE_MYSQL-tableColumnList-orderitem">orderitem【orderitem】</h6>](#module-DB_REVERSE_MYSQL-tableColumnList-orderitem-from)

| 代码 | 名称 | 数据类型(MYSQL) | 主键 | 备注 |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| id | id | INT(10) | √ |  |
| user\_id | user_id 对应用户表id | INT(10) |  |  |
| order\_id | order_id 对应订单表id | INT(10) |  |  |
| product\_id | product_id 对应商品表id | INT(10) |  |  |
| product\_image | product_image 对应商品主图链接 | VARCHAR(128) |  |  |
| quantity | quantity 商品数量 | INT(10) |  |  |
| total\_price | total_price 总金额 | DECIMAL(32,8) |  |  |
| current\_price | current_price 折扣后商品单价 | DECIMAL(32,8) |  |  |
| cteate\_time | cteate_time 订单创建时间 | DATETIME |  |  |
| update\_time | update_time 订单更新时间 | DATETIME |  |  |

 ---

