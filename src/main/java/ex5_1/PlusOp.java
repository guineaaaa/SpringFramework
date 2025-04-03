package ex5_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("plusOp")
public class PlusOp implements OperatorBean {
	@Autowired
	@Qualifier("operand1") 
	private Operand op1; 
	// bean id="op1" 
	//op1? or op2?? -> 이름을 바꿔준다그럼 Operand op1; 이렇게
	
	@Autowired
	@Qualifier("operand2") 
	private Operand op2;
	// bean id="op2"
	
	// int -> Operand 타입으로..
	// @Autowired
	public void setOperand1(Operand operand1) {
		this.op1=operand1;
	}
	
	// @Autowired
	public void setOperand2(Operand operand2) {
		this.op2=operand2;
	}
	
	@Override
	public int calc() {
		return op1.getValue()+op2.getValue();
	}
	
	
	
	
	/** lombok을 쓰면 자동으로 get/set을 만들 수 있지
	// set,get을 쓰면 property로 넣어줄 수 있습니다.
	public void setOperand1(int op1) {
		this.operand1=op1;
	}
	
	public void setOperand2(int op2) {
		this.operand2=op2;
	}
	
	@Override
	public int calc() {
		return operand1+operand2;
	}
	
	**/
	
	/**private int operand1;
	private int operand2;
	
	// setter 메소드 (Spring이 값 주입)
	public void setOperand1(int operand1) {
		this.operand1=operand1;
	}
	
    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    @Override
    public int calc() {
        return operand1 + operand2;
    }
    **/
}

