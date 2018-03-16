package com.priya.stackqueue.BalancedBrackets;

import java.util.Stack;

public class Solution {

    static String isBalanced(String s) {
        // Complete this function
        char charS[] = s.toCharArray();
        int charSLen = charS.length;
        Stack<Character> newStack = new Stack<Character>();
        int iter = 0;
        while(iter < charSLen) {
            if(!newStack.isEmpty()) {
                if(charS[iter] == '}') {
                    if(newStack.peek() =='{') {
                        newStack.pop();
                    } else {
                        return "NO";
                    }
                } else if(charS[iter] == ')') {
                    if(newStack.peek() =='(') {
                        newStack.pop();
                    } else {
                        return "NO";
                    }
                } else if(charS[iter] == ']' ) {
                    if(newStack.peek() =='[') {
                        newStack.pop();
                    } else {
                        return "NO";
                    }
                } else {
                    newStack.push(charS[iter]);
                }
            }  else {
                if(charS[iter] != '}' || charS[iter] != ']' || charS[iter] != ')'){
                    newStack.push(charS[iter]);
                } else {
                    return "NO";
                }
            }
            iter++;
        }
        if(newStack.isEmpty()) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
       /* Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){*/
            String s = "{{}(";//in.next();
            String result = isBalanced(s);
            System.out.println(result);
        /*}
        in.close();*/
    }
}
