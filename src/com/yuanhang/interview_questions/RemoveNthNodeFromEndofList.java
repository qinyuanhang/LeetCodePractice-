package com.yuanhang.interview_questions;

public class RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        ListNode preRemove = dummy;
        dummy.next = head;
        head = dummy;
        for(int i = 0; i < n + 1; i++){
            head = head.next;
        }
        
        while(head != null){
            head = head.next;
            preRemove = preRemove.next;
        }
        
        preRemove.next =  preRemove.next.next;
        return dummy.next;
    }
}
