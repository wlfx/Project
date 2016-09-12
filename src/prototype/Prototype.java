package prototype;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
* @category	原型模式
* @ClassName: Prototype
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wxl
* @date 2016年9月8日
*
 */
public class Prototype implements Cloneable ,Serializable{
    private static final long serialVersionUID = 1L;  
    private String string;
    private SerializableObject  obj;
 // 定义一个私有变量
 	private ArrayList<String> arrayList = new ArrayList<String>();
    /**
     * @throws CloneNotSupportedException 
    * @category 浅复制
    * @Title: clone
    * @Description: 将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
    * @param    参数
    * @return Object    返回类型
    * @throws
     */
	public Object clone() throws CloneNotSupportedException {
		  Prototype prototype=(Prototype)super.clone();
		  return prototype;
	}
	/**
	 * 
	* @category 深复制
	* @Title: deepClone
	* @Description: 将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
	* @throws IOException
	* @throws ClassNotFoundException    参数
	* @return Object    返回类型
	* @throws
	 */
	public Object deepClone() throws IOException, ClassNotFoundException {
		/*写当前二进制数据流*/
		ByteArrayOutputStream 	bos =	new ByteArrayOutputStream();
		ObjectOutputStream 		oos =  	new ObjectOutputStream(bos);
		oos.writeObject(this);
		/*读当前二进制数据流*/
		ByteArrayInputStream 	bis =	new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream  		ois = 	new ObjectInputStream(bis);
		return ois.readObject();
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public SerializableObject getObj() {
		return obj;
	}
	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}
	
	// 设置HashMap的值
	public void setValue(String value) {
		this.arrayList.add(value);
	}

	// 取得arrayList的值
	public ArrayList<String> getValue() {
		return this.arrayList;
	}
	

}

class SerializableObject implements Serializable{
	private static final long serialVersionUID = 1L;  
}


