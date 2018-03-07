package com.priya.linkedlist.Intersection;

public class Main {

    public static void main(String[] args) {
        LinkedList sum1 = new LinkedList();
        LinkedList sum2 = new LinkedList();
        sum1.prepend(7);
        Node a = new Node(10);
        a.next = sum1.head;
        sum1.head = a;
        sum1.prepend(1);
        sum1.prepend(6);
        sum1.printList();
        sum2.prepend(5);
        sum2.prepend(9);
        a.next = sum2.head;
        sum2.head = a;
        sum2.prepend(2);
        System.out.println("Sum2 ");
        sum2.printList();
        System.out.println("Intersecting Node is "+sum1.intersectingNode(sum1.head,sum2.head));
    }
}
