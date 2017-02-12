package com.yuanhang.multi_thread;


/*
 * 线程之间的让步，yield（）方法。和之前sleep（）类似，都是让出当前CPU让其他线程先占用资源。
 * yield（）可以设置让步条件.
 * 
 * 可能结果：
 * 	thread_yield  29
	thread  27
	thread_yield stop at 30
	thread  28
	thread_yield  30
	thread  29
	thread  30
	thread  31
 * 
 * 他在设置条件：i==30 时，让步，让其他线程先用CPU，当CPU再次分配到他时，还是会继续执行 i== 30 这个地方。而不是跳过
 * 
 * */

class Thread_yield_1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {	
			if (i == 30) {
				System.out.println(Thread.currentThread().getName() + " stop at "+i);
				Thread.yield(); //让步出CPU，后面会从 i== 30 处继续进行。
			}
			System.out.println(Thread.currentThread().getName() + "  "+i);
		}		
	}	
}

class Thread_yield_2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {	
			System.out.println(Thread.currentThread().getName() + "  "+i);
		}		
	}	
}





public class ThreadYield {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Thread thread_1 = new Thread(new Thread_yield_1(),"thread_yield");
		Thread thread_2 = new Thread(new Thread_yield_2(),"thread");
				
		thread_1.start();
		thread_2.start();
	}

}
