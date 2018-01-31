
/**
 * Write a description of class FileOpener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.*;
import java.util.ArrayList;

public class FileOpener
{
    //format of strings: "conword\ttranslation"
    public static ArrayList<String> conWords;
    public static ArrayList<String> translations;
    public static String[] conwordsArray;
    public static String[] translationsArray; 
    
    //create new array for file you opened
    public FileOpener()
    {
        conWords = new ArrayList<String>();
        translations = new ArrayList<String>();
    }
    
    public static void loadFile(String file)
    {
      //open the file
      try
      {
          BufferedReader br = new BufferedReader(new FileReader(file));
          String wLine;
                
          //read the file line by line, storing words into respective arrays
          while((wLine = br.readLine()) != null)
          {
              conWords.add(wLine.substring(0, wLine.indexOf("\t"))); //extract conword from string
              translations.add(wLine.substring(wLine.lastIndexOf("\t") + 1)); //extract translation from string
          }
          br.close();
      } catch (Exception e)
      {
          //Alucard is here to mock you
         System.out.println("*Alucard voice* You done goofed. " + e.getMessage());
      }
      //convert ArrayLists to arrays
      conwordsArray = conWords.toArray(new String[conWords.size()]);
      translationsArray = translations.toArray(new String[translations.size()]);
    }
    
    public static String[] getConwords()
    {
        return conwordsArray;
    }
    
    public static String[] getTranslations()
    {
        return translationsArray;
    }
}
