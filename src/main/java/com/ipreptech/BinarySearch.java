package com.ipreptech;

public class BinarySearch {
    public static int Binary(int value) {
        int[] array = {10, 14, 24, 36, 53, 99};
        for (int i = 0; i < 6; i++) {
            int low = 0;
            int high = 5;
            for (; low <= high; ) {
                int mid = (low + high) / 2;
                if (array[mid] == value) {
                    return mid;
                } else if (array[mid] < value) {
                    low = mid + 1;
                } else high = mid - 1;
            }
        }
        return -1;
    }
    public void checking(int n){
        int a = Binary( n);
        if (a == -1){
            System.out.println("not found the value");
        }
        else
            System.out.println("found the value");

    }

}


