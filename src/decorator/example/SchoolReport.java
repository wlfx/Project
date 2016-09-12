package decorator.example;
/**
 * 
* @ClassName: SchoolReport
* @Description: TODO(这里用一句话描述这个类的作用)
* @category  成绩单的抽象类
* @author A18ccms a18ccms_gmail_com
* @date 2016年9月8日 下午9:41:22
*
 */
public abstract class SchoolReport {
	// 成绩单的主要展示的就是你的成绩情况
	public abstract void report();

	// 成绩单要家长签字，这个是最要命的
	public abstract void sign(String name);

}
