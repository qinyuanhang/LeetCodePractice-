package com.yuanhang.interview_questions;

public class SwapNodesInPairs {
	
	public ListNode swapPairs(ListNode head) {
		
		if(head == null || head.next == null){
			return head.next;
		}
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		head = dummy;
		
		while(head.next != null && head.next.next != null){
			ListNode tempHead = head;
			head = head.next;
			tempHead.next = head.next;
			
			ListNode tempEnd = tempHead.next.next;
			tempHead.next.next = head;
			head.next = tempEnd;
		}
		return dummy.next;
    }
}
