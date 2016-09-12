package adapter.classadapter.example;

import java.util.Map;

/**
 * 
* @category   外系统的人员信息
* @ClassName: IOuterUser
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wxl
* @date 2016年9月8日
*
 */
@SuppressWarnings("all")
public interface IOuterUser {
	// 基本信息，比如名称，性别，手机号码了等
	public Map getUserBaseInfo();

	// 工作区域信息
	public Map getUserOfficeInfo();

	// 用户的家庭信息
	public Map getUserHomeInfo();

}
