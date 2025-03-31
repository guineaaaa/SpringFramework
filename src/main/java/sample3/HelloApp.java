package sample3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {
	public static void main(String[] args) {
		
		// Spring 컨테이너 (ApplicationContext) 생성 및 XML 설정 파일 로드
		// 이 과정에서 <bean> 태그로 등록된 객체들이 자동으로 생성 및 관리
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		// Spring 컨테이너에서 messageBean이라는 ID를 가진 Bean 객체 가져오기
		// 인터페이스 타입은 MessageBean으로 업캐스팅 하여 사용 (XML이나 Java Config을 수정해 구현체를 코드 수정 없이 쉽게 바꾸기 위함임)
		MessageBean bean=(MessageBean)ctx.getBean("messageBean");
		
		// Bean 객체의 메서드 호출
		// 실제 구현체는 applicationContext.xml에 설정된 클래스
		bean.sayHello("Spring");
		
		// 생성된 Bean 객체들을 정리하고 리소스 해제
		ctx.close();
	}

}
