package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import ex5_3.Operand;
import ex5_3.OperatorBean;
import ex5_3.PlusOp;

@Configuration
public class JavaConfig2 {
	// 이름 같은것을 연결시켜준다
	@Bean(name = "operand1") 
	@Scope("prototype") 
	public Operand op1() {
		Operand op1=new Operand();
		op1.setValue(30);
		return op1;
	}
	
	// @Bean
	@Bean(name = "operand2")
	@Scope("prototype") 
	public Operand op2() {
		Operand op2=new Operand();
		op2.setValue(20);
		return op2;
	}

    @Bean
    public OperatorBean operatorBean() {
    	return new PlusOp(); // @Autowired를 사용하는 방법
		
	}
	
} 
