package com.priya.stackqueue.StackImp;

public class Main {
    public static void main(String []args) {
        Stack myStack = new Stack();
        myStack.push(8);
        myStack.push(7);
        myStack.push(6);
        myStack.push(4);
        myStack.push(9);
        myStack.push(10);
        myStack.printStack(myStack.top);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.printStack(myStack.top);
    }
}
