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
package driver;

public class ConsoleOutput implements Output{
  /**
   * Takes the formatted String and prints to the console.
   */
  public void consume(){
    Formatter f = new Formatter();
    System.out.println(f.getFormat());
  }
}
