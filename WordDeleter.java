
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
    private File file;
    
    public WordDeleter(JTable t)
    {
        table = t;
        file = TxtOpener.getCurrentFile();
        deleteWord();
    }
    
    public void deleteWord()
    {
        //get the words from the selected row
        int row = table.getSelectedRow();
        String conword = table.getModel().getValueAt(row, 0).toString(); 
        String translation = table.getModel().getValueAt(row, 1).toString();
        
        //create a temporary file to put the changes
        File tempFile = new File("temp.txt");
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            
            String lineToRemove = conword + "\t\t" + translation;
            String cLine; boolean first = true;
            
            while((cLine = reader.readLine()) != null)
            {
                String tLine = cLine.trim();
                if(tLine.equals(lineToRemove)) continue;
                //prepend line separator except the first line
                if(first)
                {
                    if(tLine.equals(lineToRemove)) continue;
                    writer.write(cLine);
                    first = false;
                }
                else
                {
                    //toss everything into the temporary file
                    writer.write(System.getProperty("line.separator") + cLine);
                }
            }
            
            writer.close();
            reader.close(); 
            
            file.delete();
            //rename the temporary file to the original
            if(tempFile.renameTo(file))
                System.out.println("File renamed to " + file.getName());
            else
                System.out.println("Could not rename file");
                
            //update table
            System.out.println(tempFile.getName() + " " + file.getName());    
            String[][] words = TableOrganizer.organizeWords(file.getAbsolutePath());
            
            Window.dtable.setDataVector(words, Window.tableNames);
            Window.wordTable.setModel(Window.dtable);
        }
        catch(Exception e)
        {
            System.out.println("\\o~o/ " + e.getMessage());
        }
    }
}
