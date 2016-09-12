package singleton;
/**
 * 
* @category 单例
* @ClassName: Singleton
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wxl
* @date 2016年9月8日
*
 */
public class Singleton {
	// 私有的构造方法 防止被实例化 
/*	private void singleton(){
	
	}
	 //使用一个内部类来实现单例 
	private static class singletionFactory{
		private static Singleton instance=new Singleton();
	}
	 //获取实例 
	private static Singleton getInstance(){
		return  singletionFactory.instance;
	}
	// 如果对象被用于序列化 ，可以保证对象在实例化 前后保持一致
	public Object readResolve(){
		return getInstance();
	}*/
	//*****************************************************//
	private static Singleton instance=new Singleton();
	// 私有的构造方法 防止被实例化 
	private void singleton(){
	
	}
	public synchronized static Singleton getInstance(){
		return  instance;
	}
	//*****************************************************//
	//测试用
	public void outInfo(){
		System.out.println("这是个单例");
	}
	
}


