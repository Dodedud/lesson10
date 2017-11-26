package com.hillel.triangle;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class findCharInStringTest {

  @Test
  public void testCount(){

    int result = FindCharInString.count("Hello world", 'l');
    assertThat(result, is(3));
  }

}
