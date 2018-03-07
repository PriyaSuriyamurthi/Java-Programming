package com.priya.linkedlist.Palindrome;

public class Main {

    public static void main(String[] args) {
        LinkedList isPal = new LinkedList();
        isPal.append('M');
        isPal.append('A');
        isPal.append('L');
        isPal.append('A');
        isPal.append('Y');
        isPal.append('A');
        isPal.append('L');
        isPal.append('A');
        isPal.append('M');
        System.out.println("Is the Linked List Palindrome "+isPal.isPalindrome(isPal.head));
    }
}
