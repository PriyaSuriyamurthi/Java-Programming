package com.priya.stackqueue.QueueImp;

public class Queue {
    private static class Node {
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public Node first;
    public Node last;

    public Boolean isEmpty() {
        return first == null;
    }
    public int peek() {
        if(first != null) {
            return first.data;
        }
        return -1;
    }
    public void addItem(int data) {
        Node newItem = new Node(data);
        if(last != null) {
             last.next = newItem;
        }
        last = newItem;
        if(first == null) {
            first = last;
        }
    }
    public int remove() {
        if(first == null) {
            return -1;
        }
        int returnItem = first.data;
        first = first.next;
        if(first == null) {
            last = first;
        }
        return returnItem;
    }
    public void printQueue(Node first) {
        System.out.println("Stack data are ");
        while(first != null) {
            System.out.println(first.data);
            first = first.next;
        }
    }
}
