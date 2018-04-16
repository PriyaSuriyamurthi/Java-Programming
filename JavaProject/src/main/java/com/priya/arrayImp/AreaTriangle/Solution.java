package com.priya.arrayImp.AreaTriangle;

public class Solution {
    public double largestTriangleArea(int[][] points) {
        double area = 0;
        for(int [] i : points) {
            for(int [] j : points) {
                for(int [] k : points) {
                    area =  Math.max(area,0.5 * Math.abs(i[0] * j[1] + j[0] * k[1] + k[0] * i[1] - i[1] * j[0] - j[1] * k[0] - k[1] * i[0]));
                }
            }
        }
        return area;
    }
    public static void main(String[] args) {
        Solution soln = new Solution();
        int [][]newString ={{1,0},{0,0},{0,1}};
        System.out.println(soln.largestTriangleArea(newString));
        int [] nums = {3, 30, 34, 5, 9};
        System.out.println(soln.largestNumber(nums));
    }
    public String largestNumber(int[] nums) {
        String finalString="";
        int temp = 0;
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i] <10) {
                    if(nums[j] <10 && nums[i] < nums[j]) {
                        temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                    } else if(nums[j] >= 10) {
                        int length = String.valueOf(nums[j]).length();
                        int numsJ = (int)(nums[j]/((Math.pow(10,(length-1)))));
                        if( numsJ > nums[i]) {
                            temp = nums[j];
                            nums[j] = nums[i];
                            nums[i] = temp;
                        }
                    }
                } else {
                    if(nums[j] >= 10) {
                        long shortVal = Long.parseLong((nums[i] + "" + nums[j]));
                        long largeVal = Long.parseLong((nums[j] + "" + nums[i]));
                        if(shortVal < largeVal) {
                            temp = nums[j];
                            nums[j] = nums[i];
                            nums[i] = temp;
                        }
                    } else if(nums[j] < 10) {
                        int length = String.valueOf(nums[i]).length();
                        int numsI = (int)(nums[i]/((Math.pow(10,(length-1)))));
                        if(numsI < nums[j]) {
                            temp = nums[j];
                            nums[j] = nums[i];
                            nums[i] = temp;
                        }
                    }
                }
            }
        }
        for(int i=0;i<nums.length;i++)
            finalString += nums[i];
        return finalString;
    }

}
