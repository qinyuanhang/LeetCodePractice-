/*
 * 
 * Singleton is a most widely used design pattern. If a class has and only has one instance at every moment, 
 * we call this design as singleton. For example, for class Mouse (not a animal mouse), we should design it in singleton.
 * You job is to implement a getInstance method for given class, return the same instance of this class every time you call this method.
 * Example
 * In Java:
 * A a = A.getInstance();
 * A b = A.getInstance();
 * a should equal to b.
 * */
public class Singleton {
	
	private static Singleton singleton;
	
	 //构造方法让其private，这就堵死了外界利用new创建此类实例的可能// 
	private Singleton(){};
	
	/*Singleton类定义一个GetInstance()操作，允许客户访问它的唯一实例。GetInstance()是一个静态方法，主要负责创建自己的唯一实例。*/ 
	
	/*此方法是获得本类实例的唯一全局访问点。*/  
	public static Singleton getSingleton(){
		
	        // /*若实例不存在，则new一个新实例，否则返回已有实例*/  
		
		if(singleton == null){
			singleton = new Singleton();
		}		
		return singleton;
	};	
}
