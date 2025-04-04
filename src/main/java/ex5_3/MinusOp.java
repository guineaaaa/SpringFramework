package ex5_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("minusOp")
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
	
	@Override
	public int calc() {
		return operand1.getValue()-operand2.getValue();
	}
	
	
	/**
	int operand1;
	int operand2;
	
	public void setOperand1(int op1) {
		operand1=op1;
	}
	
	public void setOperand2(int op2) {
		operand2=op2;
	}
	
	@Override
	public int calc() {
		return operand1-operand2;
	}
	**/
	
    /**private int operand1;
    private int operand2;

    // setter 메서드 (Spring이 값 주입)
    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    @Override
    public int calc() {
        return operand1 - operand2;
    }
    **/

}
