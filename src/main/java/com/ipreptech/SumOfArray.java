package com.ipreptech;

import java.util.Scanner;

public class SumOfArray {
    public int[] arr(){
        Scanner arr = new Scanner(System.in);
        int[] b=new int[5];
        int sum = 0;
        for (int i=0;i<b.length;++i){
            int d =arr.nextInt();
            b[i] = d;
        }
        sum = 1;
        for (int i=0;i<b.length;i++){
            sum = b[i]*sum;
        }System.out.println(sum);
        return b;
    }

}
