package adapter.classadapter.example;
/**
 * 
* @category 适配器测试
* @ClassName: AdapterApp
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wxl
* @date 2016年9月8日
*
 */
public class AdapterApp {
	public static void main(String[] args) {
		//没有与外系统连接的时候，是这样写的
		//IUserInfo youngGirl = new UserInfo();
		//老板一想不对呀，兔子不吃窝边草，还是找人力资源的员工好点
		IUserInfo youngGirl = new OuterUserInfo(); //我们只修改了这一句好
		//从数据库中查到101个
		for(int i=0;i<101;i++){
		youngGirl.getMobileNumber();
		}
		}

}
