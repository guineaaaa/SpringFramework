package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import ex5_1.Operand;
import ex5_1.OperatorBean;
import ex5_1.PlusOp;

@Configuration
public class JavaConfig {
	/**
	 * <bean id="operand1" class="com.example.demo.Operand" scope="prototype">
       		<property name="value" value="30"/>
       </bean>
       
        <bean id="operand2" class="com.example.demo.Operand" scope="prototype">
       		<property name="value" value="20"/>
       </bean>
	 */
	
	// @Bean
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
    	// return new PlusOp(); -> @Autowired를 사용하는 방법
		OperatorBean op=new PlusOp();
		op.setOperand1(op1()); // @Autowired 대신 직접 호출
		op.setOperand2(op2());
		
		return op;
	}
	
} 
