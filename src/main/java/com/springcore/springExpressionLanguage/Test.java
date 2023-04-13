package com.springcore.springExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) throws Exception {
		
	
	@SuppressWarnings("resource")
	ApplicationContext context=new ClassPathXmlApplicationContext("config-SPEL.xml");
	
	Demo demo= context.getBean("demo", Demo.class);
	
	System.out.println(demo);
	
	SpelExpressionParser temp= new SpelExpressionParser();
	org.springframework.expression.Expression expression = temp.parseExpression("10+20");
	
	System.out.println(expression.getValue());
	
	}
	
}
