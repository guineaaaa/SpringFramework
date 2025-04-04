package ex5_3;
import org.springframework.stereotype.Component;


@Component
public class Operand {
	private int value;
	
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
