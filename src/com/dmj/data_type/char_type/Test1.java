package com.dmj.data_type.char_type;

/**
 * 题目：如何将小写字母快速的转换为大写字母
 */
public class Test1 {
    public static void main(String[] args) {
        // ^ :二进制按位异或，ascii表。
        // 97（a）二进制是0110 0001，32对应0010 0000异或结果为0100 0001，转换十进制为65（A）
        char letter1 = 'a';
        System.out.println((char)(letter1 ^ 32));

        char letter2 = 'b';
        System.out.println((char)(letter2 ^ 32));

        char letter3 = 'c';
        System.out.println((char)(letter3 ^ 32));
    }
}
