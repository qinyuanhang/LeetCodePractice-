package com.yuanhang.interview_questions;




public class ReverseLinkedList {
	public void reverLinkedList(ListNode head){
		ListNode preListNode = null;
		ListNode nextListNode = null;
		
		while(head != null){
			nextListNode = head.next;
			head.next = preListNode;
			preListNode = head;
			head = nextListNode;
		}		
	}
}
