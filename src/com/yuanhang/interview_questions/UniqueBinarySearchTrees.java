/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3 
 * */

package com.yuanhang.interview_questions;



/**
 * 基本思路就是：
 * 比如 n=4， 就有：
 * 1， 左边一个node，右边两个node （两种情况相乘）
 * 2， 左边两个node，右边一个node
 * 3， 左边三个node，右边没有node
 * 4， 右边三个node，左边没有node
 * 上面四种情况加起来就是所有的可能组合。
 * 三个node的情况是：
 * 1， 左边一个node，右边一个node
 * 2， 左边两个node，右边一个node
 * 3， 右边两个node，左边没有node
 * 
 * 两个node的情况是：
 * 1，左边一个node，右边没有
 * 2，右边一个node，左边没有
 * 
 * 变成一个排列组合问题，
 * 
 * */
public class UniqueBinarySearchTrees {
	 public int numTrees(int n) {
	        
	        int[] res = new int [n + 1]; 
	        res[0] = 1;
	        res[1] = 1;
	        for(int i = 2; i <= n; i++){
	            for(int j = 0; j < i; j++){
	                res[i] += res[j] * res[i - j - 1];
	            }
	        }
	        return res[n];
	    }
}
