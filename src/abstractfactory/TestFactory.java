package abstractfactory;
/**
 * 
* @category 抽象工厂模式
* @ClassName: TestFactory
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wxl
* @date 2016年9月7日
*
 */
public class TestFactory {

	public static void main(String[] args) {
		//接口
		IFactory ify = new FactoryCat();
		IAnimals iam = ify.animalsShout();
		iam.shout();
		//无接口
		FactoryCat fc=new FactoryCat();
		fc.animalsShout().shout();
		//shout 接口
		new FactoryCat().animalsShout().shout();
	}
}
/**
 * 功能：发及时信息，则只需做一个实现类，实现Sender接口，同时做一个工厂类，
 * 实现Provider接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！
 */ 
