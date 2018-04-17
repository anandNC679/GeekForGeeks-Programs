package com.linklistProblems;

/**
 * author anand.
 * since on 17/4/18.
 */
public class DeleteAllGivenKeyfronmList {
    public static void main(String args[]){
        SinglyLinkList list=new SinglyLinkList();

        list.push(20);
        list.push(40);
        list.push(48);
        list.push(100);
        list.push(200);
        list.push(500);


        list.print();
       // list.deleteAllKey(40);
//        System.out.println();
//        list.print();

        if(list.checkListSortedOrNotRec(list.head)){
            System.out.println("\nlist in an sorted order:");
        }
        else {
            System.out.println("\nlist is unsorted order:");
        }


        list.deleteAllNodeFromListGreaterThenKey(40);
        System.out.println();
        list.print();
    }
}
