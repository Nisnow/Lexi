
/**
 * Write a description of class WordDeleter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class WordDeleter
{
    private JTable table;
    
    public WordDeleter(JTable t)
    {
        table = t;
        deleteWord();
    }
    
    public void deleteWord()
    {
        int row = table.getSelectedRow();
        String conword = table.getModel().getValueAt(row, 0).toString(); 
        String translation = table.getModel().getValueAt(row, 1).toString();
        
        System.out.println(conword + " " + translation);
    }
}
