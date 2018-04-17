package com.bst;

/**
 * author anand.
 * since on 3/4/18.
 */
public class LevelOrderPrint {

    public static void main(String args[]){
        BinarySearchTree binaryTree=new BinarySearchTree();
        binaryTree.insert(100);
        binaryTree.insert(50);
        binaryTree.insert(150);
        binaryTree.insert(12);
        binaryTree.insert(5);

        //binaryTree.print();

        binaryTree.levelOrder();
    }
}
