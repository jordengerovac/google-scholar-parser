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
import java.util.Collections;

public class Formatter {
  public static String format = "";
  
  /**
   * Formats the String using extractions.
   * 
   * @param inputFiles all html files.
   */
  public void formatString(ArrayList<String> inputFiles){
    // number of co-authors from all html files
    int totalCoAuthors = 0;
    // co-author list
    ArrayList<String> list = new ArrayList<String>();
    // assigning the output file to a variable
    // Extractor instance that will obtain google scholar information
    Extractor e = new Extractor();
    // setting up the String format
    for (String inputFile: inputFiles){
    format = format + "------------------------------------------------------\n"
        + "1. Name of Author:\n     " + e.extractAuthorsName(inputFile) + "\n" 
        + "2. Number of Citations:\n     "
        + e.extractNumberOfCitations(inputFile) + "\n" + 
        "3. Number of i-10 index after 2009:\n     " + 
        e.extractNumberOfi10Index(inputFile) + "\n" +
        "4. Title of the first three publications:\n     " 
        + e.extractFirstThreePublications(inputFile) + "\n" + 
        "5. Total paper citation (first five papers):\n     " + 
        e.extractTotalCitations(inputFile) + "\n" + 
        "6. Total Co-Authors:\n     " + e.extractNumberOfCoAuthors(inputFile) 
        + "\n";
    // adds number of co-authors from all html files
    totalCoAuthors += e.extractNumberOfCoAuthors(inputFile);
    }
    format = format + "------------------------------------------------------\n"
        + "7. Co-Author list sorted (Total: " + totalCoAuthors + ")\n";
    // adds all co-authors to list
    for (String inputFile: inputFiles){
      list.addAll(e.extractCoAuthorList(inputFile));
    }
    // sorting co-author list
    Collections.sort(list);
    // appends co-author list to formatted String
    for (int i = 0; i<list.size(); i++){
      format += list.get(i) + "\n";
    }
  }

  /**
   * Returns the formatted String.
   */
  public String getFormat(){
    return format;
  }
}
