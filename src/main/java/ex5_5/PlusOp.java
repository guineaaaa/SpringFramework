package ex5_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PlusOp implements OperatorBean {

	private Operand op1; 
	private Operand op2;
	
	// operand가 들어갈때 op1 op2에 들어갑니다..
	
	@Autowired
	public void setOperand1(Operand operand1) {
		this.op1=operand1;
	}
	
	@Autowired
	public void setOperand2(Operand operand2) {
		this.op2=operand2;
	}
	
	@Override
	public int calc() {
		return op1.getValue()+op2.getValue();
	}
	
}

