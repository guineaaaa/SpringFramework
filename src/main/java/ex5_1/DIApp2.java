package ex5_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIApp2 {
	public static void main(String[] args) {
        //GenericXmlApplicationContext ctx =
        //        new GenericXmlApplicationContext("classpath:applicationContext.xml");
        
		ApplicationContext ctx=
				new AnnotationConfigApplicationContext(config.JavaConfig.class);
		
        // operatorBean 가져오기
        OperatorBean operator=(OperatorBean)ctx.getBean("operatorBean");
        
        int value=operator.calc();
        System.out.println("The result value: "+value);
        
        
	}
}
