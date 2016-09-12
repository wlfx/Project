package adapter.objectadapter;
/**
 * 
* @category 测试功能是否完善
* @ClassName: AdapterTest
* @Description: 适配对象
* @author wxl
* @date 2016年9月8日
*
 */
public class AdapterTest {
	public static void main(String[] args) { 
		Source source =new Source();
        Targetable target = new Wrapper(source);  
        target.methodSource();  
        target.methodAdapter();  
    }  

}
