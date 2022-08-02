package com.ipreptech;

public class MaxOf3 {
    public int maxOf3(int a,int b,int c){
        if (a <= c && b <= c){
            System.out.println(c+"MaxValue c");

            return (c);
        }
        else if (a <= b && c <= b){
            System.out.println(b+"MaxValue b");

            return (b);
        }
        else {
            System.out.println(a+"MaxValue a");

            return (a);
        }
    }
}
