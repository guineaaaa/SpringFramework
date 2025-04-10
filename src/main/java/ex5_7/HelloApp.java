package ex5_7;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=new
				GenericXmlApplicationContext("classpath:applicationContext2.xml");
		
		MessageBean bean=(MessageBean)ctx.getBean("messageBean");
		bean.sayHello();
		ctx.close();
		// bean 객체가 prototype일때, singleton일때
		// prototype일때 일반 자바 클래스처럼 계속 객체가 생성 되는데 singleton은 아님
	}

}
