
/**
 * Write a description of class TxtOpener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.filechooser.*;
import java.awt.*;
import java.io.*;

public class TxtOpener implements ActionListener
{
    private JButton tButton; 
    private JFileChooser chooser;
    private Window window; 
    private static File file;
    private JTable table;
    private JPanel panel;
    
    public TxtOpener(JFileChooser fc, JButton button, Window w, JPanel p)
    {
        chooser = fc;
        tButton = button;
        window = w;
        panel = p;
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".txt Files", "txt");
        chooser.setFileFilter(filter);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        int returnVal = chooser.showOpenDialog(window);
        
        //Handle open button action
        if(e.getSource() == Window.openButton)
        {
            if(returnVal == JFileChooser.APPROVE_OPTION)
            {
                //toss the text from the selected file into an array
                file = chooser.getSelectedFile();
                String[][] words = TableOrganizer.organizeWords(file.getAbsolutePath());
                //set title of conlang to name of file
                Window.tableNames[0] = file.getName().substring(0, file.getName().indexOf("."));
                
                //update the table
                Window.dtable.setDataVector(words, Window.tableNames);
                Window.wordTable.setModel(Window.dtable);
                
                //store current file in WordAdder()
                WordAdder.setFile(file.getAbsolutePath());
                
                System.out.println("Opening: " + file.getAbsolutePath() + "." + "\n");
            }
        }
        else if(e.getSource() == Window.newButton)
        {
            //stuff
        }
    }
    
    public static File getCurrentFile()
    {
        return file;
    }
}
