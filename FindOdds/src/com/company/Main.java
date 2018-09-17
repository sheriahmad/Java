package com.company;

import java.util.*;

public class Main {

    public int data;
    public Main next;

    public void LinkedListNode(int data) {
        this.data = data;
    }

    public static void main(String[] args) {

        LinkedList<Integer> myList = new LinkedList<>();
        myList.addLast(1);
        myList.addLast(1);
        myList.addLast(2);
        myList.addLast(3);
        myList.addLast(4);
        myList.addLast(4);
        myList.addLast(1);

        System.out.println(myList);

        LinkedListNode head = LinkedListNode(myList.getFirst());
    }

    public static void deleteDuplicates(Main head) {
        Hashtable<Integer, Boolean> myTable = new Hashtable<Integer, Boolean>();

        LinkedListNode previous = null;
        while(head != null) {
            if(myTable.containsKey(head.data)) {
                previous.next = head.next;
            } else {
                myTable.put(head.data, true);
                previous = head;
            }
        }
    }

}
