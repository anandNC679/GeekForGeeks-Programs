package com.linklistProblems;

/**
 * author anand.
 * since on 29/3/18.
 */

class Node{
    int data;
    Node prev,next;

    public Node(int data) {
        this.data = data;
        prev=next=null;
    }
}
public class DoublyLinklist {
    Node head;
    public static void main(String args[]){
        DoublyLinklist doublyLinklist=new DoublyLinklist();
        doublyLinklist.push(100);
        doublyLinklist.push(10);
        doublyLinklist.push(190);
        doublyLinklist.push(90);

        doublyLinklist.insertEnd(200);
        doublyLinklist.insertAfter(100,102);
        doublyLinklist.insertAfter(90,99);
        doublyLinklist.insertAfter(200,300);
        doublyLinklist.printList();

        doublyLinklist.reverseList();
        System.out.println();
        doublyLinklist.printList();

//        doublyLinklist.deleteNode(100);
//        System.out.println();
//        doublyLinklist.printList();
        doublyLinklist.deleteNode(90);
        System.out.println();
        doublyLinklist.printList();
    }

    private void deleteNode(int i) {
        Node curr=head;
        if(curr==null){
            return;
        }
        if(curr.data==i){
            head=curr.next;
            return;
        }
        while (curr.data!=i){
            curr=curr.next;
            break;
        }
        if(curr==null){
            System.out.println(i+" is not present");
        }
        curr.next.prev=curr.prev;
        curr.prev.next=curr.next;
    }

    private void reverseList() {
        Node curr=head;
        if(curr==null) {
            System.out.println("List is empty");
            return;
        }
        Node temp=null;
        while (curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }
        if(temp!=null)
            head=temp.prev;
    }

    private void insertAfter(int data,int nodeData) {
        Node curr=head;
        while (curr.data!=data){
            curr=curr.next;
        }
        if(curr==null){
            System.out.println(data+" node not present:");
            return;
        }
        Node newNode=new Node(nodeData);
        newNode.next=curr.next;
        newNode.prev=curr;
        if(curr.next!=null)
        curr.next.prev=newNode;
        curr.next=newNode;
    }

    private void insertEnd(int data) {
       Node newNode=new Node(data);
       if(head==null) {
           head = newNode;
           return;
       }
       Node last=head;
       while (last.next!=null)
           last=last.next;
       newNode.prev=last.next;
       last.next=newNode;
    }

    private void printList() {
        if(head==null)
            System.out.println("List is empty:");
        Node last=head;
        while (last!=null){
            System.out.print(last.data+" ");
            last=last.next;

        }
    }


    private void push(int data) {
        Node newNode=new Node(data);
        newNode.next=head;
        if(head!=null)
        head.prev=newNode;
        head=newNode;

    }

}
