package edu.buet.cse.spring.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.buet.cse.spring.ch02.model.Performer;

public class App12 {
  public static void main(String... args) {
    ApplicationContext appContext = new ClassPathXmlApplicationContext("/edu/buet/cse/spring/ch02/spring-beans.xml");
    Performer zamfir = (Performer) appContext.getBean("zamfir");
    zamfir.perform();
  }
}
