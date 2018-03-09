package com.priya.linkedlist.DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList llist = new LinkedList();
        llist.head = llist.SortedInsert(llist.head,6);
        llist.head = llist.SortedInsert(llist.head,2);
        llist.head = llist.SortedInsert(llist.head,3);
        llist.head = llist.Reverse(llist.head);
        System.out.println("Printing");
        llist.printList();

    }
}
