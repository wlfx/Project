package factorymethod;
/**
 * 
* @category 多个工厂方法模式
* @ClassName: ManyFactory
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wxl
* @date 2016年9月7日
*
 */
public class ManyFactory {

	public IAnimals factoryCat(){
		
		return new CatShout();
		
	}
	public IAnimals factoryDog(){
		
		return new DogShout();
		
	}
}
