# MySQL列（数据）类型

## 一、数值类型
### 1.1 位类型
- bit(M)：M指定位数，默认值为1，使用不是很多，按位显示，范围1-64.

### 1.2 整型
- tinyint：1个字节，有符号-128~127，无符号0~255；
- smallint：2个字节，有符号-2^15~2^15-1，无符号0~2^16-1；
- mediumint：3个字节，有符号-2^23~2^23-1，无符号0~2^24-1；
- **int**：4个字节，有符号-2^31~2^31-1，无符号0~2^32-1；
- bigint：8个字节，有符号-2^63~2^63-1，无符号0~2^64-1.

##### **注意**：
如果没有指定unsinged，则TINYINT就是有符号；指定unsinged，则TINYINT就是无符号。

### 1.3 小数类型
- float：单精度，4个字节；
- **double**：双精度，8个字节；
- **decimal[M,D]**：大小不定，取决于M与D，M指定长度(最大65)，D表示小数点的位数(最大30).

##### **建议**：
如果希望小数的精度高，推荐使用decimal。

## 二、文本(字符串)类型
- **char**：固定长度字符串，0-255，最大255字符；
- **varchar**：可变长度字符串，0-65535 (0~2^16-1)，最大65532字节(21844字符)；

##### **注意**：
varchar的utf8编码最大为21844字符，有1-3个字节用于记录大小，所以(65535-3)字节/3 = 21844字符。
若是GBK编码是2个字节表示1个字符，就要在65532的基础上除以2，所以(65535-3)字节/2 = 32766字符。

##### **使用细节**：
(1)、char(4)和varchar(4)中的4表示字符，而不是字节，不区分字符是汉字还是字母；
(2)、char(4)是定长的，就是说，即使插入'aa'，也会占用4个字符空间，而varchar(4)是可变的，会按照实际占用空间来分配；
(3)、如果数据定长使用char，例md5的密码，邮编，手机号；如果数据可变使用varchar，例留言，文章。查询速度char>varchar；
(4)、在存放文本时，也可以使用Text数据类型，可以将TEXT列视为VARCHAR列，注意Text不能有默认值；


- **text**：0-65535 (0~2^16-1)；
- longtext：0~2^32-1.

## 三、二进制数据类型 
- blob：0~2^16-1；
- longblob：0~2^32-1.

## 四、日期类型
- date：日期，年月日，3个字节；
- time：时间，时分秒，3个字节；
- **datetime**：日期和时间，年月日时分秒，8个字节；
- **timestamp**：时间戳，可以自动更新时间，4个字节；
- year：年，1个字节.
