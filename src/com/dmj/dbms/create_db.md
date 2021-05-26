# 数据库的创建、删除、备份、恢复等操作
1、创建数据库
* CREATE DATABASE db_dmj;

2、删除数据库[**慎用**]

* DROP DATABASE db_dmj;

3、创建使用utf8字符集的数据库
* CREATE DATABASE db_dmj CHARACTER SET utf8;

4、创建使用utf8字符集，并带校验规则的数据库(校验规则：utf8_bin区分大小写，默认utf8_general_ci不区分大小写)
* CREATE DATABASE db_dmj CHARACTER SET utf8 COLLATE utf8_bin;

5、显示数据库语句[**注意还有个一个S**]

* SHOW DATABASES;

6、查看表结构

* DESC `user`;

7、显示数据库创建语句
* SHOW CREATE DATABASE db_dmj;

8、查看数据库表的定义语句
* SHOW CREATE TABLE `user`;

9、备份数据库[在**DOS**执行---C:\Users\meiji>]
mysqldump -u 用户名 -p -B 数据库1 数据库2 数据库n > d:\\文件名.sql (可以加入路径备份到哪儿)

* 例：mysqldump -u root -p -B db_dmj > d:\\bak.sql

10、备份数据库表
* mysqldump -u 用户名 -p 数据库 表1 表2 表n > d:\\文件名.sql (不要-B，否则会认为表1，表2，表n为数据库)

11、恢复数据库[在**MySQL**执行---mysql>]
source d:\\文件名.sql

* 例：source d:\\bak.sql

12、恢复数据库方式二：将备份中的内容语句全部复制到查询编辑器中执行