package edu.buet.cse.spring.ch04.v3.impl;

import edu.buet.cse.spring.ch04.v3.model.Instrument;

public class Guiter implements Instrument {
  private static final String GUITER_NAME = "Guiter";
  
  @Override
  public String getName() {
    return GUITER_NAME;
  }

  @Override
  public void play() {
    System.out.println("DING DING DING");
  }
}
