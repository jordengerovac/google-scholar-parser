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

import driver.Extractor;

public class ExtractorTest {
  Extractor e;
  
  @Before
  public void setUp(){
    e = new Extractor();
  }
  @Test
  public void test() {
    assertEquals("Ola Spjuth", e.extractAuthorsName("sample1.html"));
    assertEquals("437", e.extractNumberOfCitations("sample1.html"));
    assertEquals("12", e.extractNumberOfi10Index("sample1.html"));
    assertEquals(15, e.extractNumberOfCoAuthors("sample1.html"));
  }

}
