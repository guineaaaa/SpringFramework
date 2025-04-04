package ex5_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MinusOp implements OperatorBean{
    @Autowired
	private Operand operand1;
    
    @Autowired
	private Operand operand2;
	
	@Autowired
	public void setOperand1(Operand operand1) {
		this.operand1=operand1;
	}
	
	@Autowired
	public void setOperand2(Operand operand2) {
		this.operand2=operand2;
	}
	
	public int calc() {
		return operand1.getValue()-operand2.getValue();
	}
	
}
