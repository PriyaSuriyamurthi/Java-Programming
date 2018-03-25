package com.priya.arrayImp.DeleteOperation;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution soln = new Solution();
        String word1 = "a";
        String word2 = "";
        System.out.println("Length of " + soln.minDistance(word1, word2));
        word1 = "bb";
        word2 = "bbbbbbb";
        System.out.println("Count is " + soln.repeatedStringMatch(word1, word2));
        int widths[] = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String word[] = {"zocd","gjkl","hzqk","hzgq","gjkl"};
        int arra[] = soln.numberOfLines(widths, "abcdefghijklmnopqrstuvwxyz");
        System.out.println("array is");
        for (int i = 0; i < arra.length; i++) {
            System.out.println(arra[i]);
        }
        System.out.println("words are "+soln.uniqueMorseRepresentations(word));
    }

    public int minDistance(String word1, String word2) {
        String subword = "";
        int count = 0;
        if (((word1 == "") && (word2.length() == 1)) || ((word2 == "") && (word1.length() == 1))) {
            return 1;
        }
        for (int i = 0; i < word1.length(); i++) {
            subword = word1.substring(i, word1.length());
            count = i;
            int subIndex = word2.indexOf(subword);
            System.out.println("count before " + count);
            if (subIndex != -1) {
                count += word2.length() - subword.length();
                break;
            } else {
                count = 0;
            }
            System.out.println("count after " + count);
        }
        return count;
    }

    public int repeatedStringMatch(String A, String B) {
        int count = 1;
        StringBuilder S = new StringBuilder(A);
        for (; S.length() < B.length(); count++) {
            S.append(A);
        }
        if (S.indexOf(B) != -1) return count;
        if ((S.append(A)).indexOf(B) != -1) return count + 1;
        return -1;
    }


    public int[] numberOfLines(int[] widths, String S) {

        int asciiChar, count = 0, line = 1;
        for (char schar: S.toCharArray()) {
            asciiChar = widths[schar - 'a'];
            count += asciiChar;
            if ((100 - count) < 0) {
                line++;
                count = widths[asciiChar];
            }
        }
        return new int[]{line,count};

    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = { ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};
        int asciiChar =0;
        String morseRep;
        Set<String> seen = new HashSet();
        for(int i=0;i<words.length;i++) {
            morseRep= "";
            for(char c:words[i].toCharArray()) {
                asciiChar = c - 'a';
                morseRep += morse[asciiChar];
            }
            seen.add(morseRep);
            }
        return seen.size();
    }
}