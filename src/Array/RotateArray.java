package Array;


/**
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

这个没什么好说的，就是这个计算位置的时候要注意是取模不是取余，
还有就是 如果 用 int copy [] = nums;这个语法看似有了两个数组，其实只有一个，这叫浅表复制，也就是说nums变了，copy也会变
，要深度复制的话要用int copy [] = nums.clone(); 或者Syatem.arrayCopy;
*/

public class RotateArray {
	//方法1：用array.clone()；这个方法，深度复制
    public void rotate_1(int[] nums, int k) {
        int length = nums.length;
        if(length == 0) return;
        
        int [] copy = nums.clone();
        
        for(int i = 0; i < length; i++){
        	nums[(i + k) % length] = copy[i]; 
        }         
    }
    //方法二：in place， 前半段倒过来，后半段倒过来，最后全部再倒一遍
    public void rotate_2(int[] nums, int k){
    	 int length = nums.length;
         if(length == 0) return;
         
         k = k % length;
         rotate_2_helper(nums, 0,length - k - 1);
         rotate_2_helper(nums, length - k, length - 1);
         rotate_2_helper(nums, 0, length - 1);         
    }
    
    private void rotate_2_helper(int[] nums, int head, int end){
    	while(end > head){
    		int temp = nums[head];
    		nums[head] = nums[end];
    		nums[end] = temp;
    		head ++;
    		end--;   		
    	}   	
    }
    
    
}