package com.yuanhang.multi_thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 多线程卖票问题第二种方法保证线程安全
 * AtomicInteger
 * 但是这个方打印出来的结果会有点问题
 * 例如：
window_1 sell # 998 ticket!
window_3 sell # 996 ticket!
window_1 sell # 1000 ticket!
window_3 sold out!!!
window_2 sell # 999 ticket!
window_1 sold out!!!
window_2 sold out!!!
 * 
 * */

public class ThreadSellTicket_solution_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WindowSolution_2 window = new WindowSolution_2();
		
		new Thread(window,"window_1").start();
		new Thread(window,"window_2").start();
		new Thread(window,"window_3").start();
	}

}


class WindowSolution_2 implements Runnable{
	
	
	AtomicInteger ticket = new AtomicInteger(1);//用这个方法把ticket弄成原子量，线程安全的
	public void run() {
		while(true){
			if(ticket.get() > 1000){
				System.out.println(Thread.currentThread().getName()+" sold out!!!");
				return;
			} 			
			System.out.println(Thread.currentThread().getName() + " sell # " + ticket.getAndAdd(1)+" ticket!");			
		}
	}
}