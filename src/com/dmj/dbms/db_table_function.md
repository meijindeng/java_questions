# 数据库常用函数
## 一、聚合函数
###  1.1 count
- count返回行的总和。
#### 1.1.1 基本语法
```SQL
SELECT COUNT(*) | COUNT(列名) 
		FROM tablename 
		WHERE where_definition;
```
#### 1.1.2 例子
统计一个班级共有多少个学生
```SQL
SELECT COUNT(*) FROM student;
```
统计数学成绩大于80的学生有多少个
```SQL
SELECT COUNT(*) FROM student WHERE math > 80;
```
统计总分大于200的总人数
```SQL
SELECT COUNT(*) FROM student WHERE (chinese + english +math) > 200;
```

count(*)和coun (列)的区别：
- count(*)指的是返回满足条件的记录的行数。
- count(列)指的是统计满足条件的某列有多少个，但是会排除为null的情况。

### 1.2 sum
- sum函数返回满足where条件的行的和。

#### 1.2.1 基本语法
```SQL
SELECT SUM(列名){,SUM(列名)...} 
		FROM tablename 
		WHERE where_definition;
```
#### 1.2.2 例子
统计一个班的数学总成绩
```SQL
SELECT SUM(math) FROM student;
```
统计一个班的语文、英语、数学各科的总成绩
```SQL
SELECT SUM(chinese), SUM(english), SUM(math) FROM student;
```
统计一个班的语文、英语、数学的成绩总和
```SQL
SELECT SUM(chinese + english + math) FROM student;
```
统计一个班的语文成绩平均分
```SQL
SELECT SUM(chinese) / COUNT(*) AS chinese_avg FROM student;
```
#### 1.2.3 注意事项
- sum仅对数值起作用，否则没有意义；
- 对多列求和，“ , ”号不能少。

### 1.3 avg
- avg函数返回满足where条件的一列的平均值。
#### 1.3.1 基本语法
```SQL
SELECT AVG(列名) {,AVG(列名)...}
		FROM tablename
		WHERE where_definition;
```
#### 1.3.2 例子
求一个班的数学平均分
```SQL
SELECT AVG(math) FROM student;
```
求一个班的总分平均分
```SQL
SELECT AVG(chinese + english + math) FROM student;
```

### 1.4 max/min
- max/min函数返回满足where条件的一列的最大/最小值

#### 1.4.1 基本语法
```SQL
SELECT MAX(列名)
		FROM tablename 
		WHERE where_definition;
```
#### 1.4.2 例子
求一个班的最高分和最低分

```SQL
SELECT MAX(chinese + english + math), MIN(chinese + english + math) FROM student;
```

## 二、分组统计
- 在之前的学生表中增加一个年级classno列，对每个同学进行年级分组
### 2.1 group by
- 使用group by子句对列进行分组
#### 2.1.1 基本语法
```SQL
SELECT column1, culumn2, culumn3...
		FROM tablename
		GROUP BY column1, culumn2...;
```
#### 2.1.2 例子
显示每个年级的语文平均分和数学最高分
```SQL
SELECT classno, AVG(chinese), MAX(math) FROM student GROUP BY classno;
```
### 2.2 having
- 使用having子句对分组后的结果进行过滤
#### 2.2.1 基本语法
```SQL
SELECT column1, culumn2, culumn3...
		FROM tablename
		GROUP BY column HAVING...;
```
#### 2.2.2 例子
显示数学平均成绩低于80的年级和它的平均成绩
```SQL
SELECT classno, AVG(math) 
		FROM student 
		GROUP BY classno 
		HAVING AVG(math)<80;
```
## 三、字符串函数
- CHARSET(str)：返回字串字符集；
- CONCAT(string2[,...])：连接字串；
- INSTR(string , substring)：返回substring在string中出现的位置；
- UCASE(string2)：转换成大写；
- LCASE(string2)：转换成小写；
- LEFT(string2 , length)：从string2中的左边起取length个字符；
- LENGTH(string)：string长度；
- ......
## 四、数学函数
- ABS(num)：绝对值；
- BIN(decimal_number)：十进制转二进制；
- CEILING(number2)：向上取整，得到比num2大的最小整数；
- FLOOR(number2)：向下取整，得到比num2小的最大整数；
- FORMAT(number2, decimal_number)：保留小数位数；
- MOD(numerator , denominator)：求余；
- ......
## 五、日期函数
- CURRENT_DATE()：当前日期；
- CURRENT_TIME()：当前时间；
- CURRENT_TIMESTAMP()：当前时间戳；
- ......
## 六、加密函数
### 6.1 常用函数
- USER()：查询用户；
- DATABASE()：数据名称；
- MD5(str)：为字符串算出一个md5 32的字符串，（用户密码）加密；
- PASSWORD(str)：从原文密码str计算并返回密码字符串，通常用于对MySQL数据库的用户密码加密；
- ......
### 6.2 例子
```SQL
SELECT USER() FROM DUAL;

SELECT DATABASE();

SELECT MD5('123456') FROM DUAL;

SELECT PASSEORD('123456') FROM DUAL;
```
## 七、流程控制函数
### 7.1 常用函数
- IF(expr1, expr2, expr3)：如果expr1为true；则返回expr2，否则返回expr3；
- IFNULL(expr1, expr2)：如果expr1不为空，则返回expr1，否则返回expr2；
- SELECT CASE WHEN expr1 THEN expr2 WHEN expr3 THEN expr4 ELSE expr5 END：如果expr1为true，则返回expr2，如果expr3为true，则expr4，否则返回expr5。

### 7.2 例子
```SQL
SELECT IF(TRUE,'dmj','mjd') FROM DUAL;

SELECT IFNULL(NULL,'dmj') FROM DUAL;

SELECT CASE 
	WHEN FALSE THEN 'mjd'
	WHEN TRUE THEN 'mj'
	ELSE 'dmj' END;
```