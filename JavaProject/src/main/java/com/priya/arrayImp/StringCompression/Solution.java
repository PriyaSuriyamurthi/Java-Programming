package com.priya.arrayImp.StringCompression;

public class Solution {
    public static void main(String [] args) {
        Solution soln = new Solution();
        char arrayChar[] = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println("Length of "+soln.compress(arrayChar));
    }
    public int compress(char[] chars) {
        int count = 1,j=0;
        for(int i=0;i<chars.length;i++) {
            if((i == (chars.length-1)) || (chars[i] != chars[i + 1])){
                chars[j++] = chars[i];
                if(count > 1) {
                    if(count > 9) {
                        for(char c: ("" + count).toCharArray()) {
                            chars[j++] = c;
                        }
                    }
                    else {

                        chars[j++] = (char) (count + '0');
                    }
                }
                count = 1;
            } else {
                count++;
            }
        }
        return j;
    }
}