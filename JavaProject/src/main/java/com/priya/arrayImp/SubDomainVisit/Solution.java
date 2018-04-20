package com.priya.arrayImp.SubDomainVisit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> list = new HashMap<String, Integer>();
        for(int i=0;i<cpdomains.length;i++) {
            String[] newString = cpdomains[i].split(" ");
            String[] newValue = newString[1].split("\\.");
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
    }


    public static void main(String[] args) {
        Solution soln = new Solution();
        String [] newString ={"9001 discuss.leetcode.com"};
        List finalSoln = soln.subdomainVisits(newString);
        int listIndex = finalSoln.size();
        for(int i=0;i<listIndex;i++) {
            System.out.println(finalSoln.get(i));
        }
    }
}
