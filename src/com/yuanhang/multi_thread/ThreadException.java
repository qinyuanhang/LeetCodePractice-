package com.yuanhang.multi_thread;

/**
 * 我们在用多线程的时候，常常需要处理异常，如：wait（） 和 sleep（）的时候；
 * 
 * 在这里处理异常，只能使用 try 。。。 catch（）
 * 是因为创建异常时，用的两种方法：
 * 1:
 * extends Thread 继承父类方法
 * 2：
 * implement runnable 实现接口方法
 * 
 * 继承父类方法要抛出异常，必须父类就有抛出异常，否则子类不能抛出异常。 也就是说父类 Thread 里面没有through异常，所以任何继承他的子类也不能through异常
 * 实现接口方法时，必须原抽象方法中就有through，否则任何实现接口方法也不能through异常， 也就是说 runnable这个抽象类没有through 异常，后来实现这个接口时也不能through异常
 * 
 * 都只能用 try 。。。。catch（）方法处理异常
 * 
 * 
 * */

public class ThreadException 
{

}
