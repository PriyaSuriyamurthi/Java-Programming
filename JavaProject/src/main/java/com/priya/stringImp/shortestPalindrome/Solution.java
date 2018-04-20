package com.priya.stringImp.shortestPalindrome;

public class Solution {

    public String shortestPalindrome(String s) {
        StringBuilder sReverse = new StringBuilder(s);
        sReverse.reverse();
        String sNew = s + "#" + sReverse.toString();
        int [] position = new int[sNew.length()];
        int j=0, i=1;
        while(i< position.length) {
            if(sNew.charAt(i) == sNew.charAt(j)) {
                position[i] = j + 1;
                j++;
                i++;
            } else {
                j= j>0? position[j-1]:0;
                if((sNew.charAt(i) != sNew.charAt(j))) {
                    i++;
                    j= j>0? position[j-1]:0;
                }
            }
        }

        return new StringBuilder(s.substring(position[position.length-1])).reverse().toString()+s;
    }

    public static void main(String[] args) {
        Solution soln = new Solution();
        System.out.println("Shortest Palindrome "+soln.shortestPalindrome("aacecaaa"));

    }
}
