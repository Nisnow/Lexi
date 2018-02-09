
/**
 * Write a description of class AlphabetListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.event.*;

public class AlphabetListener implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        //TODO: e.getSource() == one of the buttons
        int row = 0;
        //sort by translation
        if(e.getSource() == Window.alphabetizeButton_2) row = 1; 
        
        try
        {
            Alphabetizer a = new Alphabetizer(row);
            a.sortWords();
        }
        catch(Exception exc)
        {
            System.out.println("There's nothing open, ya dingus. " + exc.getMessage());
        }
    }
}
