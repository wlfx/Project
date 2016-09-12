package decorator;
/**
 * 
* @ClassName: Decorator
* @Description: TODO(这里用一句话描述这个类的作用)
* @category 装饰类
* @author A18ccms a18ccms_gmail_com
* @date 2016年9月8日 下午9:16:54
*
 */
public class Decorator implements Sourceable {

	private Sourceable sable;
	public Decorator(Sourceable source){
		super();
		this.sable=source;
	}
	@Override
	public void method() {
		System.out.println("this is before sourceable");
		sable.method();
		System.out.println("this is after sourceable");

	}

}
