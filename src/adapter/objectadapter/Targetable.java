package adapter.objectadapter;
/**
 * 
* @category 接口
* @ClassName: Targetable
* @Description: 接口 完善
* @author wxl
* @date 2016年9月8日
*
 */
public interface Targetable {
	
	 /*与原类中的方法相同 ，在source中实现*/  
	public void methodSource();
	
	 /*新的方法 在适配器中实现*/  
	public void methodAdapter();

}
