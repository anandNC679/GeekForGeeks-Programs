package com.array;

import java.util.Scanner;

/**
 * author anand.
 * since on 18/3/18.
 */
public class RankOfAnElement {
    static Scanner scanner;
    class BinaryNode{
        int data;
        BinaryNode leftNode;
        BinaryNode rightNode;
        int leftCount;
        public BinaryNode(int data){
            this.data=data;
            leftNode=null;
            rightNode=null;
            leftCount=0;

        }
    }

    public static void main(String args[]){
        RankOfAnElement rankOfAnElement=new RankOfAnElement();
        BinaryNode root=null;
        scanner=new Scanner(System.in);

        System.out.print("\nEnter length :-");
        int len=scanner.nextInt();
        System.out.print("\nEnter elements :-");
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<len;i++){
            root=rankOfAnElement.insertNodeToBinaryTree(root,arr[i]);
        }

        System.out.print("\nEnter x to find rank in stream:- ");
        int x=scanner.nextInt();

        System.out.println(rankOfAnElement.findRankOf_x(root,x));


    }

    private int findRankOf_x(BinaryNode root, int x) {

        if(root.data==x){
            return root.leftCount;
        }

        if(x<root.data){
            if(root.leftNode==null)
                return -1;
            else
                return findRankOf_x(root.leftNode,x);
        }
        else {
            if(root.rightNode==null)
                return -1;
            else
            {
                int rightCount=findRankOf_x(root.rightNode,x);
                return root.leftCount+1+rightCount;
            }
        }

    }

    private BinaryNode insertNodeToBinaryTree(BinaryNode root, int data) {

        if(root==null){
            return new BinaryNode(data);
        }
        if(data <= root.data){
            root.leftNode=insertNodeToBinaryTree(root.leftNode,data);
            root.leftCount++;
        }else {
            root.rightNode=insertNodeToBinaryTree(root.rightNode,data);
        }
        return root;
    }
}
