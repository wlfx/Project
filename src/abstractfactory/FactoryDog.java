package abstractfactory;
/**
 * 
* @category 工厂实现类 dog
* @ClassName: FactoryDog
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wxl
* @date 2016年9月7日
*
 */
public class FactoryDog implements IFactory {

	@Override
	public IAnimals animalsShout() {
		
		return new DogShout();
	}

}
