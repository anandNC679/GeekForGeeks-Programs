package com.bst;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * author anand.
 * since on 27/3/18.
 */

class Node{
    int data;
    Node left,right;

    public Node(int data) {
        this.data = data;
        left=right=null;
    }

}
public class BinarySearchTree {
    Node root;
    public BinarySearchTree() {
        root=null;
    }
    int MinValue=Integer.MIN_VALUE;
    int[] path=new int[20];


    public static void main(String args[]){
        BinarySearchTree binaryTree=new BinarySearchTree();
        binaryTree.insert(100);
        binaryTree.insert(50);
        binaryTree.insert(150);
        binaryTree.insert(12);
        binaryTree.insert(5);
        binaryTree.insert(35);
        binaryTree.insert(60);

        binaryTree.search(12);
        binaryTree.print();
    }

    private void search(int key) {
        searchRec(root,key);
    }

    private void searchRec(Node root, int key) {
    }

    public void print() {
        System.out.print("\nInOrder print: ");
        inOrder(root);

        System.out.print("\nInOrder without recursion print: ");
        inOrderIterative(root);

        System.out.print("\nPreOrder print: ");
        preOrder(root);
        System.out.print("\nPostOrder print: ");
        postOrder(root);

        System.out.print("\nPostOrder Iterative way print: ");
        postOrderIterative(root);

        System.out.print("\nLevelOrder print: ");
        levelOrder();

        System.out.print("\nReverse LevelOrder print: ");
        reverseLevelOrder(root);

        System.out.print("\nSpiral print: ");
        spiralPrinting(root);

        System.out.print("\nPrint all leaf node: ");
        printLeafNodes(root);

        System.out.print("\nFind Max data: ");
        findMaxNode(root);

        System.out.println("\nPrint all path: ");
        printAllPathOfLeaf(root,path,0);
    }

    private void postOrderIterative(Node root) {

        if(root==null)
            return;
        Stack<Node> stack1=new Stack<>();
        Stack<Node> stack2=new Stack<>();

        stack1.push(root);
        while (!stack1.isEmpty()){
            Node node=stack1.pop();
            stack2.push(node);

            if(node.left!=null)
                stack1.push(node.left);
            if(node.right!=null)
                stack1.push(node.right);
        }
        while (!stack2.isEmpty())
            System.out.print(stack2.pop().data+" ");
    }

    private void inOrderIterative(Node root) {

        if(root==null)
            return;
        Stack<Node> stack=new Stack<>();
        Node node=root;

        while (node!=null){
            stack.push(node);
            node=node.left;
        }

        while (stack.size()>0){
            node=stack.pop();
            System.out.print(node.data+" ");
            if(node.right!=null){
                node=node.right;
                while (node!=null){
                    stack.push(node);
                    node=node.left;
                }
            }

        }


    }

    private void printAllPathOfLeaf(Node root,int path[],int len) {
        if(root==null)
            return;

        path[len++]=root.data;
        if(root.left==null && root.right==null)
        {
            printPath(path,len);
            return;
        }
        printAllPathOfLeaf(root.left,path,len);
        printAllPathOfLeaf(root.right,path,len);

    }

    private void printPath(int[] path, int len) {
        for(int i=0;i<len;i++)
            System.out.print(path[i]+" ");
        System.out.println();
    }

    private void findMaxNode(Node root) {
        if(root==null)
            return;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        int max=MinValue;
        int secondMax=MinValue;
        while (!queue.isEmpty()){
            Node node=queue.poll();
            if(max<node.data){
                secondMax=max;
                max=node.data;
            }
            else if(secondMax<node.data){
                secondMax=node.data;
            }


            if(node.left!=null)
                queue.add(node.left);
            if(node.right!=null)
                queue.add(node.right);
        }
        System.out.print(max+" , second highest node: "+secondMax);

    }

    private void printLeafNodes(Node root) {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            System.out.print(root.data+" ");
        printLeafNodes(root.left);
        printLeafNodes(root.right);
    }

    private void reverseLevelOrder(Node root) {
        if(root==null)
            return;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        Stack<Node> stack=new Stack<>();
        while (!queue.isEmpty()){
            Node node=queue.poll();
            if(node.right!=null)
                queue.add(node.right);
            if(node.left!=null)
                queue.add(node.left);
            stack.push(node);
        }
        while (!stack.isEmpty())
            System.out.print(stack.pop().data+" ");
    }

    private void spiralPrinting(Node root) {
        if(root==null)
            return;
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        boolean flag=false;
        while (!stack.isEmpty()){
            Stack<Node> tempStack=new Stack<>();
            while (!stack.isEmpty()){
                Node node=stack.pop();
                System.out.print(node.data+" ");

                if(!flag){
                    if(node.left!=null){
                        tempStack.push(node.left);
                    }
                    if(node.right!=null){
                        tempStack.push(node.right);
                    }
                }
                else {
                    if(node.right!=null){
                        tempStack.push(node.right);
                    }
                    if(node.left!=null){
                        tempStack.push(node.left);
                    }
                }
            }
            flag=!flag;
            stack=tempStack;
        }
    }

    private void postOrder(Node root) {
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    private void inOrder(Node root) {
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

    }



    private void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void insert(int i) {
        root=insertRec(root,i);
    }

    private Node insertRec(Node root, int key) {
        if(root==null ) {
            root = new Node(key);
            return root;
        }
        if(key>root.data)
            root.right= insertRec(root.right,key);
        else
            if(key<root.data)
            root.left= insertRec(root.left,key);
        return root;
    }

    public void levelOrder() {
        levelOrderPrint(root);
    }

    private void levelOrderPrint(Node root) {
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tempMode=queue.poll();
            System.out.print(tempMode.data+" ");

            if (tempMode.left != null) {
                queue.add(tempMode.left);
            }

            if (tempMode.right != null) {
                queue.add(tempMode.right);
            }
        }
    }


}
