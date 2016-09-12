package prototype;
/**
 * 
* @category 广告信
* @ClassName: AdvTemplate
* @Description: AdvTemplate 是广告信的模板，一般都是从数据库取出，生成一个 BO 或者是 DTO，我们这里使用一个静态的值来做代表；
* @author wxl
* @date 2016年9月8日
*
 */
public class AdvTemplate {
	//广告信名称
	private String advSubject ="XX银行国庆信用卡抽奖活动";
	//广告信内容
	private String advContext = "国庆抽奖活动通知：只要刷卡就送你1百万！ ....";
	//取得广告信的名称
	public String getAdvSubject(){
	return this.advSubject;
	}
	//取得广告信的内容
	public String getAdvContext(){
	return this.advContext;
	}

}
