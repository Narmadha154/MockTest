package com.company.test;

import java.util.Scanner;

public class SubArr {
    public static int [] findPosition(int [] arr,int size,int sum) {
        int [] newArr=new int[2];
        int k=0;
        for (int i = 0; i < size; i++) {
            int newSum = 0;
            for (int j = i; j < size; j++) {
                newSum += arr[j];
                if (sum == newSum) {
                    newArr[k++]=i+1;
                    newArr[k++]=j+1;
                    return newArr;
                }
            }
        }
        return newArr;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        System.out.println("Enter the elements");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum");
        int sum = sc.nextInt();
        int [] posArr=findPosition(arr,size,sum);
        System.out.print("positions are:");
        for(int i=0;i<posArr.length;i++){
            System.out.print(posArr[i]+"\t");
        }
    }
}
