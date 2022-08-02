package com.ipreptech;

public class InsertionSort {
    public static int [] Sorting(){
        int [] array = {5,4,3,11,9,2};
        for (int i = 0;i < 6;i++){
            int j = i-1;
            int key = array[i];
            for (;j >= 0&&array[j] > key; j--){
                array[j+1] = array[j];
            }
            array [j+1] = key;
        }
        for(int i = 0;i < 6;i++){
            System.out.print(array[i]+" ");
        }
        return array;
    }
}
