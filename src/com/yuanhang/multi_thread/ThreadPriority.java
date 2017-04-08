package com.yuanhang.multi_thread;


/*
 *案例体现线程之间，优先级的比较，优先级不是绝对的优先，只不过是当前线程抢到CPU的机会大而已。
 *也有看不出效果的时候
 * */



class Thread_1 implements Runnable {
	@Override	
	public void run() {
		for(int i = 0; i < 100; i++)
			System.out.println(Thread.currentThread().getName());
	}
}



class Thread_2 implements Runnable {
	@Override	
	public void run() { 
		for(int i = 0; i < 100; i++)
			System.out.println(Thread.currentThread().getName());
	}
}

public class ThreadPriority {
	public static void main(String [] arge) {
		Thread first_thread = new Thread(new Thread_1(),"first");
		Thread seconde_thread = new Thread(new Thread_2(),"seconde_thread");
		
		/*
		 * 一般情况下任何线程被创建的时候，默认的优先级都是5，可以用下面的方法来设置优先级。
		 * +4 之后，他的优先级就是9了。代表它得到CPU资源的几率高了。但不是绝对的
		 * */
		first_thread.setPriority(Thread.NORM_PRIORITY + 4);
		first_thread.start();
		seconde_thread.start();
	}
}
