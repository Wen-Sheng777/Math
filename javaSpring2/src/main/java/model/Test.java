package model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {//�o�����Ӻ⦳�Ψ�Spring...
		ApplicationContext s1=new ClassPathXmlApplicationContext("sp1.xml");
		s1.getBean("c");


	}

}
