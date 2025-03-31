package sample4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=new
				GenericXmlApplicationContext("classpath:applicationContext2.xml");
		
		MessageBean bean=(MessageBean)ctx.getBean("messageBean");
		bean.sayHello();
		ctx.close();
	}

}
