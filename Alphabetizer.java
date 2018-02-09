
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
    private String filePath;
    private String[][] words;
    private String[] tconWords;
    private String[] tTranslations;
    
    public int row; //alphabetize by conlang or translation
    
    public Alphabetizer(int t)
    {
        filePath = TxtOpener.getCurrentFile().getAbsolutePath();
        words = TableOrganizer.organizeWords(filePath); 
        row = t;
    }
    
    public void sortWords() throws Exception
    {
        Arrays.sort(words, new Comparator<String[]>()
        {
            public int compare(String[] row1, String[] row2)
            {
                return row1[row].compareTo(row2[row]);
            }
        });
        
        File temp = new File("temp.txt");
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(temp));
        
        writer.write(words[0][0] + "\t\t" + words[0][1]);
        for(int i = 1; i < words.length; i++)
        {
            String tLine = words[i][0] + "\t\t" + words[i][1];
            writer.write(System.getProperty("line.separator") + tLine);
        }
        
        writer.close();
        
        TxtOpener.getCurrentFile().delete();
        temp.renameTo(TxtOpener.getCurrentFile());
        
        Window.dtable.setDataVector(words, Window.tableNames);
        Window.wordTable.setModel(Window.dtable);
        //see note above; toss array thing here, sort, then make new file of sort
        //words
    }
}
