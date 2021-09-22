package com.company.test;

import java.util.Scanner;

public class Palindrome {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        String number=sc.next();
        int num=number.charAt(0)-48;
        String newNum=number+num;
        System.out.println(newNum);
    }
}
