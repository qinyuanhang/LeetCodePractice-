package com.yuanhang.interview_questions;

public class RotateList {
	   public ListNode rotateRight(ListNode head, int k) {
	        
	        if(head == null){
	            return null;
	        }
	        if(k == 0){
	            return head;
	        }
	        
	        
	        ListNode dummy = new ListNode(0);
	        dummy.next = head;
	        ListNode end = dummy;
	        int length = 0;
	        while(end.next != null){
	            end = end.next;
	            length ++;
	        }
	        
	        k = length - k % length;
	        
	        ListNode newEnd = dummy;
	        
	        while(k > 0 && newEnd.next != null){
	            newEnd = newEnd.next;
	            k--;
	        }
	        
	        end.next = dummy.next;
	        ListNode toReturn = newEnd.next;
	        newEnd.next = null;
	       
	        return toReturn;
	    }
}
