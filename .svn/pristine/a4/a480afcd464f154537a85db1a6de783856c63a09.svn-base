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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extractor {
  /**
   * Extracts Author's name from html file.
   * 
   * @param googleScholarURL The URL to extract from.
   */
  public String extractAuthorsName(String googleScholarURL) {
    String matches = "";
    try {
      HTML googleScholarParser = new HTML();
      String rawHTMLString = googleScholarParser.getHTML(googleScholarURL);

      String reForAuthorExtraction =
          "<span id=\"cit-name-display\" "
              + "class=\"cit-in-place-nohover\">(.*?)</span>";
      Pattern patternObject = Pattern.compile(reForAuthorExtraction);
      Matcher matcherObject = patternObject.matcher(rawHTMLString);
      while (matcherObject.find()) {
         matches = matcherObject.group(1);
      }

    } catch (Exception e) {
      System.out.println("malformed URL or cannot open connection to "
          + "given URL");
    }
    return matches;
   }
  
  /**
   * Extracts number of citations from html file.
   * 
   * @param googleScholarURL The URL to extract from.
   */
  public String extractNumberOfCitations(String googleScholarURL) {
    String matches = "";
    try {
      HTML googleScholarParser = new HTML();
      String rawHTMLString = googleScholarParser.getHTML(googleScholarURL);

      String reForCitationExtraction = "<td class=\"cit-borderleft cit-data\"" +
      ">(.*?)</td>";
      Pattern patternObject = Pattern.compile(reForCitationExtraction);
      Matcher matcherObject = patternObject.matcher(rawHTMLString);
      if (matcherObject.find()) {
        matches = matcherObject.group(1);
      }

    } catch (Exception e) {
      System.out.println("malformed URL or cannot open connection to "
          + "given URL");
    }
    return matches;
   }
  
  /**
   * Extracts number of i-10 index from html file.
   * 
   * @param googleScholarURL The URL to extract from.
   */
  public String extractNumberOfi10Index(String googleScholarURL) {
    String matches = "";
    int count = 0;
    try {
      HTML googleScholarParser = new HTML();
      String rawHTMLString = googleScholarParser.getHTML(googleScholarURL);

      String reFori10Extraction = "<td class=\"cit-borderleft cit-data\"" + 
      ">(.*?)</td>";
      Pattern patternObject = Pattern.compile(reFori10Extraction);
      Matcher matcherObject = patternObject.matcher(rawHTMLString);
      while (matcherObject.find()) {
        if (count==5){
          matches = matcherObject.group(1);
        }
        count++;
      }

    } catch (Exception e) {
      System.out.println("malformed URL or cannot open connection to "
          + "given URL");
    }
    return matches;
   }
  
  /**
   * Extracts first three publications from html file.
   * 
   * @param googleScholarURL The URL to extract from.
   */
  public String extractFirstThreePublications(String googleScholarURL) {
    String matches = "";
    int count = 1;
    try {
      HTML googleScholarParser = new HTML();
      String rawHTMLString = googleScholarParser.getHTML(googleScholarURL);
      String reForPublicationExtraction = "class=\"cit-dark-large-link\">"
          + "(.*?)</a><br><span class=\"cit-gray\">";
      Pattern patternObject = Pattern.compile(reForPublicationExtraction);
      Matcher matcherObject = patternObject.matcher(rawHTMLString);
      while (matcherObject.find()) {
        if (count<=3){
          matches = matches + count + "- " + matcherObject.group(1);
          if (count<3){
            matches = matches + "\n     ";
          }
        }
        count++;
      }

    } catch (Exception e) {
      System.out.println("malformed URL or cannot open connection to "
          + "given URL");
    }
    return matches;
   }
  
  /**
   * Extracts total paper citations (first five papers) from html file.
   * 
   * @param googleScholarURL The URL to extract from.
   */
  public int extractTotalCitations(String googleScholarURL) {
    int matches;
    int citations = 0;
    int count = 0;
    try {
      HTML googleScholarParser = new HTML();
      String rawHTMLString = googleScholarParser.getHTML(googleScholarURL);
      String reForCitationExtraction = "<a class=\"cit-dark-link\" " + 
      "href=\"(.*?)\">([0-9]*?)</a></td>";
      Pattern patternObject = Pattern.compile(reForCitationExtraction);
      Matcher matcherObject = patternObject.matcher(rawHTMLString);
      while (matcherObject.find()) {
        // makes sure it only takes the first 5 publications
        if (count<5){
          matches = Integer.parseInt(matcherObject.group(2));
          citations += matches;
          count++;
        }
      }
    } catch (Exception e) {
      System.out.println("malformed URL or cannot open connection to "
          + "given URL");
    }
    return citations;
   }
  
  /**
   * Extracts number of co-authors from html file.
   * 
   * @param googleScholarURL The URL to extract from.
   */
  public int extractNumberOfCoAuthors(String googleScholarURL) {
    int numberOfAuthors = 0;
    try {
      HTML googleScholarParser = new HTML();
      String rawHTMLString = googleScholarParser.getHTML(googleScholarURL);
      String reForCoAuthorExtraction = "title=(.*?)>(.*?)</a><br><a class";
      Pattern patternObject = Pattern.compile(reForCoAuthorExtraction);
      Matcher matcherObject = patternObject.matcher(rawHTMLString);
      while (matcherObject.find()) {
        // counter keeps track of the total number of co-authors
        numberOfAuthors++;
      }

    } catch (Exception e) {
      System.out.println("malformed URL or cannot open connection to "
          + "given URL");
    }
    return numberOfAuthors;
   }
  
  /**
   * Extracts all co-authors' names from html file.
   * 
   * @param googleScholarURL The URL to extract from.
   */
  public ArrayList<String> extractCoAuthorList(String googleScholarURL){
    ArrayList<String> matchList = new ArrayList<String>();
    try {
      HTML googleScholarParser = new HTML();
      String rawHTMLString = googleScholarParser.getHTML(googleScholarURL);
      String reForCoAuthorListExtraction = "title=\"(.*?)\">(.*?)</a><br><";
      Pattern patternObject = Pattern.compile(reForCoAuthorListExtraction);
      Matcher matcherObject = patternObject.matcher(rawHTMLString);
      while (matcherObject.find()) {
        // appends co-authors names to the ArrayList
        matchList.add(matcherObject.group(2));
      }
      // removes unwanted elements in the list
      matchList.remove(matchList.size()-1);
    } catch (Exception e) {
      System.out.println("malformed URL or cannot open connection to "
          + "given URL");
    }
    return matchList;
   }
}
