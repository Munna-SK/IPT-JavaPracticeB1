package com.ipreptech;

public class MinOf3 {
    public int minOf3(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a+"Min");

            return (a);
        } else if (a > b && b < c) {
            System.out.println(b+"Min");

            return (b);
        }else {
            System.out.println(c + "Min");

            return (c);
        }
    }
}