# 数据库的增删改查操作（CRUD）

创建一张商品表goods(id int  ,  goods_name varchar(10) , price double);
```SQL
CREATE TABLE `goods`(
		id INT,
		`goods_name` VARCHAR(10),
		`price` DOUBLE
		)CHARACTER SET utf8 COLLATE utf8_bin ENGINE INNODB;
```

使用之前学习的员工表emp。
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

## 一、Insert(添加)数据
#### 1.1 例子
```SQL
INSERT INTO `goods` (id, `goods_name`, `price`) VALUES(1,'苹果手机',4000);
```
#### 1.2 注意事项
- 插入的数据应与字段的数据类型相同；
- 数据的长度应在列规定的范围内；
- 在values中列出的数据位置必须与被加入的列的排列位置相对应；
- 字符和日期类型数据应包含在单引号中；
- 列可以插入空值（前提是该字段允许为空）；
- insert into 表名 (列名...) values (), (), ();形式添加多条数据；
```SQL
INSERT INTO `goods` (id, `goods_name`, `price`) VALUES
		(4,'三星手机',2800),(5,'vivo手机',1500),(6,'oppo手机',1800);
```

- 如果是给表中的所有字段添加数据，可以不写前面的字段名称；
```SQL
INSERT INTO `goods` VALUES(3,'小米手机',1000);
```

- 默认值的使用，当不给某个字段赋值时，如果有默认值（默认为Null）就会添加，否则报错。
如果我们希望指定某一个列的默认值，可以在创建表时指定默认。
比如默认价格为100：price DOUBLE NOT NULL DEFAULT 100
```SQL
INSERT INTO `goods` (id, `goods_name`) VALUES(7,'诺基亚手机');
```

## 二、Update(更改)数据
#### 2.1 例子
将所有员工的薪水修改为5000
```SQL
UPDATE `emp` SET `salary` = 5000;
```

 将名字为孙悟空的员工薪水修改为8000
```SQL
UPDATE `emp` 
		SET `salary` = 8000 
		WHERE name = '孙悟空';
```

将名字为沙悟净的薪水在原来的基础上增加1000
```	SQL
UPDATE `emp` 
		SET `salary` = `salary` + 1000
		WHERE name = '沙悟净';
```

#### 2.2  注意事项
- update语法可以使用新值更新原有表行中的各列；
- set子句指示要修改哪些列和要给予哪些值；
- where子句指定应更新哪些行。如果没有where子句，则更新所有的行；
- 如果需要修改多个字段，可以通过set 字段1 = 值1，字段2 = 值2...。

## 三、Delete(删除)数据
#### 3.1 例子
删除名为猪八戒的记录
```SQL
DELETE FROM `emp` WHERE `name` = '猪八戒';
```

删除表中所有数据
```SQL
DELETE FROM `emp`;
```
####  3.2 注意事项
- 如果不使用where子句，则将删除表中所有数据；
- delete语句不能删除某一列的值（可使用uodate设为Null或者''）；
- 使用delete语句仅仅删除记录，并不删除表本身。若要删除表，可使用drop table 表名。

## 四、Select(查询)语句（重点 ! ! !）
### 4.1 单表查询
#### 4.1.1 基本语法
```SQL
SELECT [DISTINCT] * |{column1, column2, column3...}
		FROM tablename
		WHERE condition;
```

#### 4.1.2 注意事项
- SELECT指定查询哪些列的数据；
- column指定列名；
- ' * ' 代表查询所有；
- FROM指定查询哪一张表；
- WHERE指定查询条件；
- DISTINCT可选，指显示结果时，是否去掉重复数据。

#### 4.1.3 创建、查询表
```SQL
CREATE TABLE `student`(
		id INT NOT NULL DEFAULT 1,
		`name` VARCHAR(20) NOT NULL DEFAULT '',
		`chinese` FLOAT NOT NULL DEFAULT 0.0,
		`english` FLOAT NOT NULL DEFAULT 0.0,
		`math` FLOAT NOT NULL DEFAULT 0.0
		)CHARACTER SET utf8 COLLATE utf8_bin ENGINE INNODB;	
		
INSERT INTO `student`(id,`name`,`chinese`,`english`,`math`) VALUES (1,'吕布',89,78,90);
INSERT INTO `student`(id,`name`,`chinese`,`english`,`math`) VALUES (2,'张飞',67,98,56);
INSERT INTO `student`(id,`name`,`chinese`,`english`,`math`) VALUES (3,'刘备',87,78,77);
INSERT INTO `student`(id,`name`,`chinese`,`english`,`math`) VALUES (4,'关羽',88,98,90);
INSERT INTO `student`(id,`name`,`chinese`,`english`,`math`) VALUES (5,'赵云',82,84,67);
INSERT INTO `student`(id,`name`,`chinese`,`english`,`math`) VALUES (6,'曹操',55,85,45);
INSERT INTO `student`(id,`name`,`chinese`,`english`,`math`) VALUES (7,'黄忠',75,65,30);
INSERT INTO `student`(id,`name`,`chinese`,`english`,`math`) VALUES (8,'刘禅',72,63,60);
```

查询表中所有学生信息，并去掉重复数据
```SQL
SELECT DISTINCT * FROM `student`;
```
查询表中所有学生的姓名和英语成绩
```SQL
SELECT `name`,`english` FROM `student`;
```
统计每个学生的总分，并设置别名
```SQL
SELECT `name`, (chinese + english + math) AS total_score FROM `student`;
```
#### 4.1.4 WHERE子句中使用的运算符
（1）、比较运算符
- 大于、小于、大于（小于）等于、不等于；
- BETWEEN...AND...：显示在某一个区间的值；
- IN(set)：显示在in列表中的值，例如in(100，200)；
- LIKE、NOT LIKE：模糊查询
- IS NULL：判断是否为空。

（2）、逻辑运算符
- and：多个条件同时成立；
- or：多个条件任一成立；
- not：不成立。

查询名字为赵云的学生成绩
```SQL
SELECT * FROM student WHERE `name` = '赵云';
```
查询英语成绩大于90分的同学
```SQL
SELECT * FROM student WHERE english > 90;
```
查询总分大于200分的所有同学
```SQL
SELECT * FROM student WHERE (chinese + english +math) > 200;
```
查询math大于60并且chinese大于80的学生成绩

```SQL
SELECT * FROM student WHERE math > 60 AND chinese > 80;
```
查询英语成绩大于语文成绩的同学

```SQL
SELECT * FROM student WHERE english > chinese;
```
查询总分大于200，并且数学成绩小于语文成绩的刘姓同学
```SQL
SELECT * FROM student 
		WHERE (chinese + english +math) > 200 
		AND math < chinese 
		AND `name` LIKE '刘%';
```
查询英语分数在80到90之间的同学
```SQL
SELECT * FROM student WHERE english BETWEEN 80 AND 90;
```

查询数学分数为67，77，90的同学

```SQL
SELECT * FROM student WHERE math IN(67,77,90);
```

#### 4.1.5 ORDER BY子句排序查询
（1）、基本语法
```SQL
SELECT column1, column2, column3...
		FROM tablename
		ORDER BY column ASC | DESC;
```
（2）、注意事项
- ORDER BY指定排序的列，排序的列既可以是表中的列名，也可以是select语句后指定的列明；
- ASC升序（默认）， DESC降序；
- ORDER BY子句应位与SELECT语句的结尾。

（3）、例子
对数学成绩从低到高排序（升序）
```SQL
SELECT * FROM student ORDER BY math ASC;
```
对姓刘的学生总分成绩按高到低排序（降序）
```SQL
SELECT `name`, (chinese + english +math) AS total_score 
		FROM student 
		WHERE `name` LIKE '刘%'
		ORDER BY total_score DESC;
```



