package com.yuanhang.multi_thread;

/**
 * 一共有多少个线程？？？这是一到面试题，
 * 调用.start()和直接用.run()的区别
 * 
 * .start（）有新线程产生
 * 世界调用.run（）没有新线程产生
 * */

class MyThread_A implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("现在的进程是："+Thread.currentThread().getName());
	}
	
}

class MyThread_B implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		new MyThread_A().run();
		new Thread(new MyThread_A(),"thread_2").run();
		new Thread(new MyThread_A(),"thread_3").start();
		
	}
	
}

public class HowManyThreads {
	public static void main(String[] arge){
		System.out.println(Thread.currentThread().getName());	
		new Thread(new MyThread_B(),"thread_1").start();
	
	}	
}
