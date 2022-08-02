package com.ipreptech;

public class AdditionOfArray {
    public static void AdditionArray(){
        int [] array ={5,2,78,24};
        int sum = 0;
        for (int i = 0;i < 4;i++){
            sum = array[i]+sum;
        }
        System.out.println(sum);
    }

}
