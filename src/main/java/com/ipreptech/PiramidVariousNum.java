package com.ipreptech;

public class PiramidVariousNum {
    public static void PiramidVarious(int n){
        for (int i = 0;i < n;i++){
            for (int j = 1;j < n-i;j++){
                System.out.print(" ");
            }
            for (int k =i+1;k!=1;k--){
                System.out.print(k);
            }
            for (int k =1;k<=i+1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
