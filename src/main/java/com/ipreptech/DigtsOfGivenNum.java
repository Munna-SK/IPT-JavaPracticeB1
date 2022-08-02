package com.ipreptech;

public class DigtsOfGivenNum {
    public void printDigtsOfGivenNumber(int n){
        int d;
        for (int i=1;n!=0;i++) {
            d=n%10;
            n=n/10;
            System.out.print(d);
        }

        System.out.println();
    }
}














