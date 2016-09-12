package prototype;

import java.util.Random;

import javax.xml.ws.LogicalMessage;
/**
 * 
* @category 客户端
* @ClassName: Client
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wxl
* @date 2016年9月8日
*
 */
public class Client {
	// 发送账单的数量，这个值是从数据库中获得
	private static int MAX_COUNT = 60000;

	public static void main(String[] args) {
		// 模拟发送邮件
		int i = 0;
		// 把模板定义出来，这个是从数据库中获得
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX银行版权所有");
		//开始时间
		long k;
		k=System.currentTimeMillis();
		System.out.println(k);
		while (i < MAX_COUNT) {
			// 以下是每封邮件不同的地方
			//******************获取对象***************************//
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRandString(5) + " 先生（女士） ");
			cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
			// 然后发送邮件
			sendMail(cloneMail);
			//******************原型模式***************************//
			/*mail.setAppellation(getRandString(5) + " 先生（女士） ");
			mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
			// 然后发送邮件
			sendMail(mail);*/
			i++;
		}
		//结束时间
		System.out.println(System.currentTimeMillis()-k);
	}

	// 发送邮件
	public static void sendMail(Mail mail){
	
	System.out.println("标题： "+mail.getSubject() + "\t收件人："+mail.getReceiver()+"\t....发送成功！ "+"时间");
	}

	// 获得指定长度的随机字符串
	public static String getRandString(int maxLength) {
		String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuffer sb = new StringBuffer();
		Random rand = new Random();
		for (int i = 0; i < maxLength; i++) {
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		return sb.toString();
	}
}
