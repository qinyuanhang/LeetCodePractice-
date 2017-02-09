package Array;

//import com.sun.org.apache.xerces.internal.impl.dv.dtd.NMTOKENDatatypeValidator;

/*
 * Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.

Hint:

Try two pointers.
Did you use the property of "the order of elements can be changed"?
What happens when the elements to remove are rare?
 * */
public class RemoveElement {
	public int removeElement(int [] nums,int val){
		
		int length = nums.length;
		int count = 0;
		for(int i = 0; i < length; i++ ){
			if(nums[i] == val){
				count++;
			}else if(count > 0){
				nums[i - count] = nums[i];
			}		
		}		
		return length - count;
	}
}