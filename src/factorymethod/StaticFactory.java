package factorymethod;
/**
 * 
* @category 静态工厂方法模式
* @ClassName: StaticFactory
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wxl
* @date 2016年9月7日
*
 */
public class StaticFactory {
	
	public  static IAnimals factoryCat(){
		
		return new CatShout();
		
	}
	public static IAnimals factoryDog(){
		
		return new DogShout();
		
	}
}
