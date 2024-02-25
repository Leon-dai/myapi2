package com.itheima.arraysdemo;

import java.util.Arrays;
import java.util.Comparator;

public class MyArraysDemo2 {
    public static void main(String[] args) {
        /*
            public static void sort(数组，排序规则) 按照指定的规则排序
            参数一：要排序的数组
            参数二：排序的规则
            细节：
                只能给引用数据类型的数组进行排序
                如果数组是基本数据类型的，需要变成其对应的包装类
         */

        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};
        //第二个参数是一个接口，所以我们在调用方法的时候，需要传递这个接口的实现类对象，作为排序的规则。
        //但是这个实现类，我只要使用一次，所以就没有必要单独的去写一个类，直接采取匿名内部类的方式就可以了

        //简单理解：
        //o1 - o2:升序排列
        //o2 - o1:降序排列
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(Arrays.toString(arr));

    }
}
