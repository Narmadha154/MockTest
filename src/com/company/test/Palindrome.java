package com.company.test;

import java.util.Scanner;

public class Palindrome {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        String number=sc.next();
        String newNum=number;
        int num=0;
     /*   for(int i=number.length()-1;i>1;i--) {
            if(number.charAt(i)!=number.charAt(i-1)) {
                num = number.charAt(i-1) - 48;
                newNum += num;
            }
        }*/
        num = number.charAt(0) - 48;
        newNum += num;
        System.out.println(newNum);
    }
}
