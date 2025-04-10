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

	
    @Bean
    public OperatorBean operatorBean(PlusOp op) {
    	return op;
	}
	
} 
