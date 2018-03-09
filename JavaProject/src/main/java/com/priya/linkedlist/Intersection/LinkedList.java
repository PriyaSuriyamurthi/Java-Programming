package com.priya.linkedlist.Intersection;

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

    //Find the intersecting node from 2 linked list
    public Node intersectingNode(Node head1, Node head2) {
        Result tailLength1List = tailAndLengthOfLinkedList(head1);
        Result tailLength2List = tailAndLengthOfLinkedList(head2);
        if(tailLength1List.tail != tailLength2List.tail) {
            return null;
        }
        int length1List = tailLength1List.size;
        int length2List = tailLength2List.size;
        Node shorter = length1List < length2List ? head1 : head2;
        Node longer = length1List < length2List ? head2 : head1;
        longer = getKthNode(longer,(length1List-length2List));
        while(shorter != null && longer != null) {
            if(shorter == longer) {
                return shorter.next;
            }
            shorter = shorter.next;
            longer = longer.next;
        }
        return null;
    }
    //Fetch the size and last node of a given Linked List
    public Result tailAndLengthOfLinkedList(Node head) {
        int length = 1;
        while(head.next != null) {
            ++length;
            head = head.next;
        }
        Result result = new Result(length,head);
        return result;
    }
    //Move the linked list to the Kth position
    public Node getKthNode(Node head, int difference) {
        while(difference !=0 && head.next != null) {
            head = head.next;
            difference--;
        }
        return head;
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
