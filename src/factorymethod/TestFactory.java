package factorymethod;
	/**
	 * @category 工厂方法模式 测试类，总结
	* @ClassName: TestFactory
	* @Description: TODO(这里用一句话描述这个类的作用)
	* @author wxl
	* @date 2016年9月7日
	 */
public class TestFactory {
	
	public static void main(String[] args) {
		//普通工厂模式测试
		new PubFactory().animalsShout("Cat").shout();
		new  PubFactory().animalsShout("Dog").shout();
		//多个工厂方法模式测试
		System.out.println("before");
		new ManyFactory().factoryCat().shout();
		System.out.println("center");
		new ManyFactory().factoryDog().shout();
		System.out.println("after");
		//静态工厂模式
		StaticFactory.factoryCat().shout();
		StaticFactory.factoryDog().shout();
		
	}

}
/**
 	* 	总体来说，工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。
 	* 
	*	在以上的三种模式中，第一种如果传入的字符串有误，不能正确创建对象，第三种相对于第二种，不需要实例化工厂类
	*，
	*	所以，大多数情况下，我们会选用第三种——静态工厂方法模式。工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，
	*
	*	如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，所以，从设计角度考虑，有一定的问题，如何解决？就用到抽象工厂模式，
	*
	*	创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。
	*/
