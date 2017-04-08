package com.yuanhang.multi_thread;

//import com.sun.org.apache.bcel.internal.generic.NEW;



/*
 * 线程睡眠的例子，
 * 
 * 线程睡眠就是说让出当前CPU资源，让其他线程先运行，自己进入睡眠状态，
 * 这一点和 wait（）方法很相似，都是让出CPU资源，让别的线程先运行。 
 * */

class Thread_sleep_1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 100; i++) {	
			System.out.println(Thread.currentThread().getName());
			System.out.println(new java.util.Date().toString());
			System.out.print(Thread.currentThread().getName() + "start sleep for 4 second");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(new java.util.Date().toString() + "wake up!!!!");
		}
	}
}


class Thread_sleep_2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100; i++)
		System.out.println(Thread.currentThread().getName());
		//System.out.println(new java.util.Date().toString());
		//System.out.print(Thread.currentThread().getName() + "start sleep for 4 second");
		//System.out.println(new java.util.Date().toString() + "wake up!!!!");	
		
		System.out.println(Thread.currentThread().getName()+"  end!!!!!!!!");
	}
	
}


public class ThreadSleep {
	public static void main(String [] arge) {
		Thread thread_1 = new Thread(new Thread_sleep_1(),"first_thread");
		Thread thread_2 = new Thread(new Thread_sleep_2(),"222");
		
		
		thread_1.start();
		thread_2.start();	
	}
}
