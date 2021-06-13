package com.dmj.data_type.string_type;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * String类常用方法
 */
public class Test1 {
    //字符串拆分
    /*
    split：.|\$+这些特殊符号都不能直接用，如果要用，需要加转义符\\
    StringTokenizer：.|\$+这些特殊符号都能直接用
     */
    @Test
    public void demo1(){
        String str1 = "Hello World";
        String[] result = str1.split(" ");//通过空格将str拆分为字符串数组
        //循环遍历数组
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        System.out.println("----------------分隔线--------------");

        String str2 = "Hello|World";//通过|分割
        StringTokenizer token = new StringTokenizer(str2,"|");//返回token对象，一开始会指向第一个元素的前一个
        //token.hasMoreElements()判断是否还有下一个元素，如果有返回true并指向下一个元素，没有就返回false。
        while (token.hasMoreElements()){
            System.out.println(token.nextElement());//nextElement取出当前元素
        }
    }

    //字符串替换
    /*
    replaceAll(String regex,String replacement)：全部替换
    replaceFirst(String regex,String replacement)：替换首个
     */
    @Test
    public void demo2(){
        String str = "www.dmj.cn";
        String rAll = str.replaceAll("w", "X");//将"w"全部替换为"X"
        System.out.println("替换全部："+rAll);
        System.out.println("----------------分隔线--------------");
        System.out.println("替换首个："+str.replaceFirst("w", "X")); //将第一个"w"替换为"X"
    }

    //字符串查找
    /*
    contains(String s)：判断子字符串是否存在
    indexOf(String str)：从头查找指定字符串的位置（根据字符找位置）
    indexOf(String str,int fromIndex)：从指定位置查找指定字符串的位置
    lastIndexOf(String str)：由后向前查找指定字符串的位置
    lastIndexOf(String str,int fromIndex)：从指定位置由后向前查找指定字符串的位置
    startsWith(String prefix)：判断是否以指定的字符串开头
    startsWith(String prefix,int toffset)：由指定位置判断是否以指定字符串开头
    endsWith(String suffix)：判断是否以指定的字符串结尾
     */
    @Test
    public void demo3(){
        String str = "**@@www.dmj.cn##";
        //判断子字符串是否存在
        System.out.println(str.contains("dmj"));  //true
        //查找指定字符串的位置
        System.out.println(str.indexOf("w"));  //4
        //由后向前查找指定字符串的位置
        System.out.println(str.lastIndexOf("w"));  //6
        //判断是否以指定的字符串开头
        System.out.println(str.startsWith("**"));  //true
        //判断由指定位置判断是否以指定字符串开头
        System.out.println(str.startsWith("@@",2));  //true
        //判断是否以指定的字符串"##"结尾
        System.out.println(str.endsWith("##"));  //true
    }

    //字符串比较
    /*
    equals(String anObject)：区分大小写的相等判断
    equalsIgnoreCase(String anotherString)：不区分大小写比较
    compareTo(String anotherString)：进行字符串大小比较，该方法返回一个int数据：大于、小于、等于。
    compareToIgnoreCase(String str)：不区分大小写进行字符串大小比较
     */
    @Test
    public void demo4(){
        String strA = "dmj";
        String strB = "Dmj";
        System.out.println(strA.compareTo(strB)); // 32
        System.out.println(strB.compareTo(strA)); // -32
        System.out.println("Hello".compareTo("Hello")); // 0
        //忽略大小写
        System.out.println(strA.compareToIgnoreCase(strB)); // 0
    }

    //其他方法
    /*
    isEmpty：判断是否为空字符串(不是null)
    length：计算字符串长度
    concat：连接字符串
    trim：去除左右的空格信息
    toUpperCase：转换成大写
    toLowerCase：转换成小写
    substring：字符串截取
     */
    @Test
    public void demo5(){
        String str = "Hello World";
        //判断是否为空，返回一个boolean类型
        System.out.println("是否为空："+str.isEmpty());
        System.out.println("----------------分隔线--------------");

        //计算长度
        int len = str.length();
        System.out.println("字符串长度="+len);
        System.out.println("----------------分隔线--------------");

        //字符串的连接
        String con = "www.".concat("dmj").concat(".cn");
        System.out.println("字符串连接："+con);
        System.out.println("----------------分隔线--------------");

        //去除左右的空格信息
        String str1 = " Hello World ";
        String trimStr = str1.trim();
        System.out.println("原来的字符串："+str1);
        System.out.println("去除左右空格："+trimStr);
        System.out.println("----------------分隔线--------------");

        //转大写
        String upperCase = str.toUpperCase();
        System.out.println("大写="+upperCase);
        System.out.println("----------------分隔线--------------");

        //转小写
        String lowerCase = str.toLowerCase();
        System.out.println("小写="+lowerCase);
        System.out.println("----------------分隔线--------------");

        String subStr = str.substring(3);
        System.out.println("从下标4截取："+subStr);//从下标3开始截取字符串
        System.out.println("从下标4到8截取："+str.substring(1,8));//截取下标为1-8的字符串
    }

    //其他方法
    /*
    String(char[] value)：将传入的全部字符数组变为字符串
    String(char[] value,int offset,int count)：将部分字符数组变为字符串
    char charAt(int index)：获取指定索引位置的字符(根据位置找字符)
    char[] toCharArray()：将字符串中的数据以字符数组的形式返回
     */
    @Test
    public void demo6(){
        String str = "hello world";
        char c = str.charAt(4); //charAt获取某一个指定索引位置的字符,从0开始
        System.out.println("指定索引位置的字符："+c); //输出"o"

        char[] result=str.toCharArray();//将String转为字符存入数组中
        String toCharArr = Arrays.toString(result);
        System.out.println("字符串中的数据以字符数组的形式："+toCharArr);

        for (int i = 0; i < result.length; i++) {
            result[i]-=32;//小写变大写，编码减少32
        }
        //将传入的全部字符数组变为字符串
        String newStr1 = new String(result);
        System.out.println("通过编码将全部字符数组变为字符串："+newStr1);

        //将部分字符数组变为字符串
        System.out.println("通过编码将部分字符数组变为字符串："+new String(result,0,5));
    }

    //统计字符串中某个字符出现的个数
    public static int demo7(String str, String x){
        int count = 0;
        while (str.indexOf(x) != -1){//helloworldhelloworld查询“l”的位置，如果指定的位置不存在则为-1
            count++;//指定的位置存在，次数加1
            //次数加1后，从指定位置+1后面截取保存到新的str中，即loworldhelloworld
            str = str.substring(str.indexOf(x) + 1);
        }//第二次则为oworldhelloworld，第三次dhelloworld，第四次loworld，第五次oworld，第六次d
        return count;
    }

    //StringBuffer的使用
    /*
    append：在后面拼接字符串
    insert：插入字符串
    reverse：首尾倒序
     */
    @Test
    public void demo8(){
        StringBuffer sb = new StringBuffer("mei");
        System.out.println("原来字符串："+sb);
        StringBuffer sb1 = sb.append("deng");//在后面加deng，相当于拼接
        System.out.println("append拼接："+sb1);
        StringBuffer sb2 = sb.insert(3, "jin");//在标记3的位置插入jin
        System.out.println("insert插入："+sb2);
        StringBuffer sb3 = sb.reverse();//首尾倒序字符串
        System.out.println("reverse首尾倒序："+sb3);

        //String与StringBuffer各自独立，可以进行相互转换
        String str1 = "meijindeng";
        StringBuffer sbStr = new StringBuffer(str1);//String-->StringBuffer
        String str2 = sbStr.toString();//StringBuffer-->String
        //String str3 = sbStr + "";//StringBuffer-->String也可以，任何类型遇到字符串都会转换为字符串（类型转换）
        System.out.println("String与StringBuffer的转换："+str2);
    }

    //案例：字符串数字输出从后往前数每三个插入一个逗号（0123456789-->0,123,456,789)

    public static void demo9(String digital){
        StringBuffer sb = new StringBuffer(digital);//将字符串转换为StringBuffer
        //开始位置：i为digital长度减3；条件：i到第0位结束，所以i>0；下一次位置是前一次减去3
        for (int i = digital.length()-3; i > 0; i=i-3) {
            sb.insert(i,",");//在第i个位置插入一个逗号
        }
        System.out.println(sb.toString());//再将StringBuffer转换为String
    }

    public static void main(String[] args) {
        int sum = demo7("helloworldhelloworld", "l");
        System.out.println("字符出现的个数："+sum);

        demo9("0123456789");
    }
}
