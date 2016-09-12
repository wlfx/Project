package adapter.classadapter;
/**
 * 
* @category 方法适配器
* @ClassName: Adapter
* @Description: 通过 继承 初始数据实现数据同步，通过实现接口完成新功能的添加
* 当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可
* @author wxl
* @date 2016年9月8日
*
 */
public class Adapter extends Source implements Targetable{

	@Override
	public void methodAdapter() {
		
		 System.out.println("this is the targetable method!");  
		
	}



}
