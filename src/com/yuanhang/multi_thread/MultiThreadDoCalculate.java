package com.yuanhang.multi_thread;


/**
 * 这是一个用多线程计算（2+1）/（2*1）的面试题。
 * 建立两个线程，分别计算加法，乘法
 * 
 * 再利用一个  线程的方法   join（）
 * */

//这里是安全的，因为每个线程都有自己的stack，也没有方法能从外面改变value的值，local的变量是线程安全的
class Add extends Thread{
	
	int value = 0;
	
	public void run(){
		value = 1 + 2;
	}
	
}

class Multi extends Thread{
	int value = 0;
	
	public void run(){
		value = 2 * 1;
	}
}

public class MultiThreadDoCalculate{
	public static void main(String[] arge){
		Add add = new Add();
		Multi multi = new Multi();
		
		add.start();
		multi.start();
		
		//join（）是说，让parent线程（main线程） 等待调用join的线程（add和multi 两个线程） 结束之后再进行
		
		try {
			add.join();
			multi.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 double result = ((double)add.value/multi.value) ;
	 
	 System.out.println(result);
	}
}