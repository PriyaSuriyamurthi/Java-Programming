package com.priya.stackqueue.StackImp;

public class Stack {
    private static class Node {
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public Node top;
    public Boolean isEmpty() {
        return top == null;
    }
    public int peek() {
        if(top != null) {
            return top.data;
        }
        return -1;
    }
    public void push(int data) {
        Node newItem = new Node(data);
        newItem.next = top;
        top = newItem;
    }
    public int pop() {
        if(top == null) {
            return -1;
        }
        int popItem = top.data;
        top = top.next;
        return popItem;
    }
    public void printStack(Node top) {
        System.out.println("Stack data are ");
        while(top != null) {
            System.out.println(top.data);
            top = top.next;
        }
    }
}
