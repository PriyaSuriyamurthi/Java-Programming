package com.priya.linkedlist.DoublyLinkedList;


//Create a class LinkedList with various methods/functions
//like append, prepend, remove Duplicates, PrintKth
public class LinkedList {
    Node head;
    Node SortedInsert(Node head,int data) {
        Node current = new Node(data);
        if(head == null) {
            head = current;
            return head;
        }
        Node search = head;
        while(search != null) {
            if(search.data > current.data) {
                if(search.prev == null) {
                    current.next = search;
                    search.prev = current;
                    return current;
                } else {
                    search.prev.next = current;
                    current.prev = search.prev;
                    current.next = search;
                    search.prev = current;
                    break;
                }
            } else {
                if(search.next == null) {
                    search.next = current;
                    current.prev = search;
                    break;
                } else {
                    search = search.next;
                }
            }
        }
       /* while(head.prev != null) {
            head = head.prev;
        }*/
        return head;
    }

    Node Reverse(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node current = Reverse(head.next);
        head.next.next = head;
        head.prev = head.next;
        head.next = null;
        return current;

    }
    // Print the LinkedList
    public void printList(){
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}
