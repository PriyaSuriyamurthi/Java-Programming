package com.priya.linkedlist.LoopDetection;

public class Main {

    public static void main(String[] args) {
        LinkedList loopList = new LinkedList();
        Node a1 = new Node(10);
        loopList.head = a1;
        loopList.prepend(14);
        loopList.prepend(9);
        loopList.append(7);
        loopList.append(1);
        loopList.append(6);
       Node loopListHead = loopList.head;
        while(loopListHead.next != null) {
            loopListHead = loopListHead.next;
        }
        loopListHead.next = a1;
        System.out.println("Looping Node is "+loopList.loopDetection(loopList.head));
    }
}
