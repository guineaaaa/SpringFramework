package ex5_5;
import org.springframework.stereotype.Component;

@Component
public class Operand {
	private int value=30;
	
	public Operand() {}
	
	public Operand(int value) {
		this.value=value;
	}
	
	public void setValue(int v) {
		this.value=v;
	}
	
	public int getValue() {
		return value;
	}
}
