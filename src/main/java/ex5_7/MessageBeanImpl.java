package ex5_7;

import java.io.IOException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBeanImpl implements MessageBean,InitializingBean, DisposableBean {
	private String name;
	private String greeting;
	private Outputter outputter;

	public void sayHello() {
		String message=greeting+name+"!";
		System.out.println(message);
		try {
			outputter.output(message);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void start() throws Exception{
		System.out.println("시작");
	}
	
	public void close() throws Exception{
		System.out.println("끝");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MessageBeanImple.afterPropertiesSet() 실행");
	}
	
	public MessageBeanImpl(String name) {
		this.name=name;
	}
	
	public void setGreeting(String greeting) {
		this.greeting=greeting;
	}
	
	public void setOutputter(Outputter outputter) {
		this.outputter=outputter;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("MessageBeanImple.destroy() 실행");
	}


}
