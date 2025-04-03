package ex5_1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DIApp {
	public static void main(String[] args) {
        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext("classpath:applicationContext.xml");
        
        // operatorBean 가져오기
        OperatorBean operator=(OperatorBean)ctx.getBean("plusOp");
        
        int value=operator.calc();
        System.out.println("The result value: "+value);
        
        ctx.close();
	}

}
