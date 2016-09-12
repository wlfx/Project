package adapter.interfaceadapter;
/**
 * 
* @category 抽象类空实现接口
* @ClassName: AbstractWrapper
* @Description: 实现接口中所有的方法，但是是空的方法，供调用者重写
* 当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，
* 实现所有方法，我们写别的类的时候，继承抽象类即可。
* @author wxl
* @date 2016年9月8日
*
 */
public abstract class AbstractWrapper implements ISourceable{

	@Override
	public void method_1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method_2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method_3() {
		// TODO Auto-generated method stub
		
	}
}
