package com.company.test;

import java.util.Scanner;

public class check2D {
    public static void checkHorizontallyLeft(char [][]grid,String word,int row,int col){
        String newWord="";
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++) {
                newWord += grid[i][j];
                if (newWord.equals(word)) {
                    System.out.println("{" + i + "," + 0 + "}");
                    newWord="";
                }
            }
            newWord="";
        }
    }
    public static void checkHorizontallyRight(char [][]grid,String word,int row,int col){
        String newWord="";
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--) {
                newWord += grid[i][j];
                if (newWord.equals(word)) {
                    System.out.println("{" + i + "," + 0 + "}");
                    newWord="";
                }
            }
            newWord="";
        }
    }
    public static void checkVerticallyDown(char [][]grid,String word,int row,int col){
        String newWord="";
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++) {
                newWord += grid[j][i];
                if (newWord.equals(word)) {
                    System.out.println("{" + 0 + ","+i+"}");
                    newWord="";
                }
            }
            newWord="";
        }
    }
    public static void checkVerticallyUp(char [][]grid,String word,int row,int col){
        String newWord="";
        for(int i=col-1;i>=0;i--){
            for(int j=row-1;j>=0;j--) {
                newWord += grid[j][i];
                if (newWord.equals(word)) {
                    System.out.println("{" + 0 + ","+i+"}");
                    newWord="";
                }
            }
            newWord="";
        }
    }
    public static void checkLeftDownDiagonal(char [][]grid,String word,int row,int col){
        String newWord="";
        int l=0;
        for(int k=0;k<word.length();k++) {
            for (int i = l; i < col; i++) {
                newWord += grid[i][i];
                if (newWord.equals(word)) {
                    System.out.println("{" + l + "," + i + "}");
                    newWord = "";
                }
                newWord = "";
            }
            l++;
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int row=sc.nextInt();
        System.out.println("Enter the no.of cols:");
        int col=sc.nextInt();
        char [][] grid=new char[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                grid[i][j]=sc.next().charAt(0);
            }
        }
        System.out.println("Enter the word:");
        String word=sc.next();
        checkHorizontallyLeft(grid,word,row,col);
        checkHorizontallyRight(grid,word,row,col);
        checkVerticallyDown(grid,word,row,col);
        checkVerticallyUp(grid,word,row,col);
        checkLeftDownDiagonal(grid,word,row,col);
    }
}
