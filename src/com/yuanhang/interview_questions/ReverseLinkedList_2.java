package com.yuanhang.interview_questions;

public class ReverseLinkedList_2 {
	/*方法1：
	 * 弄一个 arr 把node装在里面, [1,2,3,4,5], 把m到n位置的的node换位置，再重从头穿起来， 返回arr[0].
	 * 这个方法太浪费空间。可以作为面试第一个方法。
	 */
	 public ListNode reverseBetween_array(ListNode head, int m , int n) {
	        // write your code
	        int length = 0;
	        ListNode dummy = head;
	        while(dummy != null){
	            length++;
	            dummy = dummy.next;
	        }
	        
	        ListNode [] arr = new ListNode[length];
	        int i = 0;
	        
	        while(head != null){
	            arr[i] = head;
	            head = head.next;
	            i++;
	        }
	        
	        reverse(arr,  m, n);
	        ListNode cur = null;
	        for(int j = 0; j < arr.length; j++){
	            if(cur == null){
	                cur = arr[j];
	            }else{
	                cur.next = arr[j];
	                cur = cur.next;
	            }
	        }
	        return arr[0];
	    }
	    
	    public void reverse(ListNode[] arr, int m, int n){
	        int mp = m -1;
	        int np  = n - 1;
	        
	        while(np > mp){
	            ListNode temp = arr[mp];
	            arr[mp] = arr[np];
	            arr[np] = temp;
	            np--;
	            mp++;
	        }
	    }
	    
	   /*方法2：in place方法
	    * 
	    * 
	    * */
	    
	    public ListNode reverseBetween_inplace(ListNode head, int m , int n) {
	        if(n <= m || head == null){
	            return head;
	        }
	        
	        ListNode dummy = new ListNode(0);
	        dummy.next = head;
	        head = dummy;
	        //找到m,和m的前一个，记下来
	        
	        ListNode m_pre = head;
	        
	        for(int i = 1; i < m; i++){
	            m_pre = m_pre.next;
	        }
	        
	       
	        ListNode m_node = m_pre.next;
	        
	    
	        
	        
	        //通过m找到n这个点，
	        ListNode n_node = m_node;
	        ListNode temp_pre = null;
	        ListNode temp_next = n_node.next;
	   
	     
	        for(int j = 0; j < n - m; j++){
	            n_node.next = temp_pre;
	            temp_pre = n_node;
	            n_node = temp_next;
	            temp_next = n_node.next;
	        }
	        
	        //注意这一下
	        n_node.next = temp_pre;
	        
	        //把两个头重新整合一下
	        m_pre.next = n_node;
	        m_node.next = temp_next;
	        
	        
	        return dummy.next;
	  
	    }
	    
	

}
