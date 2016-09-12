package adapter.objectadapter;



import adapter.classadapter.*;
/**
 * 
* @category 对象适配器
* @ClassName: Wrapper
* @Description: 当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，
* 持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行
* @author wxl
* @date 2016年9月8日
*
 */
public class Wrapper implements Targetable {
	private Source source;
	public Wrapper(Source source) {
		super();
		this.source=source;
	}
	@Override
	public void methodSource() {
		
		source.methodSource();
	}

	@Override
	public void methodAdapter() {
		System.out.println("this is new method");
		
		
	}

	

	

}
