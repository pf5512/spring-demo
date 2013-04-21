package edu.buet.cse.spring.ch05.v2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.buet.cse.spring.ch05.v2.dao.ChirperDaoImpl;
import edu.buet.cse.spring.ch05.v2.model.User;

public class App {
  public static void main(String[] args) {
    ApplicationContext appContext = new ClassPathXmlApplicationContext("/edu/buet/cse/spring/ch05/v2/spring-beans.xml");
    ChirperDaoImpl chirperDao = appContext.getBean("chirperDao", ChirperDaoImpl.class);
    User user = chirperDao.getUser(1L);
    System.out.println(user);
  }
}
