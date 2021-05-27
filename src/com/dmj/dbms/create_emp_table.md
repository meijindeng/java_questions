# 创建表、修改表、删除表案例
## 一、要求：创建一个员工表emp，选用适当的数据类型

| 字段       | 属性   | 描述     |
| ---------- | ------ | -------- |
| Id         | 整型   | 编号     |
| name       | 字符型 | 姓名     |
| sex        | 字符型 | 性别     |
| brithday   | 日期型 | 生日     |
| entry_date | 日期型 | 入职日期 |
| job        | 字符型 | 工作     |
| Salary     | 小数型 | 工资     |
| resume     | 文本型 | 个人简介 |


## 二、创建表

```SQL
CREATE TABLE `emp`(
		id INT,
		`name` VARCHAR(32),
		`sex` CHAR(1),
		`birthday` DATE,
		`entry_date` DATETIME,
		`job` VARCHAR(32),
		`salary` DOUBLE,
		`resume` TEXT
		)CHARACTER SET utf8 COLLATE utf8_bin ENGINE INNODB;
```

## 三、修改表
### 3.1 添加列（ADD），添加一个image列，varchar类型，在resume之后。
```SQL
ALTER TABLE `emp`
		ADD `image` VARCHAR(32) NOT NULL DEFAULT '' 
		AFTER `resume`;
```

### 3.2 修改列（MODIFY），修改job列，使长度为60。
```SQL
ALTER TABLE `emp`
		MODIFY `job` VARCHAR(60) NOT NULL DEFAULT'';
```

### 3.3 删除列（DROP），删除sex列。
```SQL
ALTER TABLE `emp` DROP `sex`;
```

### 3.4 修改表名为employee（RENAME）。
```SQL
RENAME TABLE `emp` TO `employee`;
```

### 3.5 修改表的字符集为utf8。
```SQL
ALTER TABLE `employee` CHARACTER SET utf8;
```

### 3.6 修改列名name为username（CHANGE）。
```SQL
ALTER TABLE `employee` 
		CHANGE `name` `username` VARCHAR(32) NOT NULL DEFAULT '';
```
## 四、删除表
```SQL
DROP TABLE `employee`;
```