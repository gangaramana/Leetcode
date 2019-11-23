package com.classCRT;

public class RecursiveArray {

    public static void main(String[] args) {
        RecursiveArray recursiveArray=new RecursiveArray();
        int [] ar={1,2,3,4,5,6,7,9,0};
        int x=recursiveArray.isAscending(ar,ar.length);
        System.out.println(x);

    }
    public int isAscending(int[] arr,int index){
//        System.out.println(index);
        if(index ==1){
            return 1;
        }
        return arr[index-1]<arr[index-2]?0:isAscending(arr,index-1);
    }

}
