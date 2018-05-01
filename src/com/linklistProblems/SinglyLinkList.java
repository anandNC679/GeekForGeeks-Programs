package com.linklistProblems;

import java.util.*;

/**
 * author anand.
 * since on 12/4/18.
 */
public class SinglyLinkList {

    Node head;


    class Node{
        int data ;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }


    public static void main(String args[]){

            SinglyLinkList llist=new SinglyLinkList();
            llist.push(20);
            llist.push(4);
            llist.push(15);
            llist.push(10);
            llist.push(46);
            llist.push(34);
            llist.print();
        System.out.println();
          //  Node rvcNode=llist.reverseList();
           // llist.print(rvcNode);
            
       // llist.head.next.next.next = llist.head;
        llist.head.next.next.next.next.next = llist.head.next.next;
        System.out.println();
            if(llist.detectLoop()){
                System.out.println("Loop present");
            }else {
                System.out.println("Loop not present:");
            }
            llist.detectLoopByIterative();
    }

    public void uniqueNodes() {
        Map<Integer,Integer> listMap = new HashMap<>();
        Node curr=head;
        while (curr!=null){
            if(listMap.containsKey(curr.data)){
                int num=listMap.get(curr.data);
                listMap.put(curr.data,num+1);
            }
            else
                listMap.put(curr.data,1);
            curr=curr.next;
        }

//        System.out.println();
//        for(Integer num:listMap.keySet() ){
//            System.out.print(num+" ");
//        }

        System.out.println();
        listMap.entrySet().stream()
                .forEach(pair->{
                    if(pair.getValue()==1){
                        System.out.print(pair.getKey()+" ");
                    }
                });
    }

    //iterative
    public boolean checkListSortedOrNot() {
       // Node temp=head;

        for(Node temp=head;temp.next!=null;temp=temp.next){
            if(temp.data<temp.next.data){
                return false;
            }
        }
        return true;
    }

    public boolean checkListSortedOrNotRec(Node temp){

        if (temp==null || temp.next==null)
            return true;
        return (temp.data > temp.next.data && checkListSortedOrNotRec(temp.next));

    }

    public void deleteAllNodeFromListGreaterThenKey(int i) {
        Node temp=head;
        Node prev=null;

        while (temp!=null && temp.data>i){
            head=temp.next;
            temp=head;
        }

        while (temp!=null){
            while (temp!=null && temp.data<=i){
                prev=temp;
                temp=temp.next;
            }
            if (temp==null)
                return;
            prev.next=temp.next;
            temp=prev.next;
        }
    }
    public void deleteAllKey(int key) {
        Node temp=head;
        Node prev=null;
        while (temp!=null && temp.data==key){
            head=temp.next;
            temp=head;
        }

        while (temp!=null){
            while (temp!=null && temp.data!=key){
                prev=temp;
                temp=temp.next;
            }
            if (temp==null)
                return;
            prev.next=temp.next;
            temp=prev.next;
        }
    }

    public void print1(Node rvcNode) {
        if(rvcNode==null)
            return;
        while (rvcNode!=null){
            System.out.print(rvcNode.data+" ");
            rvcNode=rvcNode.next;
        }
    }

    private Node reverseList() {
        Node curr_p,prev_p,next_p;
        curr_p=head;
        prev_p= null;
        next_p= null;
        while (curr_p!=null){
            next_p=curr_p.next;
            curr_p.next=prev_p;
            prev_p=curr_p;
            curr_p=next_p;
        }
        return prev_p;

    }


    private boolean detectLoopByIterative(){

        Node fast_p=head,slow_p=head;
        while (slow_p!=null && fast_p!=null && fast_p.next!=null){
            slow_p=slow_p.next;
            fast_p=fast_p.next.next;
            if(slow_p==fast_p){
                System.out.println("found loop");
                return true;
            }
        }

        return false;
    }
    private  boolean detectLoop() {
        Node curr = head;
        HashSet<Node> set=new LinkedHashSet<>();
        while (curr!=null){
            if(set.contains(curr))
                return true;
            set.add(curr);
            curr=curr.next;
        }
        return false;
    }


    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void print() {
        Node curr=head;
        if (curr==null) {
            System.out.println("List is empty:");
            return;
        }
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
