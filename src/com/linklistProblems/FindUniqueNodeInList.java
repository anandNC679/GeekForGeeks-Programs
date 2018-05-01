package com.linklistProblems;

/**
 * author anand.
 * since on 18/4/18.
 */
public class FindUniqueNodeInList {
    public static void main(String strs[]){

        SinglyLinkList llist=new SinglyLinkList();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
        llist.push(46);
        llist.push(16);
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(15);
        llist.push(10);
        llist.push(46);
        llist.push(34);
        llist.print();
        llist.uniqueNodes();

    }
}
