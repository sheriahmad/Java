package org.apache.commons.lang3.math.NumbersUtils;
import java.util.*;
import java.util.*;
/*
 *  Remove duplicates from an unsorted linked list
 */
public class LinkedListNode {
    public int data;
    public LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
    }
}

public class Task {
    public static void deleteDups(LinkedListNode head){
        Hashtable<Integer, Boolean> table=new Hashtable<Integer, Boolean>();
        LinkedListNode previous=null;
        //nth node is not null
        while(head!=null){
            //have duplicate
            if(table.containsKey(head.data)){
                //skip duplicate
                previous.next=head.next;
            }else{
                //put the element into hashtable
                table.put(head.data,true);
                //move to the next element
                previous=head;
            }
            //iterate
            head=head.next;
        }
    }
    public static void main (String args[]){
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(3);
        list.addLast(4);
        list.addLast(4);
        System.out.println(list);
        LinkedListNode head=new LinkedListNode(list.getFirst());
        Task.deleteDups(head);
        System.out.println(list);
    }
}