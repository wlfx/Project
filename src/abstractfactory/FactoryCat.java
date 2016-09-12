package abstractfactory;
/**
 * 
* @category 工厂实现类 cat
* @ClassName: FactoryCat
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wxl
* @date 2016年9月7日
*
 */
public class FactoryCat implements IFactory {

	@Override
	public IAnimals animalsShout() {
		
		return new CatShout();
	}

}
