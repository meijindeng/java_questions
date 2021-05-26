# 数据库表的创建以及一些基本操作
## 操作语句：
```SQL
CREATE TABLE user(
	field1 datatype,
 	field2 datatype,
 	field3 datatype,
 )character set 字符集 collate 校验规则 engine 存储引擎
```

* field：指定列名。

* datatype：指定列类型（字段类型）。

* character set：如不指定则为所在数据库字符集。

* collate：如不指定则为所在数据库校对规则。

* engine：存储引擎。

## 例子：
```SQL
CREATE TABLE `user`(
	id INT,
	`name` VARCHAR(255),
	`password` VARCHAR(255),
	`birthday` DATE)
	CHARACTER SET utf8 COLLATE utf8_bin ENGINE INNODB;
```

1、查看数据库表的定义语句
* SHOW CREATE TABLE `user`;

2、查看表结构

* DESC `user`;