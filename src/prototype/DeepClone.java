package prototype;

import java.util.ArrayList;

public class DeepClone implements Cloneable {
	public DeepClone(){
		System.out.println("构造函数");
	}
	
	// 定义一个私有变量
	private ArrayList<String> arrayList = new ArrayList<String>();

	@Override
	public DeepClone clone() {
		DeepClone deep = null;
		try {
			arrayList.clear();
			System.out.println("this is clone");
			deep = (DeepClone) super.clone();
			
			deep.arrayList = (ArrayList<String>) deep.arrayList.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return deep;
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
