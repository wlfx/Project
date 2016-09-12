package abstractfactory;
/**
 * 
* @category 实现类 dog
* @ClassName: DogShout
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wxl
* @date 2016年9月7日
*
 */
public class DogShout implements IAnimals {

	@Override
	public void shout() {
		
		System.out.println("this is Dog shout");
	}

}
