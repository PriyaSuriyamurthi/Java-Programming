package com.priya.linkedlist.Partition;


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

    //Partition the linkedList based on the Partition Value.
    //Move all the data less than the Partition value to the
    //head and move the others to tail. This was done after
    //creating new LinkedList
    public LinkedList partitionLinkedList(int partitionVal) {
            Node current = head;
            LinkedList partitionList = new LinkedList();
            while(current != null) {
                if(current.data < partitionVal) {
                    partitionList.prepend(current.data);
                } else {
                    partitionList.append(current.data);
                }
                current = current.next;
            }
            return partitionList;
    }
    //Without creating new linkedlist, move the lesser value to
    //head and other values to tail
    public Node partition(Node node, int x) {
        Node head = node ;
        Node tail = node;

        /* Partition list */
        while (node != null) {
            Node next = node.next;
            if (node.data < x) {
                /* Insert node at head. */
                node.next = head;
                head = node;
            } else {
                /* Insert node at tail. */
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;

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
