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

import java.util.ArrayList;

public class MyParser {
  public static String outputFile;
  
  /**
   * Main method delivers argsList to Formatter and calls consume methods.
   * 
   * @param args html files and output file.
   */
  public static void main (String[] args){
    ArrayList<String> argList = new ArrayList<String>();
    String inputFiles[] = args[0].split(",");
    outputFile = args[1];
    // creating a list of html files to be formatted
    for (String inputFile: inputFiles){
      argList.add(inputFile);
    }
    ConsoleOutput c = new ConsoleOutput();
    FileOutput f = new FileOutput();
    Formatter fo = new Formatter();
    // setting up the formatted String
    fo.formatString(argList);
    // printing to the console
    c.consume();
    // writing to the file
    f.consume();
  }
  
  /**
   * Returns the output file.
   */
  public String getOutputFile(){
    return outputFile;
  }
}
