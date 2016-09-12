package adapter.interfaceadapter;
/**
 * 
* @category 接口适配器测试
* @ClassName: Test
* @Description: 接口适配器测试程序
* @author wxl
* @date 2016年9月8日
*
 */
public class Test {
	
	public static void main(String[] args) {
		//后去对象
		SourceSub_1 sourceSub_1=new SourceSub_1();
		SourceSub_2 sourceSub_2=new SourceSub_2();
		//获取sourceSub_1实现的方法
		sourceSub_1.method_1();
		try {
			sourceSub_2.method_1();
		} catch (Exception e) {
			// TODO: handle exception
		}
		//获取sourceSub_2中 实现的方法
		sourceSub_2.method_2();
		
	}
}
