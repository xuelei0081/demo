package com.demo.controller;

import java.util.*;

/**
 * leetcode算法题
 */
public class LeetCode {

    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if(s==null){
            return 0;
        }
        if(s.length()<2){
            return  s.length();
        }
        int flag = 0;
        // 先查找一个字符串所有的子串
        Map<String,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){
                map.put(s.substring(i,j),j-i);
            }
        }

        for(String key : map.keySet()){

        }


        List<String> list = new ArrayList<>();
        // 再找出没有重复的子串
        List<String> dList = new ArrayList<>();
        for(String content : list){
            char[] chars = content.toCharArray();
            Set<Character> set = new LinkedHashSet<>();
            for(char ch : chars){
                set.add(ch);
            }
            if(set.size() == chars.length){
                dList.add(content);
            }
        }



        // 找出不重复子串中最大的
        for(String string : dList){
            if(string.length() > flag){
                flag = string.length();
            }
        }

        return flag;
    }


}
