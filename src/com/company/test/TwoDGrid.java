package com.company.test;

import java.util.Scanner;

public class TwoDGrid {
    static int []x={-1,-1,-1,0,0,1,1,1};
    static int []y={-1,0,1,-1,1,-1,0,1};
    public static boolean search2D(char[][]grid,int row,int col,String word,int gridRow,int gridCol){
        if(grid[row][col]!=word.charAt(0)){
            return false;
        }
        int len=word.length();
        for(int dir=0;dir<8;dir++){
            int k,rd=row+x[dir],cd=col+y[dir];
            for(k=1;k<len;k++){
                if(rd>=gridRow||rd<0||cd>=gridCol||cd<0){
                    break;
                }
                if(grid[rd][cd]!=word.charAt(k)){
                    break;
                }
                rd+=x[dir];
                cd+=y[dir];
            }
            if(k==len){
                return true;
            }
        }
        return false;
    }
    public static void patternSearch(char [][]grid,String word,int gridRow,int gridCol){
        for(int row=0;row<gridRow;row++){
            for(int col=0;col<gridCol;col++){
                if(search2D(grid,row,col,word,gridRow,gridCol)){
                    System.out.println("pattern found at:"+row+","+col);
                }
            }
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the no.of cols:");
        int col = sc.nextInt();
        char[][] grid = new char[row][col];
        System.out.println("enter the grid elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        } System.out.println("Enter the word:");
        String word = sc.next();
        patternSearch(grid,word,row,col);
    }
}
