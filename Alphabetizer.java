
/**
 * Write a description of class Alphabetizer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*; 

public class Alphabetizer
{
    //note to self: Collections.sort(listToSort); exists
    //another note to self: ColumnComparator() exists as well
    private String filePath;
    private String[][] words;
    private ArrayList<String> tconWords;
    private ArrayList<String> tTranslations;
    
    private List wordList;
    
    public Alphabetizer()
    {
        filePath = TxtOpener.getCurrentFile().getAbsolutePath();
        tconWords = FileOpener.conWords;
        tTranslations = FileOpener.translations;
    }
    
    public void sortWordsByConlang()
    {
        //see note above; toss array thing here, sort, then make new file of sort
        //words
    }
    
    public void sortWordsByTranslation()
    {
    
    }
}
