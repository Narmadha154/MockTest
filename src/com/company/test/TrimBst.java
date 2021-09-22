package com.company.test;

import java.util.Scanner;

public class TrimBst {
    static class Node{
        int key;
        Node right,left;
        public Node(int data){
            key=data;
            left=right=null;
        }
    }
    Node root;
    public static Node insert(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        else{
            if(key<=root.key){
                root.left=insert(root.left,key);
            }
            else if(key>=root.key){
                root.right=insert(root.right,key);
            }
        }
        return root;
    }
    public static Node trim(Node root,int low,int high){
        if(root==null){
            return root;
        }
        if(root.key<=low){
            Node rChild=root.right;
            root=null;
            return rChild;
        }
        if(root.key>=high){
            Node lChild=root.left;
            root=null;
            return lChild;
        }
        return root;
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.key+"\t");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        TrimBst tree=new TrimBst();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of elements:");
        int num=sc.nextInt();
        Node root=null;
        System.out.println("Enter the elements");
        for(int i=0;i<num;i++){
            root=tree.insert(root,sc.nextInt());
        }
       System.out.println("Enter the lower range:");
        int low=sc.nextInt();
        System.out.println("Enter the higher range:");
        int high=sc.nextInt();
        root=trim(root,low,high);
        preOrder(root);
    }
}
