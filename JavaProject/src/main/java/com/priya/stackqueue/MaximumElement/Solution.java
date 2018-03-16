package com.priya.stackqueue.MaximumElement;


import java.util.*;
    
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Integer largestNbr = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> largestStack = new Stack<Integer>();
        largestStack.push(largestNbr);
        while (sc.hasNextInt())  {
            int value = sc.nextInt();
            if(value == 1) {
                Integer newValue = sc.nextInt();
                if(newValue >= largestStack.peek()) {
                    largestStack.push(newValue);
                }
                stack.push(newValue);
            } else if(value == 2) {
                Integer popValue = stack.pop();
                if(popValue == largestStack.peek()) {
                    largestStack.pop();
                }
            } else if(value == 3) {
                if(!largestStack.isEmpty()) {
                    System.out.println(largestStack.peek());
                }
            }
        }
        sc.close();
    }

}