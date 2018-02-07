//**********************************************************
//Assignment3:
//UTORID user_name: gerovac1
//
//Author: Jorden Gerovac
//
//
//Honor Code: I pledge that this program represents my own
//program code and that I have coded on my own. I received
//help from no one in designing and debugging my program.
//*********************************************************
package test;

import static org.junit.Assert.*;

import org.junit.*;

import driver.Formatter;

public class FormatterTest {
  Formatter f;

  @Before
  public void setUp(){
    f = new Formatter();
    Formatter.format = "format";
  }
  @Test
  public void getFormatTest() {
    assertEquals(f.getFormat(), "format");
  }

}
