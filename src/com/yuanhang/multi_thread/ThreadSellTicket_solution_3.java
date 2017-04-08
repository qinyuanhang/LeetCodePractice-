package com.yuanhang.multi_thread;

import sun.awt.Mutex;


/**
 * 卖车票问题的第三种解决方法，用static修饰车票总数和 线程锁，继承Thread类的解法
 * 不建议使用这个方法。。。。。
 * */

public class ThreadSellTicket_solution_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowSolution_3 window_1 = new WindowSolution_3();
		WindowSolution_3 window_2 = new WindowSolution_3();
		WindowSolution_3 window_3 = new WindowSolution_3();
		
		window_1.setName("window_1");
		window_2.setName("window__2");
		window_3.setName("window___3");
		
		window_1.start();
		window_2.start();
		window_3.start();

	}

}


class WindowSolution_3 extends Thread{
	static int ticket = 1;   //定义一个静态的车票总数，由于是静态，即使是3个不同的进程，也能调用这个数字
	static Object mutex = new Mutex();//定义一个静态的线程锁，由于是静态，即使是3个不同的进程，也都是抢这一个锁，所以也是同步的。
	

		public void run() {
			while(true){
				
				synchronized (mutex) {
	
				if(ticket > 1000){
					System.out.println(Thread.currentThread().getName()+" sold out!!!!");
					return;
				}				
				System.out.println(Thread.currentThread().getName()+" sell # "+ ticket++ +" ticket!!");
				
				}
			}
			
		}

}