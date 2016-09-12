package decorator;
/**
 * 
* @ClassName: Source
* @Description: 这是一个初始类，类似于基类，供其他类完善
* @category	 被装饰类
* @author A18ccms a18ccms_gmail_com
* @date 2016年9月8日 下午9:04:35
*
 */
public class Source implements Sourceable {

	@Override
	public void method() {
			
		System.out.println("this is source");

	}

}
