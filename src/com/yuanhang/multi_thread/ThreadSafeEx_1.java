package com.yuanhang.multi_thread;


public class ThreadSafeEx_1 {
    public static void main(String[] args){
        ThreadB b = new ThreadB();
        b.start();
   
        
        //我不知道为什么这里还要加一个synchronized？？？ run（）方法里面不是已近加过了吗？还要再加一次？？？
       synchronized(b){
            try{
               b.wait();       //其实这里可以用join（）也能实现，而且不需要第二个synchronized      
            }catch(InterruptedException e){
                e.printStackTrace();
            }
 
            System.out.println("Total is: " + b.total);
      }
        
    }
}
 
class ThreadB extends Thread{
     int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<100 ; i++){
                total += i;
            }
            notify();
       }
    }
}