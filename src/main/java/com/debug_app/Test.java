package com.debug_app;

public class Test {
    public static void main(String[] args) {
        System.out.println("Simple java program debug");
        int myarr[]={1,4,5,6,7};
        int sum =getSum(myarr);
        System.out.println("sum= "+sum);
    }
    public  static int getSum(int arr[]){
        int s=0;
        for (int i=0;i<arr.length;i++) {
            s = s + arr[i];
        }
        s=3+s;
        return s;
    }
}
