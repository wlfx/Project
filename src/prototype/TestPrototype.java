package prototype;

import java.io.IOException;

/**
 * 
* @category Prototype
* @ClassName: TestPrototype
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wxl
* @date 2016年9月8日
*
 */
public class TestPrototype {
	
	/**
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * 
	* @category 
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @param @throws CloneNotSupportedException    参数
	* @return void    返回类型
	* @throws
	 */
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		//创建一个对象
		Prototype prototype=new Prototype();
		//设置一个值
		prototype.setValue("123");
		prototype.setString("789");
		
		//生产一个对象
		Prototype prototype2= (Prototype) prototype.clone();
		//设置一个值
		prototype2.setValue("456");
		prototype2.setString("012");
		System.out.println(prototype.getValue());
		System.out.println(prototype2.getString());
		//prototype.deepClone();
	}

}
