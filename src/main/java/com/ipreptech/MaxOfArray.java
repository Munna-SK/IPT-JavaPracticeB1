package com.ipreptech;

public class MaxOfArray {
    public static void ArrayMax(){
        int [] array = {32,52,64,89,12,42,71,23};
        int max = 0;
       for (int i = 1;i < 8;i++){
          if (max < array[i]){
           max =array[i];
          }
       }
        System.out.println(max);
    }
}