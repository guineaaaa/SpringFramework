package sample1;

public class HelloApp {
	public static void main(String[] args) {
		// HelloApp 클래스는 main()안에서 MessageBean의 인스턴스를 생성해
		// sayHello 메소드를 호출할 뿐이다
		// object 간의 결합이 엄격함
		MessageBean bean=new MessageBean();
		bean.sayHello("Spring");
	}

}
