package com.dmj.loop.while_loop;

/**
 * 整数的翻转输出
 */
public class Test1 {
    public static void main(String[] args) {
        int num = 123456;
        //当前打印的值
        int rear = -1;
        num = num * 10;
        /*
         12345-->54321
         num = num * 10;乘以10与下面除以10抵消
         规律如下：
         //5
         num = num / 10; 除以10与上面乘以10抵消
         rear = num % 10;
         //4
         num = num / 10; //1234
         rear = num % 10;
         //3
         num = num / 10;//123
         rear = num % 10;
         ......
         */
        while (num / 10 > 0){ //开头乘以10，这里除以10，就可以取消掉最后一次出现的0
            num = num / 10;
            rear = num % 10;
            System.out.print(rear);//654321
        }
    }
}
