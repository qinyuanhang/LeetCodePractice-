package com.yuanhang.interview_questions;

public class PartitionList {
	/**
	 * 弄两个list，一大一小，能保留原来的顺序
	 * */
	 public ListNode partition(ListNode head, int x) {		 
	        ListNode dummy = new ListNode(0);
	        dummy.next = head;
	        head = dummy;
	        
	        ListNode lessHead = new ListNode(0);
	        ListNode less = lessHead;
	        
	        while(head.next != null){
	            if(head.next.val < x){
	                ListNode temp = new ListNode(head.next.val);
	                less.next = temp;
	                less = less.next;
	                head.next = head.next.next;
	            }else{
	                head = head.next;
	            }
	        }
	        
	        less.next = dummy.next;	        
	        return lessHead.next;  
	    }
}
