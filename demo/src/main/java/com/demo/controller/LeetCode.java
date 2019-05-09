package com.demo.controller;

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

        if(s.length()<=1)return s.length();
        int countMax=1;
        int count=1;
        int length = s.length();
        for(int i=1;i<length;i++){
            // 如果下一个字母和以前的不重复则连续的子串长度加1
            if(!s.substring(i-count, i).contains(s.substring(i,i+1))){
                count ++;
                // 记录最大子串长度
                countMax = countMax>count?countMax:count;
            }else{// 如果下一个字母包含在以前判断的子串中,则往前移动一位再进行判断,
                i --;
                count --;
            }
        }

        return countMax;
    }

    public static void main(String[] args) {
        LeetCode leetCode = new LeetCode();
        System.out.print(leetCode.lengthOfLongestSubstring("absad"));
    }
}
