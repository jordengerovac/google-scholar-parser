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

import driver.MyParser;

public class MyParserTest {
  MyParser m;

  @Before
  public void setUp(){
    m = new MyParser();
    MyParser.outputFile = "outfile1.txt";
  }
  
  @Test
  public void outputFileTest() {
    assertEquals(MyParser.outputFile, m.getOutputFile());
  }

}
