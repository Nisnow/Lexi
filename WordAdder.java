
/**
 * Write a description of class WordAdder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;

public class WordAdder //this class is a snake
{
    private static String fileName;
    
    public static void setFile(String path)
    {
        fileName = path;
        System.out.println(fileName);
    }
    
    public static void addWord(String conword, String translation)
    {
        try
        {
            FileWriter fw = new FileWriter(fileName, true); //true will append new word
            fw.write("\r\n");
            fw.write(conword + "\t\t" + translation);
            fw.close();
            
            String[][] words = TableOrganizer.organizeWords(fileName);
            
            Window.dtable.setDataVector(words, Window.tableNames);
            Window.wordTable.setModel(Window.dtable);
        }
        catch(Exception e)
        {
            System.out.println("*Alucard voice* You done goofed again. " + e.getMessage());
        }
    }
}
