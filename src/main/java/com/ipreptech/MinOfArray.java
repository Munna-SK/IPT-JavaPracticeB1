package com.ipreptech;

public class MinOfArray {
    public static void ArrayMin(){
        int [] array ={12,15,17,56,32,2,5,9,85,4};
        int min = array[0];
        for (int i = 0;i < 10;i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
