package com.yuanhang.multi_thread;


/*
 * join() 是阻塞当前线程，让调用线程获得CPU，当调用线程完成之后，再归还CPU
 *
 * */

class ThreadJoin_1 extends Thread{
	public void run(){
		for(int i = 0; i < 100; i++){
			System.out.println(Thread.currentThread().getName() + "is running "+ i);
		}
	}
}


class ThreadJoin_2 extends Thread{
	public void run(){
		for(int i = 0; i < 100; i++){
			System.out.println( "this one is running " + i);
		}
	}
}
/**
 * 这里一共有三个线程
 * */

public class ThreadJoin {
	
	public static void main(String[] arge){
		
		ThreadJoin_1 threadJoin_1 = new ThreadJoin_1();
		threadJoin_1.setName("hello_!");
		
		ThreadJoin_2 threadJoin_2 = new ThreadJoin_2();
		threadJoin_2.setName("abc____");
		
		threadJoin_1.start();
		threadJoin_2.start();
		
		for(int i =0; i < 100; i++){
			System.out.println("main is running "+ i);
		}
		
		
		try {
			System.out.println("--------------------------- joined");
			threadJoin_1.join();//  当threadjoin_1调用join（）这个方法时，他就阻塞了其他两个线程，他获得CPU，只有当他完成的时候，其他两个线程才有机会争取CPU
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
