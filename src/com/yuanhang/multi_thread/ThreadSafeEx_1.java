package com.yuanhang.multi_thread;


public class ThreadSafeEx_1 {
    public static void main(String[] args){
        ThreadB b = new ThreadB();
        
        
        b.start();
        	
        //System.out.println("no-----synchronized = "+b.getTotal());
        for(int i = 0; i < 100; i++){
         	System.out.println("synchronized = "+b.total);
         }
    
        synchronized (b) {
        	
        	try {
				b.wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        	
        	 
		}

    }
}
 
class ThreadB extends Thread{
      int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i = 0; i < 100 ; i++){
                total += i;              
            }
            notify();
       }
    }
    
    public int getTotal() {
    	int result;
    	synchronized (this) {
			result = this.total;
			notify();
		}
    	
    	return result;
    }
}


