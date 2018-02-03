
/**
 * Write a description of class DeleteListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class DeleteListener implements ActionListener
{
    private JTable table;
    
    public DeleteListener(JTable t)
    {
        table = t;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            WordDeleter deleter = new WordDeleter(table);
        }
        catch(Exception exc)
        {
            System.out.println("Uh oh, spaghetti-o's. " + exc.getMessage());
        }
    }
}
