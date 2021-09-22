package com.company.test;

import java.util.Scanner;

public class MergeSort {
    public static void mSort(int [] arr,int i,int j){
        if(i<j){
            int mid=(i+j)/2;
            mSort(arr,i,mid);
            mSort(arr,mid+1,j);
            merge(arr,i,mid,j);
        }
    }
    public static void merge(int [] arr,int beg,int mid,int end){
        int l=mid-beg+1;
        int r=end-mid;
        int [] leftArr=new int[l];
        int [] rightArr=new int[r];
        for(int i=0;i<l;i++){
            leftArr[i]=arr[beg+i];
        }
        for(int j=0;j<r;j++){
            rightArr[j]=arr[mid+j+1];
        }
        int i=0,j=0,k=beg;
        while(i<l&&j<r) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
            while(i < l) {
                arr[k]=leftArr[i];
                i++;
                k++;
            }
            while (j < r) {
                arr[k]=rightArr[j];
                j++;
                k++;
            }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        System.out.println("Enter the elements");
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        mSort(arr,0,size-1);
        System.out.println("sorted arr:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+"\t");
        }
    }
}
