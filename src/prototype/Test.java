package prototype;
/**
 * 
* @category ThingAndDeep
* @ClassName: Test
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wxl
* @date 2016年9月8日
*
 */
public class Test {
	/**
	 * 
	* @category 
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args    参数
	* @return void    返回类型
	* @throws
	 */
	public static void main(String[] args) {
		//产生一个对象
		ThingClone thing=new ThingClone();
		//设置一个值
		thing.setValue("张三");
		//拷贝一个对象
		ThingClone cloneThing =thing.clone();
		//设置一个值
		cloneThing.setValue("李四");
		//浅复制
		System.out.println(thing.getValue());//
		System.out.println(cloneThing.getValue());
		//
		DeepClone deep=new DeepClone();
		deep.setValue("王五");
		System.out.println(deep.getValue());
		
		DeepClone cloneDeep_1=deep.clone();
		cloneDeep_1.setValue("马六");
		//深复制
		System.out.println(cloneDeep_1.getValue());
		DeepClone cloneDeep_2=deep.clone();
		cloneDeep_2.setValue("马六");
		cloneDeep_2.setValue("zhaosi");
		System.out.println(cloneDeep_2.getValue());
		
	}
	
}
