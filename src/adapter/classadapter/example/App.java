package adapter.classadapter.example;
/**
 * 
* @category 内部测试
* @ClassName: App
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wxl
* @date 2016年9月8日
*
 */
public class App {

	public static void main(String[] args) {
		// 没有与外系统连接的时候，是这样写的
		IUserInfo youngGirl = new UserInfo();
		// 从数据库中查到101个
		for (int i = 0; i < 101; i++) {
			youngGirl.getMobileNumber();
		}
	}
}
