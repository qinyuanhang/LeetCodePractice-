package com.yuanhang.interview_questions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("verify challenge \"Rotated Array\"");
		RotateArray rotateArray = new RotateArray();
		int [] nums_1 = {1,2,3,4,5,6,7}; 
		int [] nums_2 = {1,2,3,4,5,6,7};
		rotateArray.rotate_2(nums_1, 3);
		for(int i : nums_1){
			System.out.print(i+" ");
		}
		System.out.println();
		
		rotateArray.rotate_1(nums_2, 3);
		for(int i : nums_2){
			System.out.print(i+" ");
		}
		System.out.print("\n\n");
		
		
		
		System.out.println("verify challenge \"merge sorted Array\"");
		MergeSortedArray mergeSortedArray = new MergeSortedArray();
		int [] num_1 = {1,2,3,8,0,0,0,0}; 
		int [] num_2 = {5,6,7};
		mergeSortedArray.merge(num_1, 4, num_2, 3);
		for(int i : num_1){
			System.out.print(i+" ");
		}
		System.out.print("\n\n");


	}

}
