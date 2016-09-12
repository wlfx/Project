package adapter.classadapter;
/**
 * 
* @category 测试功能是否完善
* @ClassName: AdapterTest
* @Description: 适配方法
* @author wxl
* @date 2016年9月8日
*
 */
public class AdapterTest {
	public static void main(String[] args) {  
        Targetable target = new Adapter();  
        target.methodSource();  
        target.methodAdapter();  
    }  

}
