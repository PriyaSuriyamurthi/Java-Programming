package com.priya.arrayImp.SingleNumber;
//Every number appears twice except for one number in a given array.
//XOR operation
//1 XOR 1 = 0
//0 XOR 0 = 0
//1 XOR 0 = 1
public class Solution {
    public int singleNumber(int[] nums) {
        int finalOutput = 0;
        for(int n: nums) {
            finalOutput ^= n;
        }
        return finalOutput;
    }
    public static void main(String [] args) {
        Solution soln = new Solution();
        int arr[] = {1,2,4,2,1};
        System.out.println("Non Repetitive number is "+soln.singleNumber(arr));
    }
}