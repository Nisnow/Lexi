
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
        /*0 = conlang; 1 = translation b.c. I didn't want to write the same
        funcion twice :P*/
        int col = 0;
        if(e.getSource() == Window.alphabetizeButton_2) col = 1; 
        
        try
        {
            Alphabetizer a = new Alphabetizer(col);
            a.sortWords();
        }
        catch(Exception exc)
        {
            System.out.println("There's nothing open, ya dingus. " + exc.getMessage());
        }
    }
}
