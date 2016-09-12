package prototype;

import java.util.ArrayList;
/**
 * 
* @category 浅拷贝
* @ClassName: Thing
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wxl
* @date 2016年9月8日
*
 */
public class ThingClone implements Cloneable{
	// 定义一个私有变量
	private ArrayList<String> arrayList = new ArrayList<String>();
	public ThingClone(){
		System.out.println("构造函数被执行了...");
		}

	@Override
	public ThingClone clone() {
		ThingClone thing = null;
		System.out.println("this is thing");
		try {
			thing = (ThingClone) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return thing;
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
