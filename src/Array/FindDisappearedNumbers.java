package Array;

/*Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
*/
import java.util.*;


//基本思想：数组里面有数字5的话，位置4一定是被占的，所以4这个位置的数字变成负数，（表示被占有，也可以把这个数字还原成正数） 没有数字6的话，位置5一定没有被占有，所以这个位置的数字不会变成负数
//最后只要走一遍，找出所有正数的位置，位置+1就是确实的数字
public class FindDisappearedNumbers {
	//方法1：变负数，找正数位置法
	public List<Integer> findDisappearedNum(int [] nums){
		
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < nums.length; i++){
			int index = Math.abs(nums[i]) - 1;
			if(nums[index] > 0) nums[index] = -nums[index];
		}
		
		for(int i = 0; i < nums.length; i++){
			if(nums[i] < 0) result.add(i + 1);
		}
		
		return result;	
	}
	
}
