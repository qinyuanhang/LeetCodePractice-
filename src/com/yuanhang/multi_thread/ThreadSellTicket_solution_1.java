package com.yuanhang.multi_thread;

import sun.awt.Mutex;

/*
 *多个售票点，但是只有一个车票库，需要多线程同步来保证线程同步，安全 
 *这是解决这个问题的一种方法，就是同步代码块
 * 
 * */
public class ThreadSellTicket_solution_1 {
	
	public static void main(String[] arge){
		WindowSolution_1 window_solution_1 = new WindowSolution_1();
		/**
		 * 创建三个线程，把同一个runnable对象放进去，保证三个线程共享同一个runnable对象
		 * */
		new Thread(window_solution_1,"windows_1").start();
		new Thread(window_solution_1,"windows_2").start();	
		new Thread(window_solution_1,"windows_3").start();	
	}	
}
class WindowSolution_1 implements Runnable{
	private int ticket = 1;
	Object mutex = new Mutex();//这个是一个线程锁，其实没有什么意义，就是代表一个实体，能得到和释放，什么何以个实体都可以，也可以定义一个字符串来当这个锁，mutex是java自带的，规范	
	//String lock = new String("lock"); 我也可以定义一个字符串“lock”作为线程锁

	@Override
	public void run() {
		// TODO Auto-generated method stub				
		while(true){	
			
			//synchronized (lock) {     我如果定义一个字符串“lock”作为线程锁，也可以这样用。
			
			/**
			 * 下面就是同步代码块，用这个方法保证线程安全
			 * */
			synchronized (mutex) {
				if(ticket > 5000 ){
					System.out.println("sold out");
					return;
				}else{					
					System.out.println(Thread.currentThread().getName() + " sell #" + ticket++ + " tickets");
				}				
			}			
		}		
	}	
}
