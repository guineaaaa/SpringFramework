package sample2;

public class HelloApp {
	public static void main(String[] args) {
		/**
		 * 인터페이스를 사용하여 클래스 간의 의존 관계를 약하게 설정
		 * 이 인터페이스를 구현한 2개의 클래스
		 */
		MessageBean bean=new MessageBeanEn();
		bean.sayHello("Spring");
		
		bean=new MessageBeanKo();
		bean.sayHello("스프링");
	}

}
