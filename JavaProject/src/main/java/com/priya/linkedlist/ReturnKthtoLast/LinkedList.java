package com.priya.linkedlist.ReturnKthtoLast;

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
    
    // return Kth node from the Last node of the LinkedList
    // Use 2 pointers to find the Kth node from the tail node
    public Node returnkth(int position) {
        Node p1 = head;
        Node p2 = head;
        for(int index=1; index < position; index++) {
            if(p1.next != null) {
                p1 = p1.next;
            } else {
                return null;
            }
        }
        while(p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
    // Cannot return both index and Node details by normal method
    // Using wrapper method to return Index along with the node details
    public Node printKt(Node head, int position) {
        Index idx = new Index();
        return printKt(head,position,idx);
    }

    public Node printKt(Node head, int position,Index idx) {
        if(head == null) {
            return null;
        }
        Node current = printKt(head.next,position,idx);
        idx.value = idx.value + 1;

        if(idx.value == position) {
            return head;
        }
        return current;
    }
    // Recursive calling of the method to find the tail and then
    // calculate the index value. Compare it with K value
    public int printKth(Node head, int position) {
        if( head == null) {
            return 0;
        }
        int index = printKth(head.next, position) +1;
        if(index == position) {
            System.out.println(position + " from Last in LinkedList " + head.data);
        }
        return index;
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
