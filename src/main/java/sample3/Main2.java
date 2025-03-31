package sample3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		MessageBean bean1=(MessageBean)ctx.getBean("messageBean");
		MessageBean bean2=(MessageBean)ctx.getBean("messageBean");
		
		System.out.println("bean1==bean2: "+(bean1==bean2));
		
		ctx.close();
	}

}
