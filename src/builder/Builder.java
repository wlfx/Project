package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
* @ClassName: Builder
* @Description: TODO(这里用一句话描述这个类的作用)
* @category 建造者模式
* @author A18ccms a18ccms_gmail_com
* @date 2016年9月7日 下午9:14:01
*
 */
public class Builder {
	private List<IAnimals> list=new ArrayList<IAnimals>();
	
	public void produceCatShout(int count){
		 
		for(int i=0;i<count ;i++){
			list.add(new CatShout());
		
		}
		System.out.println(list.size());
		
	}
	public void produceDogShout(int count){
		 
		for(int i=0;i<count ;i++){
			list.add(new DogShout());
		}
		System.out.println(list.size());
		
	}
}
