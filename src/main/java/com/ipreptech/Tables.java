package com.ipreptech;

public class Tables {
    public void tables(int n,int k){
        for (int i = 1; i <= n; i++){
            for (int j =1; j <=k;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    }
}
