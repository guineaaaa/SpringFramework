package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import ex5_5.Operand;
import ex5_5.OperatorBean;
import ex5_5.PlusOp;

@Configuration
@ComponentScan(basePackages= {"ex5_5"})
public class JavaConfig3 {
	/** 자동으로 들어간..
	 * 기존에는 2개의 아이디를 넣어주었다
	@Bean(name = "operand1") 
	@Scope("prototype") 
	public Operand op1() {
		Operand op1=new Operand();
		op1.setValue(30);
		return op1;
	}
	
	@Bean(name = "operand2")
	@Scope("prototype") 
	public Operand op2() {
		Operand op2=new Operand();
		op2.setValue(20);
		return op2;
	}
	**/

	
    @Bean
    public OperatorBean operatorBean(PlusOp op) {
    	return op;
	}
	
} 
