package factorymethod;
/**
 * 
* @category 普通工厂模式
* @ClassName: PubFactory
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wxl
* @date 2016年9月7日
*
 */
public class PubFactory {
	IAnimals cat=new CatShout();
	
	public IAnimals animalsShout(String name){
		
		if("Dog".equals(name)){
			return new DogShout(); 
			
		}
		if("Cat".equals(name)){
			return new CatShout();
			
		}
		else{
			System.out.println("请输入正确的类型!");  
			return null;
		}
	}
	
}
