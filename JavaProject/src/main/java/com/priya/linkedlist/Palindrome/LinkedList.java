package com.priya.linkedlist.Palindrome;

//Create a class LinkedList with various methods/functions
//like append, prepend, remove Duplicates, PrintKth
public class LinkedList {
    Node head;
    //append method is used to add nodes to the end
    //of the linked List that is to the tail
    public void append(int data) {
        Node current = head;
        if(head == null) {
            head = new Node(data);
            return;
        }
        while(current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
        return;
    }
    //Prepend method is used to add nodes to
    //the head of the LinkedList
    public void prepend(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        } else {
            Node n1 = new Node(data);
            n1.next = head;
            head = n1;
            return;
        }
    }

    //Check if a LinkedList is Palindrome
    Node left;
    public Boolean isPalindrome(Node right) {
        left = head;
        if (right == null) {
            return true;
        }
        Boolean isPal = isPalindrome(right.next);
        if(isPal == false) {
            return false;
        }
        Boolean isPal1 = (left.data == right.data);
        left = left.next;
        return isPal1;
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
