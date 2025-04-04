package ex5_5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex5_3.OperatorBean;

public class DIApp {
	public static void main(String[] args) {
		GenericApplicationContext ctx=
				new AnnotationConfigApplicationContext(config.JavaConfig2.class);
		
        // operatorBean 가져오기
        OperatorBean operator=(OperatorBean)ctx.getBean("operatorBean");
        
        int value=operator.calc();
        System.out.println("The result value: "+value);
        
        ctx.close();
	}
}
