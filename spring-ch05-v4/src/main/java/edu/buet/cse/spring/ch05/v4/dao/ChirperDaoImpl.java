package edu.buet.cse.spring.ch05.v4.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import edu.buet.cse.spring.ch05.v4.model.Message;
import edu.buet.cse.spring.ch05.v4.model.User;

public class ChirperDaoImpl implements ChirperDao {
  public static final int MAX_RESULTS = 10;
  private final SessionFactory sessionFactory;
  private Session session;

  public ChirperDaoImpl(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  public void init() {
    session = sessionFactory.openSession();
  }

  public void cleanUp() {
    session.close();
  }

  @Override
  public User getUser(Long id) {
    Transaction tx = session.beginTransaction();
    User user = (User) session.get(User.class, id);
    tx.commit();
    
    return user;
  }

  @Override
  public boolean createUser(User user) {
    Transaction tx = null;
    Long id = null;

    try {
      tx = session.beginTransaction();
      id = (Long) session.save(user);
      tx.commit();
    } catch (HibernateException ex) {
      ex.printStackTrace(System.err);

      if (tx != null) {
        tx.rollback();
      }
    }

    return id != null;
  }

  @Override
  public Message getMessage(Long id) {
    Transaction tx = session.beginTransaction();
    Message message = (Message) session.get(Message.class, id);
    tx.commit();
    
    return message;
  }

  @Override
  public List<Message> getLatestMessages(int count) {
    Transaction tx = session.beginTransaction();
    Query query = session.createQuery("from Message");
    query.setMaxResults(count);
    @SuppressWarnings("unchecked")
    List<Message> messages = query.list();
    tx.commit();

    return messages;
  }

  @Override
  public boolean createMessage(Message message) {
    Transaction tx = null;
    Long id = null;

    try {
      tx = session.beginTransaction();
      id = (Long) session.save(message);
      tx.commit();
    } catch (HibernateException ex) {
      ex.printStackTrace(System.err);

      if (tx != null) {
        tx.rollback();
      }
    }

    return id != null;
  }
}
