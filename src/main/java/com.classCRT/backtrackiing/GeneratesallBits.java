package com.classCRT.backtrackiing;

public class GeneratesallBits {
    int arr[] = new int[2];

    public static void main(String[] args) {
        GeneratesallBits bits=new GeneratesallBits();
        bits.binar(2);


    }

    public void binar(int n) {
        if (n < 1) {
            for(int i:arr) {
                System.out.print(i);
            }
            System.out.println();
        } else{
            arr[n-1]=0;
            binar(n-1);
            arr[n-1]=1;
            binar(n-1);
        }
    }
}