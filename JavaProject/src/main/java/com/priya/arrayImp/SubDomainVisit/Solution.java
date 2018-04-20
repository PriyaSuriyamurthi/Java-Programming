package com.priya.arrayImp.SubDomainVisit;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> list = new HashMap<String, Integer>();
        for(int i=0;i<cpdomains.length;i++) {
            String[] newString = cpdomains[i].split(" ");
            String[] newValue = newString[1].split("\\.");
            System.out.println("New Value is "+newValue.length);
            String current ="";
            int newCount = Integer.valueOf(newString[0]);
            for(int j=newValue.length-1;j>=0;j--) {
                current = newValue[j] + (j < newValue.length -1? ".":"") + current;
                list.put(current,list.getOrDefault(current,0)+newCount);
            }
        }
        List<String> finalList = new ArrayList();
        for (String dat: list.keySet()) {
            finalList.add("" + list.get(dat) + " " + dat);
        }
        return finalList;
    }*/

    public List<Integer> findAnagrams(String s, String t) {
        List<Integer> result = new ArrayList<Integer>();
        if(t.length()> s.length()) return result;

        int sLen = s.length();
        int tLen = t.length();
        char sArr[] = new char[256];
        char tArr[] = new char[256];
        for(int i=0;i<tLen;i++) {
            (sArr[s.charAt(i)])++;
            (tArr[t.charAt(i)])++;
        }
        for(int i=tLen; i< sLen;i++) {
            if(compare(sArr,tArr)) {
                result.add(i-tLen);
            }
            (sArr[s.charAt(i)])++;
            (sArr[s.charAt(i-tLen)])--;

        }
        if(compare(sArr,tArr)) {
            result.add(sLen-tLen);
        }
        return result;
    }
    public boolean compare(char []arr1,char []arr2) {
        for(int i=0;i< arr1.length;i++) {
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        Solution soln = new Solution();
        String [] newString ={"9001 discuss.leetcode.com"};
        List finalSoln = soln.findAnagrams("cbaebabacd","abc");
        int listIndex = finalSoln.size();
        for(int i=0;i<listIndex;i++) {
            System.out.println(finalSoln.get(i));
        }
        //soln.subdomainVisits(newString);
    }
}
