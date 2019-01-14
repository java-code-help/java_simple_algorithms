package com.company;

import java.util.Arrays;

public class BubbleSort  {
    public static int[] bubbleSort(int arr[]) {
        //from 0 index to end of index
        for (int i = 0; i < arr.length; i++) {
            //comparing all digits
            for (int j = 0; j < arr.length-1; j++) {
                //if statement is true we swap digits
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{100, 74, 29, 90})));
    }
}
