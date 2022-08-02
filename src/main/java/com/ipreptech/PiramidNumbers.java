package com.ipreptech;

public class PiramidNumbers {
    public static void PiramidNum(int n){
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n-i;j++){
                System.out.print(" ");
            }
            for (int k = 1;k <= 2*i+1;k++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
