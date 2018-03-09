package com.priya.stackqueue.QueueImp;

public class Main {
    public static void main(String []args) {
        Queue myQueue = new Queue();
        myQueue.addItem(8);
        myQueue.addItem(7);
        myQueue.addItem(6);
        myQueue.addItem(4);
        myQueue.addItem(9);
        myQueue.addItem(10);
        myQueue.printQueue(myQueue.first);
        myQueue.remove();
        myQueue.remove();
        myQueue.remove();
        myQueue.printQueue(myQueue.first);
    }
}
