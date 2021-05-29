package com.dmj.arrays.one_dms;

/**
 * 求出一个数组int[]的最大值，并得到对应的下标
 */
public class Test4 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {4, 5, 85, 9, 8, 3, 24, 68,1, 38};
        //假定第一个元素为max
        int max = arr[0];
        int maxIndex = 0;
        //从maxIndex=1开始遍历
        for (int i = 1; i < arr.length; i++) {
            //如果max < 当前元素，说明max不是最大值，此时就让max=当前值
            if (max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("最大值max = " + max + "\t" +"下标maxIndex = " + maxIndex);
    }
}
