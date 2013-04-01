package edu.buet.cse.spring.ch03.v1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;

import edu.buet.cse.spring.ch03.v1.ex.PerformanceException;
import edu.buet.cse.spring.ch03.v1.model.Performer;

public class App {
  public static void main(String[] args) {
    ApplicationContext appContext = new ClassPathXmlApplicationContext("/edu/buet/cse/spring/ch03/v1/spring-beans.xml");
    Performer kenny = (Performer) appContext.getBean("kenny");
    
    try {
      kenny.perform();
    } catch (PerformanceException ex) {
      ex.printStackTrace(System.err);
    }
  }
}