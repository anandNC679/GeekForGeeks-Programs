package com.linklistProblems;

import java.util.Stack;

/**
 * author anand.
 * since on 19/4/18.
 * Input:
 First List: 7->5->9->4->6  // represents number 64957
 Second List: 8->4 //  represents number 48
 Output
 Resultant list: 5->0->0->5->6  // represents number 65005
 */
public class AddTwoNumberUsingList {

    static Node head1,head2;
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public static void main(String args[]){
        AddTwoNumberUsingList list=new AddTwoNumberUsingList();
        list.head1=new Node(7);
        list.head1.next=new Node(5);
        list.head1.next.next=new Node(9);
        list.head1.next.next.next=new Node(4);
        list.head1.next.next.next.next=new Node(6);

        list.head2=new Node(8);
        list.head2.next=new Node(4);


        list.printList(head1);
        System.out.println();
        list.printList(head2);
        Node result=list.addTwoList(head1,head2);
        System.out.println("\n---------");
        list.printList(result);


    }

    private void printListRvc(Node head1) {
        Node prevNode=null,currNode=head1,nextNode=null;

        while (currNode!=null){
            nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        printList(prevNode);
    }

    private Node addTwoList(Node first, Node second) {

        Node res=null,prev=null,temp=null;
        int carry=0,sum;
        while (first!=null || second!=null){

            sum=carry+(first!=null?first.data:0)+(second!=null?second.data:0);
            carry=(sum>=10)?1:0;
            sum=sum%10;
            temp=new Node(sum);
            if(res==null)
                res=temp;
            else
                prev.next=temp;
            prev=temp;
            if (first!=null)
                first=first.next;
            if(second!=null)
                second=second.next;
        }
        if(carry>0)
            temp.next=new Node(carry);
        return res;

    }

    private void printList(Node head) {
       if(head==null)
           System.out.println("list is empty");
        Stack<Node> stack=new Stack<>();
        while (head!=null){
            stack.push(head);
            head=head.next;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop().data+" ");
        }
    }
}
